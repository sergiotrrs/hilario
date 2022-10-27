package org.generation;

import java.util.ArrayList;

public class ArrayListConcepto {

	public static void main(String[] args) {
		/**
		 * Un List es una colección ordenada, en la que se
		 * permiten elementos duplicados.
		 * Se basa en un array redimensionable que crece su tamaño
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis;
		 *    ArrayList<object> varName;
		 */
		
		//Definimos una colección de tipo String
		ArrayList<String> isbn = new ArrayList<String>();
		ArrayList<String> nombreLibros = new ArrayList<String>();
		
		//Agregamos valoes al arreglo
		nombreLibros.add("Matilda"); //indice 0 es el primer elemento
		nombreLibros.add("Harry Potter");
		nombreLibros.add("El túnel"); //indice 2
		nombreLibros.add("El último deseo");
		nombreLibros.add("Psicoanalista");
		nombreLibros.add("El túnel"); //indice 5
		nombreLibros.add("Quiúbole con...");
		System.out.println(nombreLibros);
		
		//Desplegamos el tamaño de la colección
		int size = nombreLibros.size();
		System.out.println("Total de libros: " + size);
		
		//Mostramos solamente el libro El túnel
		String elTunelNombre = nombreLibros.get(2);
		System.out.println("Miros recomienda : " + elTunelNombre);
		
		//Removemos un elemento de la colección
		nombreLibros.remove(4);
		
		//Iterar elemntos en la colección
		for (int i = 0; i< nombreLibros.size(); i++)
			System.out.println("Mi regalo de navidad es: " + nombreLibros.get(i));
		
		for (String libro : nombreLibros)
			System.out.println("Libro: " + libro);
		
		//Reemplazar un elemento de la colección
		nombreLibros.set(2, "El Túnel, versión tía de Miros");
		
		//Iterar la colección con forEach
		nombreLibros.forEach( libro -> System.out.println(libro));
		
	
		

	}

}
