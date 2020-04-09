import java.util.*;

public class StudentAdminApp {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		// Call main menu
		mainMenu();
		// User choose the menu
		int choice = input.nextInt();
		if (choice >= 1 || choice <= 3) {
			if (choice == 1) {
				addStudent();
			}
			else if (choice == 2) {
				viewStudentInfo();
			}
			else {
				System.exit(-1);
			}
		}
	}

	public static void mainMenu() {
		System.out.print("\n+-----------+");
		System.out.print("\n| Main Menu |");
		System.out.print("\n+-----------+\n");
		System.out.println("1. Add student");
		System.out.println("2. View student info");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
	}

	public static void addStudent() {
		System.out.print("How many students? ");
		int totalStudent = input.nextInt();
		for (int i = 0; i < totalStudent;i++) {
			students.add(new Student());
		}
		// Call main method
		main(new String[]{" "});
	}

	public static void viewStudentInfo() {
		// Check if there is student created
		if (students.size() > 0) {
			System.out.print("\n+--------------+");
			System.out.print("\n| Student List |");
			System.out.print("\n+--------------+\n");
			// Sort the student by their ids
			Collections.sort(students);
			for (Student student : students) {
				System.out.println(student.getId() + " " + student.getName());
			}
			// Enter the id for view student info
			System.out.print("Enter the ID: ");
			String id = input.next();
			for (Student student : students) {
				if (student.getId().equals(id)) {
					student.showInfo();
				}
			}
			// Call main method
			main(new String[]{" "});
		} 
		// If there is no students
		else {
			System.out.println("You don't have any students.");
			main(new String[]{" "});
		}
	}
}