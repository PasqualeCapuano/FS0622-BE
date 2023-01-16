package day1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Esercizio1 {

	public static void main(String[] args) {
		create();
	}

	public static void create() {
		
		try {
			int[] numbers = new int[5];
			

			for (int i = 0; i < numbers.length; i++) {
				int minVal = 1;
				int maxVal = 10;
				numbers[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
			}
			
			int position = 0;
			int newValue = 0;

			System.out.println("- Array iniziale");
			System.out.println(Arrays.toString(numbers));
			System.out.println("------------------------------------------");

			System.out.println("- Che numero vuoi aggiungere?");
			Scanner val = new Scanner(System.in);
			newValue = val.nextInt();

			System.out.println("- In che posizione?");
			Scanner pos = new Scanner(System.in);
			position = pos.nextInt() - 1;

			if (newValue > 0) {
				for (int i = numbers.length - 1; i > position; i--) {
					numbers[i] = numbers[i - 1];
				}
				

				numbers[position] = newValue;
				System.out.println("- Nuovo Array: " + Arrays.toString(numbers));

			} else {
				System.out.println("Numero troppo basso, devi inserire un numero maggiore di zero");
				val.close();
			}
		} catch (InputMismatchException e) {
			System.out.println("Formato non corretto, inserisci un numero valido");
		}

	}

}
