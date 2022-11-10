package org.generation.service;

import org.generation.repository.ConexionMySQL;
import org.generation.repository.IConexionDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RegistroService implements IRegistroService {

	//private IConexionDB conexionDB = new ConexionMySQL();
	// SpringBoot buscará una instancia definida por algún estereotipo (@Service, @Repository )
	@Autowired
	@Qualifier("Mongo")
	private IConexionDB conexionDB;
	
	@Override
	public String usoDB(String nombre) {
		
		return conexionDB.registrar(nombre);
	}

}
