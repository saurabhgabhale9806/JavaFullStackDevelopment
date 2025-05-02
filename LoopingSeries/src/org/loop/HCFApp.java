	package org.loop;
import java.util.*;
public class HCFApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the number: ");
		int num1 = sc.nextInt();
		int hcf = 1;
		int min ;
		if(num < num1) {
			min = num;
		}
		else {
			min = num1;
		}
		
		for(int i = 1 ; i <= min; i++) {
			if(num % i == 0 && num1 % i == 0) {
				hcf = i;
			}
		}
		int lcm = (num * num1)/hcf;
		System.out.println("LCM: "+lcm);
		System.out.println("HCF of " + num + " and " + num1 + " is: " + hcf);
	}

}
