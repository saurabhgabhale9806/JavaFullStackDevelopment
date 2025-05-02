/*4. Write a program to print all even numbers between 1 to 100. - using while loop 
*/
package org.Date17_03_2025;
import java.util.*;
public class OddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int num = sc.nextInt();
		int i = 1;
		while(i <= num) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}

}
