package day3;
import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
	
		transformNumber();
		
	}
	
	static void transformNumber() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Digita un numero: ");
		int num = reader.nextInt();
		
		switch (num) {
		case 0: 
			System.out.println("Zero");
			break;
		case 1: 
			System.out.println("Uno");
			break;
		case 2: 
			System.out.println("Due");
			break;
		case 3: 
			System.out.println("Tre");
			break;
		default:
			System.out.println("Error message!");
		}
		
	}

}
