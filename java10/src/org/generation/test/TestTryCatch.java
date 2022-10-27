package org.generation.test;

import org.generation.entity.Division;

public class TestTryCatch {

	public static void main(String[] args) {
		/**
		 * Un excepción es una situación inesperada
		 * durante la ejecución de un programa.
		 * 
		 * Existen dos tipos de excepciones.
		 * 
		 * A) Checked Exceptions o Excepciones que se heredan 
		 *  de la clase Exception.
		 *  Las excepciones de este tipo se tiene que declar en
		 *  la firma del método o bien usar los bloques try-catch.
		 * B) Unchecked Exceptions o Excepciones que se heredan de la 
		 *  clase RunTimeExceptions no se está obligado a procesarlas.
		 *  Es opcional el uso de los bloques try-catch.
		 *  
		 * Las excepciones de tipo Error, son arrojadas por la JVM.
		 * Estos son errores de los que no nos podemos recuperar.
		 * Por ejemmplo: un desbordiento en la memoria.
		 * 
		 * El stacktrace de una excepción es el conjunto de
		 * mensajes de error desde el origin del error hasta la última
		 * clase que recibe el error. 
		 * 
		 */
		
		Division div = new Division();
		
		
		System.out.println("El resultado es: " + div.divisionByCero(5));
		
		System.out.println("Este es el fin del programa");

	}

}
