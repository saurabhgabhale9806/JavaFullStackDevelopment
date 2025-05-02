package org.Exception;
import java.util.*;
import java.io.*;
public class ExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n*************Exception Handling******************\n");
			System.out.println("1. ArithmeticException ");
			System.out.println("2. IOException ");
			System.out.println("3. InputMisMatchException ");
			System.out.println("4. ClassNotFoundException ");
			System.out.println("5. NullPointerException ");
			System.out.println("6. ArrayIndexOutOfBoundsException ");
			System.out.println("7. NumberFormatException ");
			System.out.println("8. Exit Code....\n");
			
			System.out.println("Enter your Choice: ");
			int choice =  sc.nextInt();
			
			switch(choice) {
				case 1: 
					try {
						int a = 10;
						int b = 0;
						
						System.out.println(a/b);
					}
					catch(Exception ex) {
						System.out.println("Error is: "+ ex.getMessage());
					}
				break;
				
				case 2:
					try {
				        FileReader reader = new FileReader("nonexistentfile.txt");
				        BufferedReader br = new BufferedReader(reader);
				        System.out.println(br.readLine());
				        br.close();
				    } 
					catch (IOException ex) {
				        System.out.println("Error is: " + ex.getMessage());
				    }
				break;
				
				case 3:
				    try {
				        System.out.print("Enter an integer: ");
				        int num = sc.nextInt(); 
				        System.out.println("You entered: " + num);
				    } catch (Exception ex) {
				        System.out.println("Error is: " + ex.getMessage());
				        sc.next(); 
				    }
				    break;

				case 4:
				    try {
				        Class.forName("com.nonexistent.ClassName"); 
				    } catch (ClassNotFoundException ex) {
				        System.out.println("Error is: " + ex.getMessage());
				    }
				    break;

				case 5:
				    try {
				        String str = null;
				        System.out.println(str.length());
				    } catch (NullPointerException ex) {
				        System.out.println("Error is: " + ex.getMessage());
				    }
				    break;

				case 6:
				    try {
				        int[] arr = {1, 2, 3};
				        System.out.println(arr[5]);
				    } catch (ArrayIndexOutOfBoundsException ex) {
				        System.out.println("Error is: " + ex.getMessage());
				    }
				    break;

				case 7:
				    try {
				        String s = "abc";
				        int num = Integer.parseInt(s);
				        System.out.println(num);
				    } catch (NumberFormatException ex) {
				        System.out.println("Error is: " + ex.getMessage());
				    }
				    break;

				
				case 8:
					System.out.println("Exiting Code....");
					System.exit(0);
				break;
				
				default:
					System.out.println("Enter valid Choice: ");
			}
			
		}while(true);
	}

}
