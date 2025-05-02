package org.IntermediateCodes;
import java.util.*;
public class IntersectionApp {

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
		
		System.out.println("Enter the Size: ");
		int size1 = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int b[] = new int[size1];
		
		for(int i = 0 ; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length; i++) {
			for(int  j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < b.length; i++) {
			for(int  j = i + 1; j < b.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int k = 0;
	
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0 ; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.print(" "+a[i]);
					break;
				}
			}
		}
	}

}
