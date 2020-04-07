import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R8 {

    public static void main(String[] args) {

        // Declare variables
        int int0=0, int1=0;
        double real0=0.0, real1=0.0;
        char char0=' ', char1=' ', char2=' ';
        String string0="", string1="", string2="";

        try {

            // Open input stream
            Scanner scan = new Scanner(new File("data.txt"));

            // Read contents
            string0 = scan.nextLine();
            string1 = scan.nextLine();
            string2 = scan.nextLine();
            char0 = scan.next().charAt(0);
            char1 = scan.next().charAt(0);
            char2 = scan.next().charAt(0);
            int0 = scan.nextInt();
            int1 = scan.nextInt();
            real0 = scan.nextDouble();
            real1 = scan.nextDouble();

            // Close input stream
            scan.close();

        } catch (IOException e) {
            System.out.println("Cannot read file: data.txt");
            System.exit(0);
        }
        
        // PUT CODE HERE!
    }
}