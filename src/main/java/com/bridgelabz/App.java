package com.bridgelabz;

public class HelloApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            StringBuilder names = new StringBuilder();

            // Loop through all command-line arguments
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                // Add comma between names
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            System.out.println("Hello, " + names + "!");
        }
        else {
            System.out.println("Hello, World!");
        }
    }
}