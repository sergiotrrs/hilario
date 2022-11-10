package org.generation;

import org.generation.service.IRegistroService;
import org.generation.service.RegistroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02InjeccionDependenciasApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(Spring02InjeccionDependenciasApplication.class);
	
	@Autowired
	private IRegistroService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring02InjeccionDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Holis");
		LOG.info("Holi con estilo");
		LOG.warn("Holis con warning =O");
		LOG.error("Holi enojado ~~ ");	
		LOG.info( service.usoDB("Pandita Rockera") );
		
	}

}
