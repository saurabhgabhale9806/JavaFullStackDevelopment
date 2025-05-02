		package org.loop;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		int a = 0 , b = 1, count = 0 ;
		
		while(count < n) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
			count++;
		}
	}

}
