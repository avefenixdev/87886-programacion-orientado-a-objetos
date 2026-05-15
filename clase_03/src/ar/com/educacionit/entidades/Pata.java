package ar.com.educacionit.entidades;

public class Pata {
	
	String posicion;
	boolean funcional;
	
	// Constructor default
	public Pata() {	}

	// Constructor parametrizado
	public Pata(String posicion, boolean funcional) {
		super();
		this.posicion = posicion;
		this.funcional = funcional;
	}

	void apoyar() {
		if ( funcional ) {
			System.out.println("Pata " + this.posicion + "apoyando");
		} else {
			System.out.println("Pata " + this.posicion + "lesionada");
		}
	}

	@Override
	public String toString() {
		return "Pata [posicion=" + posicion + ", funcional=" + funcional + "]";
	}
	
}
