import java.util.*;

public class Student implements Comparable<Student> {
	// Data fields
	private String name;
	private int year;
	private String id;
	private static ArrayList<StudentYears> totalStudentAtYear; // For check student order in their year
	private ArrayList<String> courses = new ArrayList<>(); // To store courses 
	private String[] coursesAvailable = new String[]{"History", "Mathematics", "English", "Chemistry", "Computer Science"};	
	private double tuiton = 0;
	Scanner input = new Scanner(System.in);

	// To store how many student have been created
	static int studentsCount;

	// If there is no student
	static {
		if (studentsCount == 0) {
			// Then initialize the ArrayList
			totalStudentAtYear = new ArrayList<>();
		}
	}


	// Constructor
	Student() {
		System.out.println("\n+--------------------+");
		System.out.println("| Adding new student |");
		System.out.println("+--------------------+");
		// Enter the name
		System.out.print("Enter fullname: ");
		name = input.nextLine();
		
		// Enter the year
		while (year > 9999 || year < 1900) {
			System.out.print("Enter the year (YYYY): ");
			year = input.nextInt();
		}
		
		// Set ID by year
		setUniqueID(year);
		System.out.println("Student ID: " + id);
		
		// Enroll courses
		System.out.println("Enroll the courses");
		for (int i = 0;i <= 4;i++) {
			System.out.println((i + 1) + " " + coursesAvailable[i] + " 101");
		}
		System.out.print("Enter the course ID (0 for quit): ");
		while (0 < 1) {
			int courseID = input.nextInt();
			if (courseID == 0) {
				break;
			}
			if (courseID >= 1 || courseID <= 4) {
				setCourse(courseID - 1);
			}
		}

		// Print out the tuiton multiple by courses taken
		System.out.printf("Your tuiton: %.1f\n", tuiton);
		
		// If tuiton is not 0 or take at least one course
		if (tuiton > 0) {
			// Print tuiton payment
			System.out.print("Pay tuiton? (Y/N) ");
			if (input.next().equalsIgnoreCase("y")) {
				payTuiton();
			}
		}

		// Show info of the student
		showInfo();

		// Increment the studentCount
		studentsCount++;
	}

	// Cek urutan ke berapa pada tahun tersebut
	int cekUrutan(int year) {
		// Check if there is a StudentYears object with this year
		for (StudentYears totalStudentThisYear : totalStudentAtYear) {
			// If exist
			if (totalStudentThisYear.year == year) {
				// Then add 1 to totalStudent in StudentYears and return
				totalStudentThisYear.totalStudent += 1;
				return totalStudentThisYear.totalStudent;
			}
		}
		// If not exist
		// Create new StudentYears object with the year to ArrayList
		totalStudentAtYear.add(new StudentYears(year));
		// Return last StudentYears totalStudent added to ArrayList
		int lastIndex = totalStudentAtYear.size() - 1;
		return totalStudentAtYear.get(lastIndex).totalStudent;
			
	}

	// Set unique ID
	void setUniqueID(int year) {
		int urutanSiswa = cekUrutan(year);
		// Year in id is modulo of its year with 1000 and 100, so if 2019 then became 19
		id = String.format("%02d%03d", year % 1000 % 100, urutanSiswa);
	}

	// Set Course
	void setCourse(int courseID) {
		// Check if the student have take the course
		if (courses.indexOf(coursesAvailable[courseID]) < 0) {
			courses.add(coursesAvailable[courseID]);
			tuiton += 600;
		}
	}

	// View tuiton
	double getTuiton() {
		return tuiton;
	}

	// Pay tuiton
	void payTuiton() {
		
		String confirm = "";
		double amount = 0;
		// When the confirmation is not Y or y for yes
		while (!confirm.equalsIgnoreCase("y")) {
			// Pop out the enter amount
			System.out.print("Enter the amount: $");
			amount = input.nextInt();
			// Amount is 
			if (amount <= tuiton) {
				System.out.printf("Pay tuiton for $%.1f? (Y/N) ", amount);
				confirm = input.next();
			} else {
				System.out.println("Your ammount is exceeds the tuiton.");
			}
			
		}
		tuiton -= amount;
		System.out.printf("Your tuiton: %.1f\n", tuiton);
		
	}

	// Get Id
	String getId() {
		return id;
	}

	// Get name
	String getName() {
		return name;
	}

	// Show info
	void showInfo() {
		System.out.print("\n+--------------+");
		System.out.print("\n| Student Info |");
		System.out.print("\n+--------------+");
		System.out.printf("\nName   : %s", name);
		System.out.printf("\nID     : %s", id);
		System.out.printf("\nCourse : ");
		// Just for beautify the output
		for (int i = 0;i < courses.size();i++) {
			if (i == courses.size() - 1) {
				System.out.print((i + 1) + " " + courses.get(i) + " 101");
			} else {
				System.out.print((i + 1) + " " + courses.get(i) + " 101\n         ");
			}
			
		}
		System.out.printf("\nTuiton : $%.1f\n", tuiton);
	}

	// CompareTo for sorting when view info in StudentAdminApp,java
	public int compareTo(Student student2) {
		// Sort by id
		return id.compareTo(student2.getId());
	}
}

class StudentYears {
	int year;
	int totalStudent = 0;

	StudentYears(int year) {
		this.year = year;
		totalStudent++;
	}
}