import java.util.Scanner;

public class Pajak {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah pembelian: ");
    double totalbelanja = input.nextDouble();
    
    double tax = totalbelanja * 0.06;
    System.out.println("Pajaknya adalah " + (int)(tax* 100) / 100.0);
  }
}