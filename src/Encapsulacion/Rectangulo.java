package Encapsulacion;

public class Rectangulo {
	double base;
	double altura;

	public Rectangulo (double b, double t ) {
		base = b;
		altura = t;
	}
	
	public double area() {
		return base * altura;
	}
	
	public double perimetro() {
		return 2 * ( base + altura );
	}

}
