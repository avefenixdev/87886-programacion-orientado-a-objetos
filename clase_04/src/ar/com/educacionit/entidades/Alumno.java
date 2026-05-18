package ar.com.educacionit.entidades;

public class Alumno extends Persona {

	// Atributos (Propiedades)
	private int legajo;
	// Atributo estático
	private static int contadorAlumno = 0;
	// Método estático
	public static int getContadorAlumno() {
		return contadorAlumno;
	}
	
	
	// Constructor paremtrizado sin legajo
	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		
		incrementarContadorAlumno();
	}
	
	// Constructor paremtrizado con legajo	
	public Alumno(String nombre, int edad, int legajo) {
		super(nombre, edad); // Instancio una persona
		this.legajo = legajo;
		
		incrementarContadorAlumno();
	}
	
	private static void incrementarContadorAlumno() {
		contadorAlumno++;
	}
	
	// Métodos getters y setters
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	// Alumno es una clase concreta que necesita del 
	// método getRol funcional
	// Sobrescritura del método abstracto de Persona
	@Override
	public String getRol() {
		return "Alumno";
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
