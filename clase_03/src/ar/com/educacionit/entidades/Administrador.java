package ar.com.educacionit.entidades;

public class Administrador extends Usuario {
	
	private boolean isAdministrator;
	
	public Administrador(String nombre, String correo, boolean isAdmin) {
		// Es una palabra reservada que se utiliza en
		// los hijos para llamar al contructor del padre
		super(nombre, correo);
		this.isAdministrator = isAdmin;
	}

	public void crearUsuario() {
		System.out.println("Admin creando usuario...");
	}
	
	
	

}
