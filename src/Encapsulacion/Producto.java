package Encapsulacion;

public class Producto {
	String codigo;
	String nombre;
	double precio;
	
	public Producto(String cod, String nom, double pre) {
		codigo = cod;
		nombre = nom;
		precio = pre;
	}
	
	public void AplicarDescuento(double porcentaje) {
		double descuento = precio * (porcentaje / 100);
		precio = precio - descuento;
	}
	
	public void mostrarInfo () {
		System.out.println("CODIGO: " + codigo + "| NOMBRE: " + nombre + "| PRECIO FINAL : Q" + precio);
	}

}
