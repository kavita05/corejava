/* Enum
Create an Enum for subject like JAVA, CPP, C, PYTHON
Create a student class (stid,stname,subject,marks). Create 5 objects of it.
Ask user to enter a subject name to display the respective students.*/


package SessionTask;

public class Enum13 {

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}
}

enum Level {
	LOW, MEDIUM, HIGH
}