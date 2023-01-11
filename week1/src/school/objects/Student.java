package school.objects;

public class Student {
	String nome;
	String cognome;
	double[] voti;
	public char genere;
	
	
	public Student(String nome, String cognome, double[] voti, char genere) {

		this.nome = nome;
		this.cognome = cognome;
		this.voti = voti;
		this.genere = genere;
	}
	
	public String getFullName() {
		return nome+ " " + cognome;
	}
	
	public double getAvgVote() {
		double sum = 0;
		for(int i = 0; i < this.voti.length; i++) {
			sum += this.voti[i];
		}
		return sum/this.voti.length;
	}
	
	public void printAvgVote() {
		System.out.printf("%.2f%n", this.getAvgVote());
	}
	
}
