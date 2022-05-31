import java.util.Scanner;

public class StudentDatabaseApplication1 {

	public static void main(String[] args) {
		System.out.print("How many student would you be adding: ");
		Scanner reader = new Scanner(System.in);
		int numberOfStudents = reader.nextInt();
		Student1[] students = new Student1[numberOfStudents];

		for (int n = 0; n < numberOfStudents; n++) {
			students[n] = new Student1();
			students[n].enroll();
			students[n].payTution();
		}

		for (int n = 0; n < numberOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}

}
