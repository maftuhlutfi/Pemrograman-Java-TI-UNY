import java.util.Scanner;

public class P3 {

    public static String evaluate(String expression) {

        // Print expression
        System.out.println(expression);

        // Declare variables for operands, operator, result, and return value
        double operands1 = 0, operands2 = 0, result = 0; resultT = 0;
        String operator = "";
        String returnString = "";

        // Create Scanner object to parse expression
        Scanner input = new Scanner(expression);

        for(int i = 0; i < expression.length(); i++) {

        // Use Scanner to read operands and operator
        if (input.hasNext()) {
            operands1 = input.nextInt();
        }
        else {
            System.out.println("Invalid Operand!");
        }

        if (input.hasNext()) {
            operator = input.next();
        }
        else {
            System.out.println("Invalid Operator!");
        }

        if (input.hasNext()) {
            operands2 = input.nextInt();
        }
        else {
            System.out.println("Invalid Operand!");
        }



        // Compute a numerical result for the expression
        switch (operator) {
            case "+": resultT = operands1 + operands2; break;
            case "-": resultT = operands1 - operands2; break;
            case "*": resultT = operands1 * operands2; break;
            case "/": resultT = operands1 / operands2; break;
            case "%": resultT = operands1 % operands2; break;
            case "^": resultT = Math.pow(operands1,operands2); break;
        }

        result = resultT + result;
    }

        // Convert numerical result to string
        returnString = Double.toString(resultT);

        // Return result
        return returnString;
    }
}