/*1. Write a program to print all natural numbers from 1 to n. - using while loop 
*/
package org.Date17_03_2025;
import java.util.*;
public class NaturalNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int num = sc.nextInt();
		int i = 1;
		while(i <= num) {
			System.out.println(i);
			i++;
		}
		
	}

}
