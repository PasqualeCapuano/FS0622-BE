package day4;

public class PersonError {

	private static String nameError = "Il nome deve avere almeno 2 caratteri";
	private static String ageError = "Letà deve essere compresa tra 1 e 120";
	private static String genericError = "Error!";
	

	public static void printError(String type) {
		switch( type ) {
		case "name":
			System.out.println(nameError);
			break;
			
		case "age:":
			System.out.println(ageError);
			break;	
		default:
			System.out.println( genericError );
		}
		
	}
}
