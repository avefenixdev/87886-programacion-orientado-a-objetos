package ar.com.educacionit.entidades;

public abstract class Persona {

	// Atributos (propiedades)
	private String nombre;
	private int edad;
	
	
	// Método Constructor (parametrizado)
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Métodos getters
	
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}
	
	// Método abstracto
	public abstract String getRol();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
