package org.Date18_03_2025;
import java.util.*;
public class CountDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;
		for( ; num!=0 ; num /= 10) {
			count++;
		}
		System.out.println("count is "+ count);
	}

}
