package org.generation.italy;

public class Monitor {
	// variabili del monitor (attributi)
	String colore;
	int pollici, luminosità=50;
	boolean stato=false;								// false: spento; true:acceso
	
	
	// funzionalità (metodi)
	public void accendi()
	{
		stato=true;
	}
	
	public void spegni()
	{
		stato=false;
	}
	
	public void aumentaLuminosità()
	{
		if (luminosità<100)
			luminosità+=10;
	}
	
	public void riduciLuminosità()
	{
		if (luminosità>0)
			luminosità-=1;
	}
	
	public void mostraDati()								// visualizza i dati del monitor
	{
		System.out.println("Colore: " + colore);
		if (pollici>=0)
			System.out.println("Pollici: " + pollici);		// non mostra i pollici se non sono stati inseriti
		
		if (stato==true)
			System.out.println("Stato: acceso");
		else
			System.out.println("Stato: spento");
		System.out.println("Luminosità: " + luminosità);
		for(int i=0;i<luminosità/10;i++)
			System.out.print("*");							// aggiunge una stella * per ogni 10 unità di luminosità 
		System.out.println();								// vado a capo terminato il loop
	}
}
