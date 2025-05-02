package org.Exception;

import java.util.Scanner;

public class ThrowApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Not eligible to vote. Age must be 18 or above.");
            }
            System.out.println("You are eligible to vote!");
        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
