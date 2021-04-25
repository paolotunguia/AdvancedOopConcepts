package com.company;

import java.util.Scanner;

public class UseInsurance {
    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }

    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int insurance;
        char choice;

        do {
            System.out.println("\n    -INSURANCE DETAILS-" +
                               "\n\"1\" to display Life Insurance" +
                               "\n\"2\" to display Health Insurance");

            System.out.print("\nEnter number: ");
            String userInput = input.next();
            insurance = Integer.parseInt(userInput);

            if (insurance == 1)
                insuranceLife();
            else if (insurance == 2)
                insuranceHealth();
            else
                System.out.println("\nInvalid input!");

            System.out.print("\nEnter \"R\" to redo Insurance Details or \"any\" key to exit: ");
            choice = input.next().charAt(0);
        } while ((choice == 'R') || ( choice== 'r'));
    }
}