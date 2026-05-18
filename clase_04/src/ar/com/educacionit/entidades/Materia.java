package ar.com.educacionit.entidades;

public class Materia {
	
	// Atributos (propiedades)
	private String nombre;
	private Docente docente; // relación simple
	
	// Método Constructor (Parametrizado)
	public Materia(String nombre, Docente docente) {
		this.nombre = nombre;
		this.docente = docente;
	}
	
	// Getters

	public String getNombre() {
		return nombre;
	}

	public Docente getDocente() {
		return docente;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", docente=" + docente + "]";
	}
		

}
