package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Wrapper {
	
	private String name;
	private ArrayList<Integer> numbers;
	
	public Wrapper(String name, ArrayList<Integer> numbers) {
		this.name = name;
		this.numbers = numbers;
	}

	public void getNumbers() {
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < 3; ) {
			System.out.println("Dammi numero " + (i + 1));
			try {
				int n = Integer.parseInt(in.nextLine());
				numbers.add(n);
				i++;
			} catch(NumberFormatException e) {
				System.out.println("Inserisci un formato di numero corretto");
			}
		}
		
		try {
			this.getMax();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Non possiamo portare a termine l'applicazione");
		}
		
		in.close();
	}
	
	public void getMax() {
		int n = this.numbers.get(0);
		
		for(int i = 0; i < numbers.size(); i++) {
			
			int currentNumber = numbers.get(i);
			
			if(currentNumber > n) {
				n = currentNumber;
			}
		}
		
		System.out.println("Il numero più grande contenuto nel wrapper chiamato" + name + " è " + n);
	}
	
	
	public static void main(String[] args) {

		Wrapper v1 = new Wrapper("Wrapper 1", new ArrayList<Integer>());
		
		v1.getNumbers();
		
	}
	
}



/*
 * Creare una classe chiamata Wrapper che abbia un parametro name rappresentante il nome del wrapper e un parametro ArrayList che contiene dei numeri inseriti dall'utente (3 numeri). La classe ha il metodo getMax che stampa il numero maggiore nell'arraylist
 * 
 */