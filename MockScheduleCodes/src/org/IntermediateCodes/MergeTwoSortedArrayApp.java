package org.IntermediateCodes;
import java.util.*;
public class MergeTwoSortedArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Value in Array: ");
		int a[] = new int[size];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	
		System.out.println("Enter the size of Array: ");
		int size1 = sc.nextInt();
		
		System.out.println("Enter the Value in Array: ");
		int b[] = new int[size1];
		
		for(int i = 0 ; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		int c[] = new int[size + size1];
	
		int k = 0;
		for(int i = 0 ; i < size; i++) {
			c[k++] = a[i];
		}
		for(int i = 0 ; i < size1; i++) {
			c[k++] = b[i];
		}
		Arrays.sort(c);
		for(int i = 0 ; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
