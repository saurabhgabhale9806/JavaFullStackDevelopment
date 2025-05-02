/*1. Write a program to find the first and last digit of a number. 
*/
 
package org.Date19_03_2025;
import java.util.*;
public class FirstandLastApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt() ;
		int first = num;
		
		int last = num % 10; 
		for( ; first >= 10; ) {
			first = first / 10;
		}
		
			System.out.println("last num is : "+first);
			System.out.println("last num is : "+last);	
	}

}
