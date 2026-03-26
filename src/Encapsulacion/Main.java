package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======== POO-TAREAS ========");
		
		//CLASE PERSONA
		System.out.println("\n--- 1. CLASE PERSONA ---");
	
		Persona p1 = new Persona ("MARIO", "BROS", 28);
		Persona p2 = new Persona ("LUIGUI", "GARCIA", 26);
		Persona p3 = new Persona ("JOSE", "MOI", 23);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
		
		//CLASE RECTANGULO
		System.out.println("\n--- 2. CLASE RECTANGULO ---");
		
		Rectangulo r1 = new Rectangulo (5.0, 10.0);
		Rectangulo r2 = new Rectangulo (7.0, 8.0);
		System.out.println("AREA R1: " + r1.area() + " | AREA R2: " + r2.area());
		if (r1.area() > r2.area()) {
            System.out.println("EL RECTANGULO 1 TIENE MAYOR AREA.");
        } else if (r2.area() > r1.area()) {
            System.out.println("EL RECTANGULO 2 TIENE MAYOR AREA.");
        } else {
            System.out.println("TIENEN LA MISMA AREA.");
        }
		
		
		//CLASE PRODUCTO
		System.out.println("\n--- 3. CLASE PRODUCTO ---");
		
		Producto prod1 = new Producto ("B001", "LAPTOP", 1000.0);
		Producto prod2 = new Producto ("B002", "MOUSE", 50.0);
		
		prod1.AplicarDescuento(15.0);
		prod2.AplicarDescuento(10.0);
		
		prod1.mostrarInfo();
		prod2.mostrarInfo();
		
		//CLASE CUENTA
		System.out.println("\n--- 4. CLASE CUENTA ---");
		Cuenta miCuenta = new Cuenta("BYRON", 500.0);
        miCuenta.mostrarSaldo();
        miCuenta.depositar(200.0);
        miCuenta.retirar(800.0); 
        miCuenta.retirar(150.0);
        miCuenta.mostrarSaldo();
        
        //CLASE LIBRO
        System.out.println("\n--- 5. CLASE LIBRO ---");
        Libro l1 = new Libro("EL QUIJOTE", "CERVANTES", 1056);
        Libro l2 = new Libro("EL PRINCIPITO", "SAINT-EXUPERY", 96);
        Libro l3 = new Libro("CIEN AÑOS DE SOLEDAD", "GARCIA MARQUEZ", 417);
        
        l1.mostrar(); System.out.println("¿ES LARGO? " + l1.esLargo());
        l2.mostrar(); System.out.println("¿ES LARGO? " + l2.esLargo());
        l3.mostrar(); System.out.println("¿ES LARGO? " + l3.esLargo());
        
        
        
		
		
		
		

	}

}
