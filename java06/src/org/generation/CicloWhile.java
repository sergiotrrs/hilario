package org.generation;

import java.util.Scanner;

public class CicloWhile {
	static final int NOMBRE_CH = 18;
	
	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * while(condicion) instruccion;
		 * 
		 * while(condicion){ instrucciones; }
		 */

		int contador = 0;
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("\n¿Quieres comer pan  (simon/nel) ?  "); String respuesta =
		 * (sc.next()).toLowerCase();
		 * 
		 * while( respuesta.equals("simon") ) { System.out.println("Llevas comiendo " +
		 * ++contador + " panes");
		 * 
		 * if(contador>6) System.out.println("(Ya déjale a los demás)");
		 * 
		 * System.out.print("\n¿Quieres comer pan  (simon/nel) ?  "); respuesta =
		 * (sc.next()).toLowerCase(); } System.out.println("Termina la oferta");
		 */
		/**
		 * Sintaxis do while
		 * 
		 * do{
		 * 
		 * }while(condicion);
		 */
		String respuesta;
		do {
			System.out.println("Llevas comiendo " + ++contador + " panes");
			System.out.print("\n¿Quieres comer pan  (simon/nel) ?  ");
			respuesta = (sc.next()).toLowerCase();
		} while (respuesta.equals("simon"));
		
		System.out.println("Termina la oferta");
		
		//break, continue;
		boolean bandera= true;
		byte nIteraciones = 10;
		while(bandera) {
			System.out.println(nIteraciones--);
			if(nIteraciones == 5)break;
		}
		
		/**
		 * Comenzar con $10,000
		 * 
		 * Hacer un menú telefónico
		 *  Opción 1: retirar dinero (restar la cantidad)
		 *  Opción 2: hacer depósitos
		 *              ¿Dónde deseo depositar?
		 *  			opción 1: cuenta de cheques (sumar la cantidad)
		 *  			opcion 2: tarjeta de crédito (restar la cantidad)
		 *  			opción 3: cuenta de terceros (restar la cantidad)
		 *  Opción 3: estado de cuenta (indicar la cantidad)
		 *  Opción 4: quejas (No te contestas y te cuesga la llamada)
		 *  opción 7: hablar con un asesor
		 *  Opción 9: salir del cajero
		 *  Opción desconocida: indica el error y vuelve a preguntar,
		 *  					Si se equivoca 3 veces seguidas, se cuelga la llamada.
		 *  
		 *  Indicar la cantidad final del cliente
		 *   
		 */
		int edad = 123;
		// los datos primitivos no tiene propiedades, ni métodos
		Integer edad2 = 123;
		String valorString = edad2.toString();
		
		long dato = 256L;  // 0000 0000 ... 0000 0000 0000 0000 0000 0000 0000 0001 0000 0000
		byte datoDuplicado = (byte) dato;
		// caracteres válidos a-z, _ , $, 0-9
		// Números no se pueden al inicio
		// int NUM_VUELTAS = 4;
		
		
	}

}
