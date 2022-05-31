package myapp.core;

import java.io.Console;

public class Greetings {
    public static void main(String[] args) {
        // Get console
        Console cons = System.console();

        // Read from input
        String name = cons.readLine("What is your name? ");

        // To uppercase the first letter
        String capitalize = name.substring(0, 1).toUpperCase() + name.substring(1);

        // Print the name that was input by user
        System.out.printf("[%d]Hello %s. Pleased to meet you. \n", 10, capitalize);
    }
}
