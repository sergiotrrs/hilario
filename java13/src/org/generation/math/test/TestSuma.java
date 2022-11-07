package org.generation.math.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.generation.math.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSuma {
	Suma suma;
	
	@BeforeEach
	void inicializar() {
		suma = new Suma();
	}	
	
	@Test
	@DisplayName("Sumatoria de número positivos")
	void testSumaEnteros() {		
		assertEquals(10, suma.sumaEnteros(5, 5)  );
	}

	@Test
	@DisplayName("Sumatoria con un número negativo")
	void testSumaUnNegativo() {		
		assertEquals(8, suma.sumaEnteros(-5, 8)  );
	}

	
	@Test
	@DisplayName("Sumatoria de númers de punto flotante")
	void testSumaFlotante() {		
		assertEquals(0.3, (suma.sumaEnteros(.1F, .2F)), 0.001);  // 0.1+0.2 = 0.3 -> 0.3000000004 	
	}
	
	@Test
	@DisplayName("Verifica si la sumatoria es positiva")
	void isPositive() {		
		assertTrue (  suma.sumaEnteros(3, 4)>0 );
		//assertEquals( true, suma.sumaEnteros(3, 4)>0  );
	}

}
