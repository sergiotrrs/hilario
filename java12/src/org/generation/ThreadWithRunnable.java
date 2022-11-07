package org.generation;

class MyThread  implements Runnable {
	private String name;
	
	
	public MyThread(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {		
		return Thread.currentThread().getId();
	}
	
	@Override
	public void run() {
		System.out.printf("%nHilo iniciado: %s - ID: %d", this.getName(), this.getId());

		try {
			for (int i = 1; i < 6; i++) {
				Thread.sleep(1000);// estamos suspendiendo el hilo por un tiempo
				System.out.printf("%nEl %s cuenta %d", this.getName(), i);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.printf("%nHilo finalizado: %s - ID: %d", this.getName(), this.getId());

		
	}

}

public class ThreadWithRunnable {

	public static void main(String[] args) {
		MyThread myThread = new MyThread("#1");		
		
		Thread hilo01 = new Thread( myThread );
		Thread hilo02 = new Thread( new MyThread("#2") );
		Thread hilo03 = new Thread( new MyThread("#3") );
		hilo01.start();
		hilo02.start();
		hilo03.start();			
		
	}
}
