package day3;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		divideString();

	}

	static void divideString() {
		
		int t = 0;

		Scanner reader = new Scanner(System.in);
		System.out.print("Digita una parola: ");
		String p = reader.nextLine();
		
		
		while(t < p.length()) {
			System.out.println(p.charAt(t));
			t++;
		}
	}
}
