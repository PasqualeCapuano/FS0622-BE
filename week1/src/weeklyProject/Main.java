package weeklyProject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static MediaElement[] array = new MediaElement[5];
	private static int counter = 0;

	public static void main(String[] args) {

		player();

	}

	public static void player() {
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Welcome to my media player!");
		System.out.println("");
		System.out.println("--------------------------------------");

		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("1 - Play media");
		System.out.println("2 - Add media");
		System.out.println("");
		System.out.println("--------------------------------------");
		int select = in.nextInt();
		if (select == 2) {
			System.out.println("");
			System.out.println("1 - Audio");
			System.out.println("2 - Picture");
			System.out.println("3 - Video");
			System.out.println("");
			System.out.println("---------------------------------------");
			int tipo = in.nextInt();

			if (tipo == 1) {
				Scanner in1 = new Scanner(System.in);
				System.out.println("Insert title: ");
				String title = in1.nextLine();
				System.out.println("Insert duration: ");
				int duration = in1.nextInt();
				System.out.println(title + " " + duration);
				Audio a = new Audio(title, duration);
				array[counter] = a;
				counter++;
				player();
			} else if (tipo == 2) {
				Scanner in2 = new Scanner(System.in);
				System.out.println("Insert title: ");
				String title = in2.nextLine();
				System.out.println(title);
				Picture i = new Picture( title, tipo);
				array[counter] = i;
				counter++;
				player();
			} else if (tipo == 3) {
				Scanner in3 = new Scanner(System.in);
				System.out.println("Insert title: ");
				String title = in3.nextLine();
				System.out.println("Insert duration: ");
				int duration = in3.nextInt();
				System.out.println( title + " " + duration);
				Video v = new Video(title, duration);
				array[counter] = v;
				counter++;
				player();
			} else {
				System.out.println("Error");
				player();
			}
		} else if (select == 1) {
			Scanner in4 = new Scanner(System.in);
			
			int x = 0;
			
			for (int i = 0; i < counter; i++) {
				x++;
				System.out.println(x + " - PICTURE - " + array[i]);
			}
			System.out.println("Decide a media:");
			
			int decideMedia = in4.nextInt();
			
			switch(decideMedia) {
			case(1):
				array[0].play();
				break;
			case(2):
				array[1].play();
				break;
			case(3):
				array[2].play();
				break;
			case(4):
				array[3].play();
				break;
			case(5):
				array[4].play();
				break;
			}
			
			
		} else {
			System.out.println("Error");
			player();
		}

	}


}