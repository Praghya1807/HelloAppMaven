package com.bridgelabz;

public class HelloApp {

    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove last comma and space
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        System.out.println("Hello, " + names + "!");
    }
}