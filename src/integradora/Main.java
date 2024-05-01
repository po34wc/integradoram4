package integradora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int userChoice;
		Boolean bolControl = true;
		Scanner input = new Scanner(System.in);
		
		
		Cuenta cuenta = new Cuenta(0.0);
		
		while (bolControl) {
			userChoice= menu(input);
			
			switch (userChoice) {
			case 1:
				System.out.println("Saldo disponible (CL$): " + cuenta.mostraSaldo());
				break;
			case 2:
				cuenta.realizarDeposito();
				break;
			case 3:
				cuenta.realizarRetiro();
				break;
			case 4:
				break;
			case 5:
				System.out.println("FIN");
				bolControl = false;
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Debe presionar un número entre 1 y 4");
				break;
			}
		}
	}
	
	public static int menu(Scanner input) {
		int intSelection;
		String texto = "\r\n"
				+ "1. Ver saldo disponible.\r\n"
				+ "2. Realizar depósito.\r\n"
				+ "3. Retirar fondos.\r\n"
				+ "5. Salir.\r\n"
				+ "Escriba el número de la opción deseada.";
		System.out.println(texto);
		
		intSelection = input.nextInt();
		
		return intSelection;
	}
}
