import java.util.Scanner;

public class FutureTuiton {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double ukt, naik, uktdobel;
	int tahun = 0;
	System.out.print("Masukkan ukt sekarang: ");
	ukt = input.nextDouble();
	uktdobel = ukt * 2;
	System.out.print("Berapa persen naik/tahun: ");
	naik = input.nextDouble() / 100.0;
	while (ukt <= uktdobel) {
		ukt = ukt + (ukt * naik);
		tahun++;
		
	}
	
	System.out.printf("UKT akan dobel pada tahun ke-%d %n", tahun);
	System.out.printf("UKT tahun ke-%d adalah %.2f %n", tahun, ukt);
	}
}