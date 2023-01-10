package week1.day2;

public class Esercizio2 {

	public static void main(String[] args) {
		
		SimCard s1 = new SimCard("+39 340 1001010");
		Chiamate chiamata1 = new Chiamate("+39 3444444444", 13);
		
		s1.getListaChiamate()[0] = chiamata1;
		chiamata1 = new Chiamate("+39 1111111", 3);
		s1.getListaChiamate()[1] = chiamata1;		
		
		System.out.println("--------------------------------------------------------------------");
		
		s1.stampaDati();
		
		System.out.println("--------------------------------------------------------------------");
	}

}
