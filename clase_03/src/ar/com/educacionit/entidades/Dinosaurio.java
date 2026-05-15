package ar.com.educacionit.entidades;

import java.util.ArrayList;

public class Dinosaurio {
	
	// Atributos (Siempre privados -> hay excepción)
	private String nombre; // (-)
	private String especie; // (-)
	private boolean esCarnivoro; // (-)
	private Corazon corazon; /* relación simple */ // (-)
	private ArrayList<Pata> patas = new ArrayList<Pata>(); /* relación multiples */ // (-)
	
	public Dinosaurio() {}
	
	// Constructor parametrizado
	public Dinosaurio(String nombre, String especie, boolean esCarnivoro, Corazon corazon) {
		this.nombre = nombre;
		this.especie = especie;
		this.esCarnivoro = esCarnivoro;
		this.corazon = corazon;
	}
	
	// Constructor parametrizado
	public Dinosaurio(String nombre, String especie, boolean esCarnivoro, Corazon corazon, ArrayList<Pata> patas) {
		this.nombre = nombre;
		this.especie = especie;
		this.esCarnivoro = esCarnivoro;
		this.corazon = corazon;
		System.out.println(this.patas);
		this.patas = patas;
		System.out.println(this.patas);
	}

	// Método
	
	public void agregarPata(Pata pata) {
		patas.add(pata);
	}
	
	public void caminar() {
		System.out.println(this.nombre);
		for (Pata p : patas) {
			p.apoyar();
		}
	}

	void comer() {
		
	}
	
	void rugir() {
		
	}
	
	// Métodos getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre, String rol) {
		// En la realidad el control del rol ocurre en otro lado, no en clase Dinosaurio
		if ( rol == "Admin") {
			this.nombre = nombre;			
		} else {
			System.out.println("No puedes modificar el nombre del dinosaurio");
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isEsCarnivoro() {
		return esCarnivoro;
	}

	// No pueden pasar de hervivoros a carnivoros.
	/* public void setEsCarnivoro(boolean esCarnivoro) {
		this.esCarnivoro = esCarnivoro;
	} */

	public Corazon getCorazon() {
		return corazon;
	}

	public void setCorazon(Corazon corazon) {
		this.corazon = corazon;
	}

	public ArrayList<Pata> getPatas() {
		return patas;
	}

	public void setPatas(ArrayList<Pata> patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		return "Dinosaurio [nombre=" + nombre + ", especie=" + especie + ", esCarnivoro=" + esCarnivoro + ", corazon="
				+ corazon + ", patas=" + patas + "]";
	}
	
	
	

}
