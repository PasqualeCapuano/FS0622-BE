package day2;

public class Teoria {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.firstName = "Pasquale";
		h1.lastName = "Capuano";
		System.out.println(h1.firstName + " " + h1.lastName);
		h1.sayHello();
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("ciao " + h1.firstName + " x" + i);
			
			//%s = string
			//%d = intero
			//%f = float double
			//%b = boolean
			//%n = rimando a capo
			System.out.printf("ciao %s x%d %n", h1.firstName, i);
		}
	}

}


//classi

class Human{
	//proprietà
	String firstName, lastName;
	
	//costruttori
	public Human () {
		
	}
	
	public Human (String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	//metodi
	void sayHello() {
		System.out.println("Ciao, sono un umano! Mi chiamo " + this.firstName + "" + this.lastName);
		System.out.printf("Ciao, sono un umano! Mi chiamo %s %s%n", this.firstName, this.lastName);
	}
}