
public class Particular extends Thread{
	
	private ZonaCompartida zona;
	
	public Particular(ZonaCompartida zona) {
		this.zona=zona;
	}
	
	public void run() {
		super.run();
		while(true) {
		zona.consumidor(this.getClass().getName());
		}
	}
	
	

}
