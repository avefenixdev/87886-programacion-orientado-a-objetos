package ar.com.educacionit.entidades;

public class Auto {
	
	// Atributos/propiedades
	
	String marca;
	String color;
	String modelo;
	int velocidad;
	
	// Constructor parametrizado
	
	public Auto(String marca, String color, String modelo, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	
	// Sobrescribimos el método toString()
	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
	
	
	
	
}
