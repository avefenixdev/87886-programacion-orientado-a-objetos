package ar.com.educacionit.entidades;

public class Pata {
	
	private String posicion;
	private boolean funcional;
	
	
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
			System.out.println("Pata " + this.posicion + " apoyando");
		} else {
			System.out.println("Pata " + this.posicion + " no funcional");
		}
	}
	
	// Métodos Getters and Setters
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isFuncional() {
		return funcional;
	}

	public void setFuncional(boolean funcional) {
		this.funcional = funcional;
	}


	@Override
	public String toString() {
		return "Pata [posicion=" + posicion + ", funcional=" + funcional + "]";
	}
	
}
