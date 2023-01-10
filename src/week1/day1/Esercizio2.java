package day1;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] valori = new String[3];
		
		for (int i = 0; i < valori.length; i++) {
			System.out.println("Inserisci un valore: ");
			valori[i] = in.next();
			}
		System.out.println(java.util.Arrays.toString(valori));
		
		
		for(int i = valori.length - 1; i >= 0; i--) {
			 
			  System.out.print(valori[i] + " ");
		}
	}

}
