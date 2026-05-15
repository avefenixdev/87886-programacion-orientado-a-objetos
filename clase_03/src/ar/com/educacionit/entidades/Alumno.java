package ar.com.educacionit.entidades;

public class Alumno extends Usuario {
	
	private String legajo;
	
	public Alumno(String nombre, String correo, String legajo) {
		super(nombre, correo); // Se crea instancia usuario
		this.legajo = legajo;
	}

	
	public void inscribirseCurso() {
		// System.out.println(super.nombre + " se inscribió a un curso");
		System.out.println(super.getNombre() + " se inscribió a un curso");
	}
	
	
	

}
