package day3;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new ThreadExample("*");
        Thread thread2 = new ThreadExample("#");

        thread1.start();
        thread2.start();
	}

}
