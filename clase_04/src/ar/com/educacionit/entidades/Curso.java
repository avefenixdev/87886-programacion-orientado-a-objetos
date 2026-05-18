package ar.com.educacionit.entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nombre;
	private List<Alumno> alumnos; // relación múltiples
	private List<Materia> materias; // relación múltiples
	
	// Constructor parametrizado 
	public Curso(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.materias = new ArrayList<Materia>();
	}
	
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public void agregarMateria(Materia materia) {
		this.materias.add(materia);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", alumnos=" + alumnos + ", materias=" + materias + "]";
	}
		

}
