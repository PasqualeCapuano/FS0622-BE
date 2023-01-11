package esercitazioni;
import java.util.Scanner;

public class TabellinaPitagorica {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
		    for (int j = 1; j <= 10; j++) {
			int prodotto = i*j;
			
			System.out.print(i*j); 
		    }
		    System.out.println();
		}
	}

}
