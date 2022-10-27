package org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o después de la variable
		 * int[] myArray; int myArray[];
		 * 
		 * Se debe asignar la cantidad de elementos que contendrá el arreglo
		 * Un a ves definido, el arreglo no puedo cambiar su tamaño.
		 */
		int[] codigoColores = new int[3];
		String[] nombreColores = new String[3];
		//System.out.println(codigoColores);
		//System.out.println(nombreColores);
		
		//Para cceder a un elemento, indicamos dentro del corchete
		// el índice del dato, el primer elemento es el indece 0.
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x0000ff; //RGB 0,0,255 -> 00 00 ff
		
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xffff00;
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x000000;
		
		//Iteramos los datos de un arreglo		
		for (int i = 0; i< nombreColores.length; i++) {
			System.out.println("El color fav es: " + nombreColores[i]);
			System.out.println("Y su código RGB es " +  Integer.toHexString(codigoColores[i]));
		}
		
		//nombreColores[3] = "Verde"; //SE crea un errro en tiempo de ejecución
		
		//Otra forma de inicializar un arreglo
		String frutas[] = {"Naranja", "Uva", "Papaya", "Manzana"};
		
		//Para crear una matriz, se indica con doble [][], primer son filas y luego columnas
		String pasteles[][] = new String [4][5];
		
		pasteles[0][1] = "Moka";
		for (int i=0; i< pasteles.length; i++) {
			for (int j=0; j < pasteles[i].length; j++)
				System.out.println("fila " + i + " columna " + j +" : "+ pasteles[i][j]);
		}
		

	}

}
