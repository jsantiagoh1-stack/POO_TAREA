package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======== INICIANDO TAREAS ========");
		
		//CLASE PERSONA
		System.out.println("\n--- 1. CLASE PERSONA ---");
	
		Persona p1 = new Persona ("MARIO", "BROS", 28);
		Persona p2 = new Persona ("LUIGUI", "GARCIA", 26);
		Persona p3 = new Persona ("JOSE", "MOI", 23);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();

	}

}
