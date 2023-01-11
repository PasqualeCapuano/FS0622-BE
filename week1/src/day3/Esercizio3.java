package day3;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		divideString();

	}

	static void divideString() {

		int t = 0;

		String p;

		do {
			Scanner reader = new Scanner(System.in);
			System.out.printf("%nDigita una parola: ");
			p = reader.nextLine();
			for (int i = 0; i < p.length(); i++) {

				System.out.print(p.charAt(i) + ", ");
			}
		} while (!p.equals(":q"));

	}
}