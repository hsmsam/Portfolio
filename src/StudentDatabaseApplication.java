import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {
		System.out.print("How many students will you be adding: ");
		Scanner reader = new Scanner(System.in);
		int numberOfStudents = reader.nextInt();
		Student[] students = new Student[numberOfStudents];

		for (int n = 0; n < numberOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
		}

		for (int n = 0; n < numberOfStudents; n++) {
			System.out.println(students[n].toString());
			System.out.println();
		}
	}

}
