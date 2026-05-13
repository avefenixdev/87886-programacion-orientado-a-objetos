package ar.com.educacionit.entidades;

public class Rueda {
	
	String marcaRueda;
	int presionAire;
	
	public Rueda() {}

	// Constructor parametrizado
	public Rueda(String marcaRueda, int presionAire) {
		this.marcaRueda = marcaRueda;
		this.presionAire = presionAire;
	}
	
	// Sobreescribo el toString de Object
	@Override
	public String toString() {
		return "Rueda [marcaRueda=" + marcaRueda + ", presionAire=" + presionAire + "]";
	}
	
	
	
	
	

}