
public class VentaDeLibros {
	
	private static ZonaCompartida zona = new ZonaCompartida();
	
	public static void main(String[] args) {

		Thread[] hilos = new Thread[11];
		
		
		for (int i = 0; i < hilos.length; i++) {
			if(i==0) {
				hilos[i] = new Fabrica(zona);
				}
				else if(i>0 && i<6){
				hilos[i] = new Particular(zona);
				}
				else {
					hilos[i] = new Bibliotecas(zona);
				}
			
			hilos[i].start();
			}
		
	
		
		

	}

}
