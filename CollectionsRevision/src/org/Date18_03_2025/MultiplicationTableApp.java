package org.Date18_03_2025;
import java.util.*;
public class MultiplicationTableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		for(int i = 0 ; i <= 10; i++) {
			System.out.println(num+" * " + i + " : "+ (num * i));
		}
	}

}
