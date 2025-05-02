package org.IntermediateCodes;
import java.util.*;
public class ArrayPairSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int [size];
		for(int i = 0 ; i < a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the sum: ");
		int target = sc.nextInt();
		
		for(int i = 0 ; i < a.length; i++) {
			for(int j = i + 1 ; j < a.length; j++) {
				if(a[i] + a[j] == target) {
					System.out.println(a[i]+","+a[j] +"--->"+target);
				}
			}
		}
	}

}
