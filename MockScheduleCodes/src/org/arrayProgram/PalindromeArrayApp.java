package org.arrayProgram;

import java.util.Scanner;

public class PalindromeArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the Values in Array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Manually copy the original array
        int originalArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            originalArr[i] = arr[i];
        }

        int mid = arr.length / 2;
        int end = arr.length - 1;

        // Reverse the array
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println(); // New line for better formatting

        // Check if the reversed array matches the original array
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != originalArr[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }

        sc.close();
    }
}
