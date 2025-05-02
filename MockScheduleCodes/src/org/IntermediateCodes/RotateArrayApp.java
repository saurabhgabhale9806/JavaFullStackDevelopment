package org.IntermediateCodes;
import java.util.*;
public class RotateArrayApp {

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
		
		System.out.println("Enter the Position: ");
		int k = sc.nextInt();
		
		for(int i = 0 ; i < k ; i++) {
			int temp = a[a.length - 1];
			for(int j = a.length -1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		for(int i = 0 ;i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
