package org.generation.terreno.test;

import java.util.ArrayList;
import java.util.List;

import org.generation.terreno.entity.Terreno;
import org.generation.terreno.entity.TerrenoBaldio;
import org.generation.terreno.entity.TerrenoConCasa;

public class TestTerreno {

	public static void main(String[] args) {
		//No se puede instanciar Terreno, por que es una clase abstracta.
		//Terreno miNavidad = new Terreno("Abuela", 20, 40, "La abuela");
		//System.out.println(miNavidad);
		
		Terreno miNavidad = new TerrenoConCasa("Abuela", 20, 40, "La abuela");
		System.out.println(miNavidad);
		System.out.println(miNavidad.formaDeObtenerlo());

		Terreno peorEsNada = new TerrenoBaldio("Pero es Nada", 40, 80, "La suegra");
		System.out.println(peorEsNada);
		System.out.println(peorEsNada.formaDeObtenerlo());
		
//		peorEsNada = new TerrenoConCasa("Mi Rancho", 40, 80, "Se lo compre a Sergio");
//		System.out.println(peorEsNada.formaDeObtenerlo());
		
		List<Terreno> misPropiedades;
		misPropiedades = new ArrayList<Terreno>();
		
		misPropiedades.add(peorEsNada);
		misPropiedades.add(miNavidad);
		
		System.out.println("======Como obtuve mis propiedaes===========");
		misPropiedades.forEach(terreno -> System.out.println(terreno.formaDeObtenerlo()));
		
		
		
	}

}
