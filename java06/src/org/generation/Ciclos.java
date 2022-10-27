package org.generation;

public class Ciclos {

	public static void main(String[] args) {
		/**
		 * Sintaxis del ciclo for
		 * 
		 * 	for(inicialización, comparación, expresiónFinal) 
		 * 		instrucción;
		 * 
		 *  for(inicialización, comparación, expresiónFinal){ 
		 * 		instrucciones;			
		 * }
		 * 
		 */
		
		for(int i=0; i<=10; i++ ) {
			for (int j=0; j<=10; j++)
				System.out.println("Valor de i: " + i + " j: " + j);
		}
		//System.out.println("Valor final de i " + i); //La cariable i no tiene alcance
		
		for(int i=10; i>0; i--)
			System.out.println("Cuenta regresiva: " + i);

	}

}
