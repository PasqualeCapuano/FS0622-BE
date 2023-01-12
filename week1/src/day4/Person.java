package day4;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public void setName(String n) {
		if( n.length() <= 1 ) {
			System.out.println("Errore!");
			return;
		}
		this.name = n;
	}
	
	public void setAge(int a) {
		if( a < 0 || a > 120 ) {
			System.out.println( "Errore!" );
			return;
		}
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public static void updatePerson(Person p, String n, int a) {
		p.setName(n);
		p.setAge(a);
	}
}
