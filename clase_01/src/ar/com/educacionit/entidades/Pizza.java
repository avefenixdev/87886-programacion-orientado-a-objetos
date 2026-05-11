package ar.com.educacionit.entidades;

public class Pizza {
	
	short id;
	String nombre;
	String tamanio;
	String ingredientes;
	String precio;
	
	
	// Constructor por defecto
	public Pizza() {
		this.id = 9999;
	}
	
	// Constructor parametrizado
	public Pizza(String nombre, String tamanio, String ingredientes, String precio) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.ingredientes = ingredientes;
		this.precio = precio;
	}

	// Sobreescribi el método toString de Object
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nombre=" + nombre + ", tamanio=" + tamanio + ", ingredientes=" + ingredientes
				+ ", precio=" + precio + "]";
	}
	
	
	

}
