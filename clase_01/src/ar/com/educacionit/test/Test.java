package ar.com.educacionit.test;

//import ar.com.educacionit.entidades.Alumno;
//import ar.com.educacionit.entidades.Pizza;
import ar.com.educacionit.entidades.*;

public class Test {

	public static void main(String[] args) {
		// Punto de entrada de la aplicación JAVA
		System.out.println("Hola mundo!"); // syso + ctrl + espaciadora + enter
		
		
		// A partir de una clase
		// Un objeto
		// Crear una instancia de una clase
		// Instanciar una clase
		// new es una palabra reservada que nos permite
		// crear a partir de la clase una instancia
		Alumno a1 = new Alumno("Luis", "2-44343-6");
		System.out.println(a1.toString());
		
		System.out.println(new Alumno("Pedro", "5-434243-6").toString());
		
		Alumno a2;
		a2 = new Alumno("Laura", "4-343673-6");
		System.out.println(a2.toString());
		
		Alumno a3 = new Alumno("Ana", "6-34243-3");
		// Es un objeto o una instancia de una clase
		Alumno a4 = new Alumno("Roberto", "1-343444-3");
		System.out.println(a3);
		System.out.println(a4);
		
		Alumno a5 = new Alumno();
		System.out.println(a5);
		
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	
		a1.saludar();
		a2.saludar();
		a3.saludar();
		
		// Cree a partir de la clase 2 objetos
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		Pizza p3 = new Pizza("Muzza", "Grande", "Harina, Agua, Sal, Salsa de tomate, Queso, Aceitunas, Oregano, Aceite", "18000");
		System.out.println(p3);
		
	}

}
