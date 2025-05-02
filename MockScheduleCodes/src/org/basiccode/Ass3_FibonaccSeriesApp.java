/*3. Fibonacci Series
Description: Write a program to print the first n Fibonacci numbers.
Input: n = 5


Output: 0 1 1 2 3
*/
package org.basiccode;
import java.util.*;

public class Ass3_FibonaccSeriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int a = 0 , b = 1, count = 0;
		
		for( ; count < num ; count++) {
			System.out.print(" "+a);
			int temp = a + b ;
			b = a;
			a = temp;
		}
	}

}
