package ar.com.educacionit.entidades;

public class Cliente {
	
	// Atributos
	int id; // DNI del cliente
	String nombre;
	String email;
	boolean activo = true;

	// Métodos
	
	// Métodos Constructor (Alt + Shift + S) || Sobrecarga de costructor
	// Constructor default
	public Cliente() {}
	// Constructor parametrizado
	public Cliente(int id, String nombre, String email) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}
	public Cliente(int id, String nombre, String email, boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.activo = activo;
	}
	


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
