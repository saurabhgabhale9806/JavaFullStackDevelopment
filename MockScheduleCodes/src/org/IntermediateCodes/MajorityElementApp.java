package org.IntermediateCodes;
import java.util.*;
public class MajorityElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int temp = 0;
		int half = a.length / 2;
		for(int i = 0 ; i < a.length; i++) {
			int count = 0;
			 for(int j = i ; j < a.length; j++) {
				 if(a[i] == a[j]) {
					 count++;
				 }
			 }
			 if(count > half) {
				 temp = a[i];
			 }
		}
		if(temp!= 0) {
			System.out.println(temp);
		}
		else {
			System.out.println("-1");	
		}
	}

}
