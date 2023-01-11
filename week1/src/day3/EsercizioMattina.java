package day3;

import school.objects.Student;

public class EsercizioMattina {

	static Student[] students;

	public static void main(String[] args) {

		students = new Student[] { new Student("Pasquale", "Capuano", new double[] { 8, 9, 5 }, 'm'),
				new Student("Alessia", "Lacitignola", new double[] { 4, 6, 7 }, 'f'),
				new Student("Luca", "Lattanzi", new double[] { 9, 7, 2 }, 'm'), };

		students[0].printAvgVote();
		printBestStudentAbsolute();
		printBestStudentGender('m');
		printBestStudentGender('f');

	}

	static void printBestStudentGender(char genere) {

		Student best = new Student("", "", new double[] { 0 }, 'm');

		for (int i = 0; i < students.length; i++) {
			if (students[i].getAvgVote() > best.getAvgVote() && students[i].genere == genere) {
				best = students[i];
			}
		}
		
		String message = "";
		switch (best.genere) {
			case 'm':
				message += "Lo studente ";
				break;
			case 'f':
				message += "La studentessa ";
				break;
			default:
		}
		
		if (!message.equals("")) {
			System.out.printf("%s migliore è: %s con la media di: %.2f %n", message, best.getFullName(), best.getAvgVote());
		}

	}

	static void printBestStudentAbsolute() {
		Student best = students[0];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAvgVote() > best.getAvgVote()) {
				best = students[i];
			}
		}

		System.out.println("Lo studente migliore in assoluto è: " + best.getFullName());

	}

}