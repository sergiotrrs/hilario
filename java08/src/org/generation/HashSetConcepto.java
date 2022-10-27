package org.generation;

import java.util.HashSet;

public class HashSetConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ordenada de elementos.
		 * No se permiten elemtos duplicados
		 * Por lo que cualquier elementos duplicado no se insertará.
		 */
		
		//Definimos una colección HashSet
		HashSet<String> paises = new HashSet<String>();
		
		//Agregamos valores a la colección
		paises.add("Genovia");
		paises.add("México");
		paises.add("Alemania");
		paises.add("Yibuti");
		paises.add("Wakanda");
		paises.add("Yemen");		
		paises.add("Alemania"); //Elemento duplicado
		
		System.out.println(paises);
		
		//Desplegamos el tamaño de la colección
		System.out.println("N. de paises = " + paises.size());
		
		//Verificar si un elemento existe en la colección
		boolean paisExistente =  paises.contains("Yibuti");
		System.out.println("Existe Yibuti: " + paisExistente);
		
		//Removemos un elemento
		paises.remove("Yibuti");
		System.out.println(paises);
		
		//Iteramo la colección
		paises.forEach(pais -> System.out.println(pais));

		for (String pais : paises)
			System.out.println("Pais: " + pais);
		
		
		
	}

}
