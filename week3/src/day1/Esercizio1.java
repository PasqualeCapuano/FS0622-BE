package day1;

import java.util.Scanner;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		DBEs1 db = new DBEs1();
		db.connect();
		System.out.println("------------------------------------");
		System.out.println("Inserisci i dati nel database");
		System.out.println("------------------------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = s.next();
		System.out.println("Cognome:");
		String cognome = s.next();
		System.out.println("Regione di residenza:");
		String regione = s.next();
		System.out.println("Anno di nascita:");
		int year = s.nextInt();
		
		Cliente c1 = new Cliente (nome, cognome, regione, year);
		
		boolean insertCustomer = true;
		
			if(insertCustomer) {
				c1.insertCustomer();
			}
		
		
		db.disconnect();
	}

}
