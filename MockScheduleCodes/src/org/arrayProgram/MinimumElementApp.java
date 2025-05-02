package org.arrayProgram;
import java.util.*;
public class MinimumElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int arr[] = new int [size];
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		for(int i  = 0 ; i < arr.length; i++) {
			if(min  > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum Element in Array is: "+min);
	}

}
