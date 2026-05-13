package ar.com.educacionit.test;

import ar.com.educacionit.entidades.Cliente;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02");
		
		Cliente c1 = null;
		System.out.println(c1);
		c1 = new Cliente();
		
		System.out.println(c1.toString());
		
		c1.presentarse(); // Como Cliente está en 
		// otro paquete necesito que el método presentarse
		// tenga visibilidad (público)
		
		Cliente c2 = new Cliente(1, "Maxi", "max@gmail.com");
		
		Cliente c3 = new Cliente(2, "Juliana", "juliana@gmail.com", false);

		System.out.println(c2);
		System.out.println(c3);
		
	}

}
