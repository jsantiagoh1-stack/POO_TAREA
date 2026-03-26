package Encapsulacion;

public class Fecha {
	int dia;
	int mes;
	int anio;

	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		anio = a;
	}
	
	public boolean esValida() {
		if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrar() {
	System.out.println("FECHA: " + dia + "/" + mes + "/" + anio);
	}

}
