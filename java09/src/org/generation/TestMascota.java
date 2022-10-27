package org.generation;

public class TestMascota {

	public static void main(String[] args) {
				
		 /*Mascota hilario;		 
		 hilario = new Mascota();
		 hilario.name = "Hilario";		 
		 hilario.ageInYears = 1;
		 hilario.SizeInCm = 30;
		 hilario.type = "Felino"; */

		 //System.out.println("N. De mascotas: " + Mascota.numPets);
		System.out.println(Mascota.nPets());
		 
		 Mascota hilario = new Mascota("Hilario", 1, 30);
		 Mascota periquita = new Mascota("Periquina", .5, 6);
		 hilario.type = "felino";
		 
		 System.out.println("N. De mascotas: " + Mascota.numPets);
		 System.out.println("La mascota de Fer es " + hilario.information() );
		 System.out.println("La mascota de Guadalupe es " + periquita.information() );
		 
		 Mascota alf = new Mascota();
		 System.out.println("La casi-mascota de Anahi es: " + alf.information());
		 //name: null   age: 0  type: no definido  size: 0 
		 Mascota tommy = new Mascota("Tommy");
		 System.out.println("La mascota de Lalo es: " + tommy.information());
		 
		 System.out.println("N. De mascotas: " + Mascota.numPets);
		 /**
		  * Hacer una clase de lo que gusten y hacer las pruebas de esa clase
		  * Debe tener como mínimo:
		  *  - 3 atributos de instancia.
		  *  - 1 atributo de clase.
		  *  - 2 constructores.
		  *  - 2 métodos.
		  *  
		  * Pruebas:
		  * - Creación de 3 objetos.
		  * - Imprimir los datos completos (atributos de instancia).
		  * - Llevar la contabilidad de los objetos creados.
		  * Terminamos a las 12
		  */
	}

}
