package org.arrayProgram;
import java.util.*;
public class ReverseArrayApp {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int arr[] = new int [size];
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int mid = arr.length / 2;
		int end = arr.length - 1;
		
		for(int i = 0 ; i < mid ; i++) {
			
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}
