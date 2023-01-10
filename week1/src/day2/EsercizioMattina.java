package day2;

public class EsercizioMattina {

	public static void main(String[] args) {
		
		Product p1 = new Product("tastiera", 25);
		Product p2 = new Product("mouse", 15);
		
		System.out.println(p1.equals(p2));
		
		Product p3 = new Product("iphone", 1000);
		Product p4 = new Product("ipad", 1000);
		
		System.out.println(p3.equals(p4));
	}

}
