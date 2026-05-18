package ar.com.educacionit.test;

import ar.com.educacionit.entidades.Alumno;
import ar.com.educacionit.entidades.Docente;
import ar.com.educacionit.entidades.Materia;
import ar.com.educacionit.entidades.Persona;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 04");
		
		// CLASES ABSTRACTAS
		// Básicamente le indicamos a otro desarrollador 
		// que la clase Persona no es instanciable.
		// Persona p1 = new Persona("Maxi", 22);
		
		Alumno alum1 = new Alumno("Juan", 22);
		System.out.println(alum1);
		alum1.setLegajo(22222);
		System.out.println(alum1);
		
		Alumno alum2 = new Alumno("Ana", 21, 33333);
		System.out.println(alum2);
		
		Docente d1 = new Docente("Roberto", 40, "Programación");
		System.out.println(d1);
		
		Docente d2 = new Docente("Sabrina", 38, "Ingles");
		System.out.println(d2);
		
		Materia m1 = new Materia("Java Básico", d1);
		Materia m2 = new Materia("Inglés técnico", d2);
		System.out.println(m1);
		System.out.println(m2);
		
		
		
		
		
		
		

	}

}
