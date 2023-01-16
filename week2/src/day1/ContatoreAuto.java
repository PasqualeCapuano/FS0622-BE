package day1;

import java.util.Scanner;

public class ContatoreAuto {
	
	Scanner in = new Scanner(System.in);
	int l;
	int consumi;

	public void inserisciDati() {
		System.out.println("Inserisci i KM percorsi: ");
		int km = in.nextInt();
			try {
				System.out.println("Inserisci i litri(l) di carburante consumati: ");
				 l = in.nextInt();
				 consumi = km / l;
			} catch (ArithmeticException e) {
				System.out.println("Il numero inserito non è valido. Impossibile effettuare il calcolo!");
				System.exit(0);
			}	
		
		System.out.println("Hai consumato " + consumi + "km/l");
	}
}
