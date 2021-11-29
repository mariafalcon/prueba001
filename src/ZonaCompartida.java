
public class ZonaCompartida {
	
	private static int libros;
	private static Object lock = new Object();
	
	
public void productor() {
		
		
		
		synchronized(lock) {
			System.out.println(libros);
			if(libros==0) {
				libros=20;
				lock.notifyAll();
				System.out.println("El productor ha terminado de f�bricar " + libros+ " libros");
			}
			esperar();
		}
	}
	
	public void esperar() {
		
		try {
			lock.wait();
		}
		catch(InterruptedException ex) {
			System.out.println("Error de interrupci�n");
		}
	
	
	}
	
	public void consumidor(String consumidor) {
		
		synchronized(lock) {
			if(libros>0) {
				System.out.println("Consumidor de tipo " + consumidor +" tiene el libro n�mero: " + libros);
				libros--;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ex) {
					System.out.println("Error de interrupci�n");
				}
			}
			else {
				lock.notifyAll();
				esperar();
			}
		}
	}

}
	


