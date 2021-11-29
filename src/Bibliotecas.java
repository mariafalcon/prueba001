
public class Bibliotecas extends Thread{

	private ZonaCompartida zona;
	
	public Bibliotecas(ZonaCompartida zona) {
	this.zona=zona;	
	}
	
	
	public void run() {
		super.run();
		while(true) {
			zona.consumidor(this.getClass().getName());
		}
	}
	
}
