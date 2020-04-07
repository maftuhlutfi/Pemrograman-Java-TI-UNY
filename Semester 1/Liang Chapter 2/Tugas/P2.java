// P2 Assignment Solution
// Author: Ms. White
// Date:   8/27/2018
// Class:  CS163/164
// Email:  white@colostate.edu

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        // Declare variables for mysterious formulas
        double alphaAcid, ounces, weight, lovibond, volume;

        // Instantiate scanner
        Scanner keyboard = new Scanner(System.in);

        // Prompt and read alphaAcid from keyboard
        System.out.printf("Alpha Acid? ");
        alphaAcid = keyboard.nextDouble();
        // Prompt and read ounces from keyboard
        System.out.printf("Ounces? ");
        ounces = keyboard.nextDouble();        
        // Calculate HBUs
        double HBUs = alphaAcid*ounces;
        // Print HBUs to console
        System.out.printf("HBUs: %.2f %n",HBUs);
        // Prompt and read remaining variables
        System.out.printf("weight? ");
        weight = keyboard.nextDouble();
        
        System.out.printf("lovibond? ");
        lovibond = keyboard.nextDouble();

        System.out.printf("volume? ");
        volume = keyboard.nextDouble();
        // Compute the SRM value using the formula
        double SRM = (0.3 * weight * lovibond / volume) + 4.7;
        // Print SRM to console
        System.out.printf("SRM : %.4f %n",SRM);
        // Close scanner
        keyboard.close();
    }
}