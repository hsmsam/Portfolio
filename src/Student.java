import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String year;
	private String studentID;
	private String courses = "";
	private static int id = 1000;

	public Student() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter students first name: ");
		this.firstName = reader.nextLine();

		System.out.print("Enter students last name: ");
		this.lastName = reader.nextLine();

		System.out.print("1 - First year\n2 - Second year\n3 - Third year\nEnter student year: ");
		this.year = reader.nextLine();

		setStudentID();

	}

	private void setStudentID() {
		id++;
		this.studentID = year + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter the course you would like to enroll into (Q to quit): ");
			Scanner reader = new Scanner(System.in);
			String course = reader.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
			} else {
				System.out.println();
				break;
			}
		} while (1 != 0);
	}

	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nYear: " + year + "\nStudent ID: " + studentID
				+ "\nCourses enrolled on:" + courses;
	}
}
