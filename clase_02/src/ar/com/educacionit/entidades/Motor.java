package ar.com.educacionit.entidades;

public class Motor {
	
	int cilindrada;
	int caballos;
	String combustible;
	
	// Constructor default
	public Motor() {}

	// Constructor parametrizado
	public Motor(int cilindrada, int caballos, String combustible) {
		
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.combustible = combustible;
	}
		
	// Sobreescribimos el toString de Object
	
	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", combustible=" + combustible + "]";
	}
	
	

}