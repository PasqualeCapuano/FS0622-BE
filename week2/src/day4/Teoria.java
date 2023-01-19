package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class Teoria {

	public static void main(String[] args) {
		 // sorgente
	    ArrayList<String> students = new ArrayList<>() {{
	      add("mario");
	      add("luigi");
	      add("yoshi");
	      add("peach");
	      add("lorenzo");
	    }};

	    // realizzazione stream
	    Stream<String> studentsStream = students.stream().filter((student) -> student.charAt(0) == 'l');
	    
	    // iterazione
	    studentsStream.forEach(student -> {
	      System.out.println("Student: " + student);
	    });
	    
	    Student[] students2 = {
	        new Student("mario", 7),
	        new Student("mario", 9),
	        new Student("mario", 3),
	        new Student("mario", 8),
	        new Student("mario", 4),
	    };
	    
	    Stream<Student> studentsPassed = Arrays.stream(students2).filter(student -> student.getAvg() >= 6.0);
	    
	    
	    Stream.generate( () -> "elemento")
	    	.limit(10)
	    	.forEach(el -> System.out.println(el));
	    
	    Stream<String> stringStream = Stream.<String>builder()
	    		.add("primo elemento")
	    		.add("secondo elemento")
	    		.add("terzo elemento")
	    		.build();
	    
	    stringStream.forEach(el -> System.out.println(el));
	    
	    Stream.iterate(1, n -> n + 1)
	    	.limit(10)
	    	.forEach(n -> System.out.println(n));
	    
	  }

	}

	class Student {
	  private String name;
	  private double avg;
	  
	  public Student(String n, double a) {
	    this.name = n;
	    this.avg = a;
	  }
	  
	  public double getAvg() {
	    return this.avg;
	  }
	  
	}