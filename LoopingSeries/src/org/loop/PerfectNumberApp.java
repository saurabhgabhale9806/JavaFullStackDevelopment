package org.loop;
import java.util.*;
public class PerfectNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the number: ");
		int num = sc.nextInt();
		int fact = 0;
		for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					fact = fact + i;
				}
			}
		System.out.println("fact"+fact);
		if(fact == num) {
			System.out.println("It is perfect number");
		}
		else {
			System.out.println("It is not perfect number");
		}
	}
}
