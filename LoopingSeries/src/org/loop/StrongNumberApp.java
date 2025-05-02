package org.loop;
import java.util.*;
public class StrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		int rem = 0;
		int fact = 1;
		 
		for(;num != 0; num /= 10) {
			rem = num % 10;
			fact = 1;
			for(int i = 1 ; i <= rem ; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			
			
		}
		
		System.out.println("sum "+sum);
		if(sum == temp) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("not Strong Number");
		}
		
	}

}
