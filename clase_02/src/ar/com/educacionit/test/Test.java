package ar.com.educacionit.test;

import ar.com.educacionit.entidades.*;

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
		
		System.err.println("-------------------------");
		
		Auto a1 = new Auto("Toyota", "Rosa", "Corola", 0);
		
		Auto a2 = new Auto("Nissan", "Negro", "KAIT", 0);
		
		Auto a3 = new Auto("VW", "Gris", "Gol", 0);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.acelerar();
		
		System.out.println(a1); // 10
		
		a1.acelerar(20);
		
		System.out.println(a1); // 20
		
		a1.acelerar(30, true);
		
		System.out.println(a1); // 60
		
		System.err.println("-------------------------");
		
		Motor m1 = new Motor();
		Motor m2 = new Motor(3, 300, "Nafta");
		
		AutoRelacion ar1 = new AutoRelacion("Ferrari", "Roja", "Testarrosa", 0, m2);
		
		AutoRelacion ar2 = new AutoRelacion("Porsche", "Amarilla", "Carrera 911", 0, 4, 280, "Nafta");
		
		System.out.println(ar1);
		System.out.println(ar2);
		
	}

}
