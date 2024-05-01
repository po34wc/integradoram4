package integradora;

public class Saldo {
	private int saldoDisponible;

	/**
	 * @param saldoDisponible
	 */
	public Saldo(int saldoDisponible) {
		super();
		this.saldoDisponible = saldoDisponible;
	}

	public void mostraSaldo() {
		System.out.println("saldo disponible: " + this.saldoDisponible);;
	}
	
	/**
	 * @return the saldoDisponible
	 */
	public int getSaldoDisponible() {
		return saldoDisponible;
	}

	/**
	 * @param saldoDisponible the saldoDisponible to set
	 */
	public void setSaldoDisponible(int saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
}
