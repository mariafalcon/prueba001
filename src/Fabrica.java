
public class Fabrica extends Thread{

	private ZonaCompartida zona;
	
	
	public Fabrica(ZonaCompartida zona) {
		
		this.zona=zona;
		
	}
	
	public void run()
	{
		super.run();
		while(true) {
			zona.productor();
		}
	}
	
	
	
	
}
