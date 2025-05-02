/*1. Sum of Numbers
Description: Write a program to calculate the sum of numbers from 1 to n.
Input: n = 5


Output: 15
*/
package org.basiccode;
import java.util.*;
public class Ass1_SumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
