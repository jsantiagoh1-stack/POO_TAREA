package Encapsulacion;

public class Cuenta {
	String titular;
	double saldo;
	
	public Cuenta (String tit, double saldoInicial) {
		titular = tit;
		saldo = saldoInicial;
	}
	public void depositar(double monto) {
		if (monto > 0) {
			saldo = saldo + monto;
			System.out.println("SE DEPOSITARON Q " + monto + " A " + titular);
		}
	}
	
	public void retirar(double monto) {
		if (monto > saldo ) {
			System.out.println("ERROR:SALDO INSUFICIENTE PARA RETIRAR Q " + monto );
		} else if (monto > 0) {
			saldo = saldo - monto;
			System.out.println("SE RETIRARON Q" + monto + " DE " + titular);
		}
	}
	
	public void mostrarSaldo() {
		System.out.println("TITULAR: " + titular + " | SALDO FINAL : Q" + saldo); 
		
	}

}
