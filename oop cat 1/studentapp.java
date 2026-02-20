import java.util.Scanner;

class StudentRecord {
	int studentID;
	String name;
	String course;

	StudentRecord(int studentID, String name, String course) {
		this.studentID = studentID;
		this.name = name;
		this.course = course;
	}

	public void displayInfo() {
		System.out.println("STUDENTID: " + studentID);
		System.out.println("NAME: " + name);
		System.out.println("COURSE: " + course);
	}
}

public class studentapp {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter studentID, name and course:");
			int studentID = scanner.nextInt();
			scanner.nextLine(); // consume leftover newline
			String name = scanner.nextLine();
			String course = scanner.nextLine();

			StudentRecord studcord = new StudentRecord(studentID, name, course);
			System.out.println("student details");
			studcord.displayInfo();
		}
	}
}