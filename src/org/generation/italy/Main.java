package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Programma per la gestione di un monitor. L'utente inserisce i dati 
		// del monitor e il programma chiede che operazioni si vogliono 
		// effettuare sul monitor
		
		Scanner sc = new Scanner(System.in);
		Monitor m1 = new Monitor();											// dichiaro un oggetto Monitor
		Monitor m2 = new Monitor();
		
		String operazione;
		
		// imposto m2 di default
		m2.colore="Verde";
		m2.pollici=24;
		m2.accendi();
		m2.riduciLuminosità();
		
		System.out.println("Inserisci i dati del monitor m1");
		System.out.println("Colore: ");
		m1.colore=sc.nextLine();
		
		System.out.println("Pollici: ");
		m1.pollici=Integer.parseInt(sc.nextLine());
		
		// operazioni del monitor
		do
		{
			System.out.println("\n\n\n\n\n\n\n\nQuesto è il monitor m1:");
			m1.mostraDati();
			
			System.out.println("\n\nQuesto è il monitor m2:");
			m2.mostraDati();
			
			System.out.println("Cosa vuoi fare con il monitor m1? (accendi/spegni/aumenta luminosità/diminuisci luminosità/esci)");
			operazione=sc.nextLine();
			switch(operazione)
			{
				case "accendi":
					m1.accendi();										// chiamata al metodo(operazione)
					break;
				
				case "spegni":
					m1.spegni();
					break;
				
				case "aumenta luminosità":
					m1.aumentaLuminosità();
					break;
				
				case "diminuisci luminosità":
					m1.riduciLuminosità();
					break;
			}
		}	while (!operazione.equals("esci"));
		
		sc.close();
	}

}
