package org.IntermediateCodes;
import java.util.*;
public class SubArrayMaxSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the values in Array: ");
		int a[] = new int[size];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int max1 = a[0];
		
		for(int i = 0 ; i < a.length; i++) {
			if(max + a[i] > a[i]) {
				max += a[i];
			}
			else {
				max = a[i];
			}
			if(max > max1) {
				max1 = max;
			}
		}
		System.out.println(max1);
	}

}
