package org.loop;
import java.util.*;

public class ArmstrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:  ");
		int num = sc.nextInt();
		int count = 0;
		int rem = 0;
		int sum = 0;
		int temp = num;
		for(; num != 0; num /= 10) {
			count++;
		}
		num = temp;
		for(; temp != 0;temp /= 10) {
			rem = temp % 10;
			
			int p = 1;
			for(int i = 1 ; i <= count; i++) {
				p = p * rem;
			
			}
			System.out.println("rem "+rem);
			sum = sum + p;
		}
		System.out.println("Sum: "+sum);
		if(sum == num) {
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println("It is not Armstrong Number");
		}
	}

}
