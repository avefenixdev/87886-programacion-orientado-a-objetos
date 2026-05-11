package ar.com.educacionit.entidades;

public class Alumno {

	// Atributos (caracteristicas)
	String nombre;
	String legajo;
	
	// Constructor por defecto
	public Alumno() {
		this.nombre = "Sin nombre";
	}
	
	// Constructor parametrizado
	public Alumno(String nombre, String legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	// Métodos (acciones)
	public void saludar() {
		System.out.println("Hola soy " + nombre);
	}

	// Sobreescribi el toString que
	// heredaba de Object
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", legajo=" + legajo + "]";
	}

	
	
	
	

}
