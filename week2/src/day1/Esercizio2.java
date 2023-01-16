package day1;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		double km = 0;
		double lt = 0;
		
		System.out.println("- Quanti km hai percorso?");
		Scanner val = new Scanner(System.in);
		km = val.nextInt();

		System.out.println("- Quanti litri di carburante hai consumato?");
		Scanner pos = new Scanner(System.in);
		lt = pos.nextInt();
		
		double res = km/lt;
		
		System.out.println(res);
	}
}
