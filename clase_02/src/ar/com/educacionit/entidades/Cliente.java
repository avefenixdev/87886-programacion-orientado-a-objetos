package ar.com.educacionit.entidades;

public class Cliente {
	
	// Atributos
	int id; // DNI del cliente
	String nombre;
	String email;
	boolean activo = true;

	// Métodos
	
	// Métodos Constructor
	
	// Método presentarse
	public void presentarse() {
		System.out.println("¡Hola tarolas!");
	}
	
	// Método toString (Sobreescribir de Object)
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", activo=" + activo + "]";
	}


}
