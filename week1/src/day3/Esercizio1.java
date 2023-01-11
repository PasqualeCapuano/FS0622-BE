package day3;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		checkNumber();
		System.out.println("----------------------------------------------------");
		checkYear();

	}

	static void checkNumber() {
		Scanner reader = new Scanner(System.in);

		System.out.print("Digita una parola: ");
		String word = reader.nextLine();

		if (word.length() % 2 == 0)
			System.out.println("La parola " + word.toUpperCase() + " ha un numero di caratteri pari");
		else
			System.out.println("La parola " + word.toUpperCase() + " ha un numero di caratteri dispari");
	}

	static void checkYear() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Digita un anno: ");
		int year = reader.nextInt();;
		boolean leap = false;

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}

			else
				leap = true;
		}

		else
			leap = false;

		if (leap)
			System.out.println(year + " è un anno bisestile.");
		else
			System.out.println(year + " non è un anno bisestile.");
	}

}
