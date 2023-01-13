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
				System.out.println(x + " " + array[i]);
			}
			System.out.println("Decide a media:");
			
			int decideMedia = in4.nextInt();
			
			switch(decideMedia) {
			case(0): 
				break;
			case(1):
				control(array[0]);
				break;
			case(2):
				control(array[1]);
				break;
			case(3):
				control(array[2]);
				break;
			case(4):
				control(array[3]);
				break;
			case(5):
				control(array[4]);
				break;
			}
			
		} else {
			System.out.println("Error");
			player();
		}

	}
	
	
	public static void control(MediaElement array) {
		if(array instanceof Audio) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Play audio");
			System.out.println("2 - Turn up the volume");
			System.out.println("---------------------------------------");
			int select = in.nextInt();
			if(select == 1) {
				((Audio) array).play();
			} else if (select == 2) {
				((Audio) array).addVolume();
				System.out.println("Volume turned up!");
				System.out.println("---------------------------------------");
				control(array);
			}
		}  else if (array instanceof Video) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Play video");
			System.out.println("2 - Turn up the volume");
			System.out.println("3 - Turn up brightness");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Video) array).play();
			} else if (select == 2) {
				((Video) array).addVolume();
				System.out.println("Volume turned up!");
				control(array);
				
			} else if (select == 3) {
				((Video) array).addBrightness();
				System.out.println("Brightness turned up!");
				System.out.println("---------------------------------------");
				control(array);
			} 
			
		} else if (array instanceof Picture) {
			Scanner in = new Scanner(System.in);
			System.out.println("1 - Show picture");
			System.out.println("2 - Turn up brightness");
			System.out.println("Selezione: ");
			int select = in.nextInt();
			if(select == 1) {
				((Video) array).play();
			} else if (select == 2) {
				((Video) array).addBrightness();
				System.out.println("Brightness turned up!");
				control(array);
				
			}
		}
		
	}
	
	

}