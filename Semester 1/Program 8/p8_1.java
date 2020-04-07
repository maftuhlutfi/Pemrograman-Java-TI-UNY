import java.util.*;

public class p8_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		int[][] matrix = new int[3][4];
		for (int row = 0;row < matrix.length;row++) {
			for (int col = 0;col < matrix[row].length;col++) {
				matrix[row][col] = input.nextInt();
			}
		}
		for (int col = 0;col < matrix[0].length;col++) {
			int sum = 0;
			for (int row = 0;row < matrix.length;row++) {
				sum += matrix[row][col];
			}
			System.out.printf("Sum from %d column is %d \n", col, sum);
		}
	}
}