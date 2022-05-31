import java.util.Scanner;

public class Student1 {
	private String firstName;
	private String lastName;
	private String schoolYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse = 1000;
	private static int id = 1000;

	public Student1() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter students first name: ");
		this.firstName = reader.nextLine();

		System.out.print("Enter students last name: ");
		this.lastName = reader.nextLine();

		System.out.print("1 - First year\n2 - Second year\n3 - Third year\nEnter student year: ");
		this.schoolYear = reader.nextLine();

		setStudentID();

	}

	private void setStudentID() {
		id++;
		this.studentID = schoolYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter the course you would like to enroll into (Q to quit): ");
			Scanner reader = new Scanner(System.in);
			String course = reader.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costOfCourse;
			} else {
				System.out.println();
				break;
			}
		} while (1 != 0);
	}

	public void viewBalance() {
		System.out.println("Your balance is: £" + tutionBalance);
	}

	public void payTution() {
		viewBalance();
		System.out.print("Enter payment amount: £");
		Scanner reader = new Scanner(System.in);
		int payment = reader.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for paying: £" + payment);
		viewBalance();
	}

	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nYear: " + schoolYear + "\nCourses enrolled:" + courses
				+ "\nBalance: £" + tutionBalance;
	}
}
