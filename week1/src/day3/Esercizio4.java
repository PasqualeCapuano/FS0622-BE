package day3;
import java.util.Scanner;


public class Esercizio4 {
	
	public static void main(String[] args) {
		countdown();
	}

	
	static void countdown() {
		Scanner reader = new Scanner(System.in);

		System.out.print("Digita un numero: ");
		int num = reader.nextInt();
		
		for(int i = num; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("Countdown finito!");
	}
}
