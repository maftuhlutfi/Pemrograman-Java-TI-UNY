import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int angkatebakan =(int) (Math.random() * 101);
		
		// user menebak
		int angkauser = 101;
		while (angkauser != angkatebakan) {
			System.out.print("Masukkan angka tebakanmu: ");
			angkauser = input.nextInt();
			if (angkauser > angkatebakan) {
				System.out.println("Angkamu lebih besar");
			}
			else if (angkauser < angkatebakan) {
				System.out.println("Angkamu lebih kecil");
			}
			else if (angkauser == angkatebakan) {
				System.out.println("Tepat sekaleee");
			}
		}

	}
}