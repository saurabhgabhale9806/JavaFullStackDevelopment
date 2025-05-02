package org.Exception;
import java.util.*;

public class ThrowsApp {

	 public static void divideNumbers(int a, int b) throws Exception {
	        if (b == 0) {
	            throw new Exception("Division by zero is not allowed");
	        }
	        int result = a / b;
	        System.out.println("Result: " + result);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number1: ");
	        int num = sc.nextInt();
	        
	        System.out.print("Enter number2: ");
	        int num2 = sc.nextInt();

	        try {
	            divideNumbers(num, num2);
	        } catch (Exception ex) {
	            System.out.println("Exception caught: " + ex.getMessage());
	        }
	    }
	}
