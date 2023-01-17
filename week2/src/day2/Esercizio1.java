package day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> words = new HashSet<>();
		Set<String> duplicateWords = new HashSet<>();
		
		System.out.println( "Inserisci il numero di parole da inserire: " );
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println( "Inserisci la parola: " );
			String word = sc.next();
			if ( !words.add(word) ) {
				duplicateWords.add(word);
			}
		}
		
		System.out.println( "Parole duplicate: " + duplicateWords );
		System.out.println( "Numero di parole distinte: " + words.size() );
		System.out.println( "Elenco delle parole distinte: " + words );

	}

}
