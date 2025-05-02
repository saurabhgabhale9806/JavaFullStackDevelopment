package org.arrayProgram;
import java.util.*;
public class LengthOfStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		System.out.println("Length of String is: "+ ch.length);
		System.out.println("Length of String is: "+ str.length());
	}		

}
