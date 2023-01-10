package day1;
import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		moltiplica(5,6);	
		
		concatena("Il numero scritto", 40);
		
		inserisciInArray();
		
	}

	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void moltiplica(int a, int b) {
		
		int resultMultiply = a*b;
				
		System.out.println("Il riusltato della moltiplicazione è: " + resultMultiply);
		
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void concatena(String frase, int y) {
		
		System.out.println(frase + " è " + y);		
		System.out.println("-----------------------------------------------------------");
	}
	
	
	
	public static void inserisciInArray() {
		
		String[] animali = new String[5];
		animali[0] = "Cane";
		animali[1] = "Gatto";
		animali[2] = "Pappagallo";
		animali[3] = "Zebra";
		animali[4] = "Cavallo";

		System.out.println("Array originale: " + java.util.Arrays.toString(animali));
				

		int orig_length = animali.length;

		String newAnimale = "Fagiano";

		String[] newAnimali = new String [orig_length + 1];

		for (int i = 0; i < animali.length; i++) {
				newAnimali[i] = animali [i];
		}
				

		newAnimali[newAnimali.length -4] = newAnimale;
		newAnimali[newAnimali.length -1] = "";

		animali = newAnimali;

		System.out.println("Array modificato: " + java.util.Arrays.toString(animali));
	}
	
	
}
