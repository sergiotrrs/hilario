package org.generation.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Mongo")
public class ConexionMongoDB implements IConexionDB {

	@Override
	public String registrar(String nombre) {		
		return "Mongo DB registra a " + nombre;
	}

}
