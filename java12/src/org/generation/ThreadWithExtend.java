package org.generation;

class MiHilo extends Thread {
	
	public MiHilo(String nombreHilo) {
		super(nombreHilo);
	}
	
	@Override
	public void run() {
		System.out.printf("%nHilo iniciado: %s - ID: %d", this.getName(), this.getId() );
		
	}
	
}


public class ThreadWithExtend {
	public static void main(String[] args) {
		System.out.println("Multihilo con herencia");
		System.out.println("Número de ID del método main :" + Thread.currentThread().getId());
		
		MiHilo hilo01 = new MiHilo("#1");
		MiHilo hilo02 = new MiHilo("#2");
		MiHilo hilo03 = new MiHilo("#3");
		
		hilo01.start(); 
		hilo02.start(); 
		hilo03.start(); 
		
		
		
		
	}
}
