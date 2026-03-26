package Encapsulacion;

public class Persona {
	
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String nom, String ape, int ed) {
		nombre = nom;
		apellido = ape;
		edad = ed;
	}
	
	public void mostrar () {
		System.out.println("NOMBRE: " + nombre + " " + apellido + " | EDAD: " + edad);
	}
	
}
