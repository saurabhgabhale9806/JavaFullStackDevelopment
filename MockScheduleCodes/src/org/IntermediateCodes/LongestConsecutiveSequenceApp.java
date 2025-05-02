package org.IntermediateCodes;
import java.util.*;

public class LongestConsecutiveSequenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the values iof Array: ");
		int a[] = new int[size];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i + 1; j < a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;					
				}
			}
		}
		int count = 0;
		int temp = 0;
		for(int i = 0 ; i < a.length - 1; i++) {
			if(a[i] != a[i + 1]) {
				if((a[i] + 1) == a[i + 1]) {
					count++;
					if(temp < count ) {
						temp = count;
					}
				}
				else {
					count = 0;
				}
			}
		}
		System.out.println(temp + 1);
	}
}