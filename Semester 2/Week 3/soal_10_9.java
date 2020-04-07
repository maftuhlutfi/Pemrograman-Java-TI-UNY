class Course {
	private String courseName;
	private int numberOfStudents;
	private String[] students = new String[numberOfStudents];

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String nameStudent) {
		numberOfStudents++;
		String[] student_temp = students;
		students = new String[numberOfStudents];
		for (int i = 0;i < student_temp.length;i++) {
			students[i] = student_temp[i];
		}
		students[students.length - 1] = nameStudent;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String nameStudent) {
		boolean isExist = false;
		int existAt = 0;
		for (int i = 0;i < students.length;i++) {
			if (nameStudent.equalsIgnoreCase(students[i])) {
				isExist = true;
				existAt = i;
			}
		}

		if (isExist) {
			numberOfStudents--;
			String[] student_temp = students;
			students = new String[numberOfStudents];
			for (int i = 0, j = 0;i < numberOfStudents && j < numberOfStudents;i++, j++) {
				if (existAt == i) {
					j++;
				}
				students[i] = student_temp[j];
			}
		}
		else {
			System.out.println("Nama tidak ditemukan.");
		}
		
	}
}

public class soal_10_9 {
	public static void main(String[] args) {
		Course course1 = new Course("Course Satu");
		
		// Tes add student
		course1.addStudent("Maftuh");
		System.out.println("Jumlah students: " + course1.getNumberOfStudents()); 
		course1.addStudent("Haha");
		System.out.println("Jumlah students: " + course1.getNumberOfStudents());
		System.out.printf("Students di %s: ", course1.getCourseName());
		for (String student : course1.getStudents()) {
			System.out.print(student + " ");
		}
		System.out.printf("%n%n");
		
		// Tes drop student
		course1.dropStudent("Maf");
		course1.dropStudent("Maftuh");
		System.out.println("Jumlah students: " + course1.getNumberOfStudents());
		System.out.printf("Students di %s: ", course1.getCourseName());
		for (String student : course1.getStudents()) {
			System.out.print(student + " ");
		}
		
	}
}

/*
======
OUTPUT
======
Jumlah students: 1
Jumlah students: 2
Students di Course Satu: Maftuh Haha 

Nama tidak ditemukan.
Jumlah students: 1
Students di Course Satu: Haha
*/