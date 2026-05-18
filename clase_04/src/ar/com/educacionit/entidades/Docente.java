package ar.com.educacionit.entidades;

public class Docente extends Persona {
	
	// Atributo (Propiedades)
	private String especialidad;

	// Constructor parametrizado 
	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad); // constructor del padre (constructor de Persona)
		this.especialidad = especialidad;
	}
	
	// Métodos Getters y Setters
	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public String getRol() {
		return "Docente";
	}

	@Override
	public String toString() {
		return "Docente [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
	

}
