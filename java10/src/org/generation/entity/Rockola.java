package org.generation.entity;

import java.util.HashMap;

public class Rockola {
	private int idCancion;
	private String nombre;	
	private int creditosDisponibles;
	private HashMap<Integer, Cancion> canciones;
	{
	this.idCancion = 0;
	this.nombre= "";
	this.creditosDisponibles=0;
	this.canciones = new HashMap<Integer, Cancion>();
	}
		
	
	public Rockola(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCanciones(Cancion cancion) {
		canciones.put(++idCancion, cancion);
	}
	
	public HashMap<Integer, Cancion> getCanciones(){
		return canciones;
	}
	
	public String listaCompletaCanciones() {
		StringBuilder builder = new StringBuilder();		
		for(int idCancion : canciones.keySet()) 	     // 1: Sapito (3.50)
			builder.append( String.format("%n%03d:%n%s", idCancion, canciones.get(idCancion)) );
		// `Messaje ${varibale} ` 
		return builder.toString();		
	}
	

}
