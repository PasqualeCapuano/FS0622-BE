package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
	
	Scanner in = new Scanner(System.in);
	Map<String, String> contatti = new HashMap<>();
	String nome, numero;
	
	public void rubrica() {
		System.out.println( "-------------------------------------" );
		System.out.println( "1 - Aggiungi Contatto" );
		System.out.println( "2 - Elimina Contatto" );
		System.out.println( "3 - Ricerca Contatto tramite numero di telefono" );
		System.out.println( "4 - Ricerca Contatto tramite nome" );
		System.out.println( "5 - Mostra Rubrica" );
		System.out.println( "Segli al funzione desiderata: " );
		int selezione = in.nextInt();
		in.nextLine();
		switch(selezione) {
			case(1):
				inserisciContatto();
				break;
			case(2):
				eliminaContatto();
				break;
			case(3):
				ricercaContattoConNumero();
				break;
			case(4):
				ricercaContattoConNome();
				break;
			case(5):
				stampaContatti();
				break;
			default:
				System.out.println( "Valore errato!" );
				break;
		}
		in.close();
	}
	
	public void inserisciContatto() {
		System.out.println( "Inserisci il nome: " );
		nome = in.nextLine();
		System.out.println( "Inserisci il numero di telefono: " );
		numero = in.nextLine();
		
		contatti.put(nome, numero);	
		rubrica();
		in.close();
	}
	
	public void eliminaContatto() {
		System.out.println( "Inserisci il nome del contatto da eliminare: " );
		String nomeDel = in.nextLine();
		if (contatti.containsKey(nomeDel)) {
			contatti.remove(nomeDel);
			System.out.println( "Contatto eliminato!" );
		} else {
			System.out.println( "Contatto non trovato!" ); 
		}
		rubrica();
		in.close();
	}
	
	public void ricercaContattoConNumero() {
		System.out.println( "Inserisci il numero di telefono del contatto da cercare: " );
		String numeroTel = in.nextLine();
		for(Map.Entry<String, String> entry : contatti.entrySet()) {
			if( entry.getValue().equals(numeroTel) ) {
				System.out.println( "Il contatto che cercavi è: " );
				System.out.println( "Nome: " + entry.getKey() + " - Numero: " + entry.getValue() );
			} else {
				System.out.println( "Contato non trovato!" );
			}
		}
		rubrica();
		in.close();
	}
	
	public void ricercaContattoConNome() {
		System.out.println( "Inserisci il nome del contatto da cercare: " );
		String nomeContatto = in.nextLine();
		for(Map.Entry<String, String> entry : contatti.entrySet()) {
			if( entry.getKey().equals(nomeContatto) ) {
				System.out.println( "Il contatto che cercavi è: " );
				System.out.println( "Nome: " + entry.getKey() + " - Numero: " + entry.getValue() );
			} else {
				System.out.println( "Contato non trovato!" );
			}
		}
		rubrica();
		in.close();
	}
	
	public void stampaContatti() {
		System.out.println( "RUBRICA: " );
		if(!contatti.isEmpty()) {
			for (Map.Entry<String, String> entry : contatti.entrySet()) {
	            System.out.println("Nome: " + entry.getKey() + " - Numero: " + entry.getValue());
	        }
		} else {
			System.out.println( "La tua rubrica è vuota!" );
		}
        rubrica();
    }
	
	
}