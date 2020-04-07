import java.util.*;

public class p8_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		int[][] matrix = new int[4][4];
		for (int row = 0;row < matrix.length;row++) {
			for (int col = 0;col < matrix[row].length;col++) {
				matrix[row][col] = input.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0;i < matrix.length;i++) {
			sum += matrix[i][i];	
		}
		System.out.printf("Sum from major diagonal is %d \n", sum);
	}
}