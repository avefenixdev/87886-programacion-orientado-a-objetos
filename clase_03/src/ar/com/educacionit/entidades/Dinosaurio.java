package ar.com.educacionit.entidades;

import java.util.ArrayList;

public class Dinosaurio {
	
	// Atributos (Siempre privados -> hay excepción)
	public String nombre; // (-)
	public String especie; // (-)
	public boolean esCarnivoro; // (-)
	public Corazon corazon; /* relación simple */ // (-)
	public ArrayList<Pata> patas; /* relación multiples */ // (-)
	
	public Dinosaurio() {}

	// Constructor parametrizado
	public Dinosaurio(String nombre, String especie, boolean esCarnivoro, Corazon corazon, ArrayList<Pata> patas) {
		this.nombre = nombre;
		this.especie = especie;
		this.esCarnivoro = esCarnivoro;
		this.corazon = corazon;
		this.patas = patas;
	}

	// Método
	
	

	void comer() {
		
	}
	
	void rugir() {
		
	}
		
	void caminar() {
		
	}
	
	@Override
	public String toString() {
		return "Dinosaurio [nombre=" + nombre + ", especie=" + especie + ", esCarnivoro=" + esCarnivoro + "]";
	}
	

}
