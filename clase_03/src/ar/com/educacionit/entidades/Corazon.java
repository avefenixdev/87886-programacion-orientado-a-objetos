package ar.com.educacionit.entidades;

public class Corazon {
	
	int latidosPorMinuto;
		
	// Constructor default
	public Corazon() {	}

	// Constructor parametrizado
	public Corazon(int latidosPorMinuto) {

		this.latidosPorMinuto = latidosPorMinuto;
	}

	// this --> hace referencia al atributo de instancia de la clase creada.
	void latir() {
		System.out.println("El corazón late  a: " + this.latidosPorMinuto + "bpm");
	}


	@Override
	public String toString() {
		return "Corazon [latidosPorMinuto=" + latidosPorMinuto + "]";
	}
	
	
}
