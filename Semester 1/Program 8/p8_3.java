public class p8_3 {
	/** Main method */
	public static void main(String[] args) {
		// Students' answers to the questions
		char[][] answers = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		// Grade all answers
		int[] grade = new int[answers.length];
		for (int i = 0;i < answers.length;i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
			if (answers[i][j] == keys[j])
			correctCount++;
			}
		grade[i] = correctCount;
		}

		// Sort student by correct count
		for (int i = 0;i < answers.length;i++) {
			int min = 0;
			int student = 0;
			for (int j = 0;j < answers.length;j++) {
				if (min(grade) == grade[j]) {
					min = grade[j];
					student = j;
					grade[j] = 11;
					break;
				}
			}
			System.out.printf("Student %d score %d\n", student, min);
		}
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (min > i)
				min = i;
		}
		return min;
	}
}