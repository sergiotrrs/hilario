package org.generation.fiesta.test;

class Automovil{
	{ 
		System.out.println("mensaje");
	}
	public Automovil(){
		System.out.println("mensaje");
	}
	
}

class Sedan extends Automovil{
	
	static {
		System.out.println("mensaje");
	}
	
	public Sedan() {
		System.out.println("mensaje");
	}
	
	{
		System.out.println("mensaje");
	}
	
	static {
		System.out.println("mensaje");
	}
	
}

public class Vocho extends Sedan {			
	
	public static void main(String[] args) {
		System.out.println("mensaje");
		new Vocho();
		System.out.println("mensaje");
		/**
		 * Imprimir en consola, en los lugares de System.out.println
		 * la adecuada secuencia: 
		 *   A
		 *   B
		 *   C
		 *   D
		 *   E
		 *   F
		 *   G
		 *   H
		 */
	}

}
