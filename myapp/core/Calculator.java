package myapp.core;

import java.io.Console;

public class Calculator {
    public static void main(String[] args) {
        // Get console
        Console cons = System.console();

        // Prompt inputs
        String snum1 = cons.readLine("Input first number: ").trim();
        String snum2 = cons.readLine("Input second number: ").trim();
        String operator = cons.readLine("add, div, sub, mul: ").trim();

        // User input checks
        //// If value is not provided
        if (snum1.equals(null) || snum2.equals(null)|| operator.equals(null)) {
            System.out.println("Please provide the stated values");
        }


        // String to Int conversion
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);

        // Declaring new variables
        float result = 0f;
        String soperator = "";

        // Evaluation
        if (operator.equals("add")) {
            // Cast int to float
            result = (float) (num1 + num2);
            soperator = "+";

        } else if (operator.equals("div")) {
            result = (float) num1 / num2;
            soperator = "/";

        } else if (operator.equals("sub")) {
            result = (float) (num1 - num2);
            soperator = "-";

        } else if (operator.equals("mul")) {
            result = (float) (num1 * num2);
            soperator = "*";

        } else {
            System.out.println("Problems detected");
        }
        ;
        System.out.printf("The answer for %s %s %s = %.3f", snum1, soperator, snum2, result);
    }
}
