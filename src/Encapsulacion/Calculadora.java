package Encapsulacion;

public class Calculadora {

	public double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double resta(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) {
		if (num2==0) {
			System.out.println("ERROR: ¡NO SE PUEDE DIVIDIR ENTRE 0!");
			return 0;
		} else {
			return num1 / num2;
		}
	}

}
