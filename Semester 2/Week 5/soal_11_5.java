/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

class Course {
	// Data field
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();

	// Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Method menambah student
	public void addStudent(String nameStudent) {
		students.add(nameStudent);
	}

	// Method mengambil student dalam array String
	public String[] getStudents() {
		String[] student_names = new String[students.size()];
		for (int i = 0;i < student_names.length;i++) {
			student_names[i] = students.get(i);
		}
		return student_names;
	}

	// Method mengambil jumlah student
	public int getNumberOfStudents() {
		return students.size();
	}

	// Method mengambil nama course
	public String getCourseName() {
		return courseName;
	}

	// Method membuang student
	public void dropStudent(String nameStudent) {
		boolean isExist = false;
		int existAt = 0;

		// Check apakah ada nama yang sama
		for (int i = 0;i < students.size();i++) {
			if (nameStudent.equalsIgnoreCase(students.get(i))) {
				isExist = true;
				// Jika ya, ada di indeks berapa
				existAt = i;
			}
		}

		if (isExist) {
			// Lakukan jika ada nama
			students.remove(existAt);
			System.out.println("Siswa " + nameStudent + " berhasil dihapus.");
		}
		else {
			// Jika nama tidak exist
			System.out.println("Nama tidak ditemukan.");
		}
		
	}
}

public class soal_11_5 {
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
Siswa Maftuh berhasil dihapus.
Jumlah students: 1
Students di Course Satu: Haha
*/