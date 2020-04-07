import java.util.Scanner;

public class FahrenheitCelcius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan suhu fahrenheit: ");
		int fahrenheit = input.nextInt();
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		System.out.printf("%n Suhu dalam celcius adalah %.2f", celcius);
	}
}