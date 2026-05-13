package ar.com.educacionit.entidades;

import java.util.Arrays;

public class AutoRelacion {
	
	// Atributos/propiedades
	
	String marca;
	String color;
	String modelo;
	int velocidad;
	// Relación simple
	Motor motor; // tipo de dato clase	
	// Relación multiple
	Rueda ruedas[]; // Colección ruedas // [] <--- array de ruedas
	

	// Constructor parametrizado
	
	public AutoRelacion(String marca, String color, String modelo, int velocidad, Motor motor) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = motor;
	}
	
	public AutoRelacion(String marca, String color, String modelo, int velocidad, Motor motor, Rueda[] ruedas) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = motor;
		this.ruedas = ruedas;
	}
	
	public AutoRelacion(
			String marca, String color, String modelo, 
			int velocidad, int cilindrada, int caballos, 
			String combustible) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = new Motor(cilindrada, caballos, combustible);
	}
	
	// Sobrecargamos el método acelerar
	// Diferentes firmas igual nombre de método
	
	// public void acelerar() != public void acelerar(int velocidad)

	public void acelerar() {
		this.velocidad = 10;
	}
		
	
	public void acelerar(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar(int velocidad, boolean nitro) {
		if ( nitro ) {
			this.velocidad = velocidad * 2;
		} else {
			this.velocidad = velocidad;
		}
	}


	
	// Sobrescribimos el método toString()

	@Override
	public String toString() {
		return "AutoRelacion [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velocidad=" + velocidad
				+ ", motor=" + motor + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
}
