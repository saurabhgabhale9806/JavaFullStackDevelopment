/*2. Write a program to print all natural numbers in reverse (from n to 1). - using while loop 
*/

package org.Date17_03_2025;
import java.util.*;
public class ReverseNaturalNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int num = sc.nextInt();
		int i = 1;
		while(i <= num) {
			System.out.println(num);
			num--;
		}
	}

}
