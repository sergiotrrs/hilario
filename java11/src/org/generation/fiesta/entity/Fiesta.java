package org.generation.fiesta.entity;

/**
 * Una interfaz es una declaración formal de un
 * contrato, en la cuál los métodos no contiene
 * implementación alguna, es similar a los métodos
 * abstractos.
 * 
 * Una clase puede implementar muchas interfaces,
 * aunque no tengan relación.
 * 
 * Las clases abstractas se debe utilizar para
 * objetos que estén estrechamente relacionados, mientras
 * que las interfaces son más adecuadas para
 * proporcionar una funcionalidad comun a clases
 * que no entén relacionadas entre si.
 * 
 * Para los patrones de diseño se suelen utilizar interfaces.
 * 
 * @author TuX3
 *
 */
public interface Fiesta {
	/**
	 * Los métodos de una interfaz
	 * ya son de tipo public y abstract
	 * 
	 * y los atributos son de tipo final.
	 */
	
	String invitarPersonas();
	
	String parquearseBotanas();
	
	String comprarBebidas();
	
	String terminarFiesta();
	
	String resumenFiesta();

}
