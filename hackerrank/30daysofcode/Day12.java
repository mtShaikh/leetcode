// inheritance written java because go doesnt support classes
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;

	Student(String firstName, String lastName, int id) {
    	super(firstName, lastName, id);
    }

    Student(String firstName, String lastName, int id, int[] scores) {
    	super(firstName, lastName, id);
		this.testScores = scores;
    }

    public char calculate(){

    	int sum = 0;
    	for(int i = 0; i < testScores.length; i++) {
    		sum += testScores[i];
    	}
    	double a = (double) sum/testScores.length;
    	if (a >= 90 && a <= 100) {
    		return 'O';
    	} else if (a >= 80 && a < 90) {
    		return 'E';
    	} else if (a >= 70 && a < 80) {
    		return 'A';
    	} else if (a >= 55 && a < 70) {
    		return 'P';
    	} else if (a >= 40 && a < 55) {
    		return 'D';
    	} else {
    		return 'T';
    	}
    }
}

public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
