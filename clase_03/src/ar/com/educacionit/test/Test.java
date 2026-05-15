package ar.com.educacionit.test;

import ar.com.educacionit.entidades.Dinosaurio;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03");
		
		Dinosaurio dino1 = new Dinosaurio("T-Rex", "Saurisquios", true, null, null);
		
		// Pilares del paradigma orientado a objetos (visibilidad) -> Encapsulamiento
		// Al colocar los atributos privados no voy a poder ni accederlos, ni modificarlos. 
		
		/* System.out.println(dino1.nombre);
		System.out.println(dino1.especie);
		System.out.println(dino1.esCarnivoro); */
		
		/* dino1.nombre = "Maxi";
		System.out.println(dino1.nombre);
		System.out.println(dino1); */
		
		System.out.println(dino1);
		
		System.out.println(dino1.getNombre());
		dino1.setNombre("Maxi", "estandar");
		System.out.println(dino1.isEsCarnivoro());
		dino1.setNombre("T-REX", "Admin");
		System.out.println(dino1);
		
		
	}

}
