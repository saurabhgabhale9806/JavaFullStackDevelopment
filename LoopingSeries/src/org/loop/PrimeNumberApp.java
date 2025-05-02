package org.loop;
import java.util.*;
public class PrimeNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1 ; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("It is Prime Number");
		}
		else {
			System.out.println("It is not Prime Number");
		}
	}

}
