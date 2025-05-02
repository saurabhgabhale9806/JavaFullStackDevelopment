package org.Date18_03_2025;
import java.util.*;
public class SumEvenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= num) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(i);
			}
			i++;
			
		}
		System.out.println("Sum of Even number: "+sum);
	}

}
