package org.generation;

public class OperacionesMath {
	/**
	 * Sintaxis de las funciones
	 * 
	 *  <modificador de acceso> <tipoRetorno> nombreMetodo (<parametros>){
	 *        
	 *        <cuerpo de la función>
	 *        instrucciones;
	 *  
	 *  }
	 */
	
	/**
	 * Suma dos números enteros y envia el resultado en consola.
	 * @param a sumando 1
	 * @param b sumando 2
	 */
	void sumaEnterosSinRetorno(int a, int b) {
		System.out.println("La suma de "+ a +" y " + b  + " : " + (a+b)) ;
	}
	
	/**
	 * Suma dos números enteros y retorna el resultado
	 * @param a sumando 1
	 * @param b sumando 2
	 * @return resultado de a + b
	 */
	int sumaEnteros(int a, int b) {
		sumaEnterosSinRetorno(a,b);
		return a+b;
	}
	
	/**
	 * Valor de PI por 2
	 * @return PI*2
	 */
	double piPorDos() {
		//Math mathJava = new Math(); No se necesita instanciar la clase
		return Math.PI*2;
	}
	
	/**
	 * Valor de PI entre 2
	 * @return pi/2;
	 */
	static double piEntreDos(){
		return Math.PI/2;
	}
	

}
