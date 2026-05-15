package ar.com.educacionit.entidades;

public class Corazon {
	
	private int latidosPorMinuto;
		
	// Constructor default
	public Corazon() {	}

	// Constructor parametrizado
	public Corazon(int latidosPorMinuto) {

		this.latidosPorMinuto = latidosPorMinuto;
	}

	// this --> hace referencia al atributo de instancia de la clase creada.
	public void latir() {
		System.out.println("El corazón late  a: " + this.latidosPorMinuto + "bpm");
	}

	// Métodos Getters and Setters
	public int getLatidosPorMinuto() {
		return latidosPorMinuto;
	}

	public void setLatidosPorMinuto(int latidosPorMinuto) {
		this.latidosPorMinuto = latidosPorMinuto;
	}

	@Override
	public String toString() {
		return "Corazon [latidosPorMinuto=" + latidosPorMinuto + "]";
	}
	
	
}
