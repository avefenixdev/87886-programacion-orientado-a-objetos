package ar.com.educacionit.entidades;

public abstract class Persona {

	// Atributos (propiedades)
	// de INSTANCIA
	private String nombre;
	private int edad;
	// Atributos de Clase
	private static int contadorPersona = 0;
	
	// Método de clase
	public static int getContadorPersona() {
		return contadorPersona;
	}
	
	
	// Método Constructor (parametrizado)
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		// Cada vez que se cree una instancia se incrementar el contador
		contadorPersona++;
		// Que si quiero acceder a una atributo de 
		// instancia. uso el this.
		// Cuando quiero acceder a una atributo de 
		// clase (estatico, no uso this)
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
