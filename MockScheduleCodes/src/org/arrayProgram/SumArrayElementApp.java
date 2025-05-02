package org.arrayProgram;
import java.util.*;
public class SumArrayElementApp {

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
		int sum = 0;
		
		for(int i = 0 ; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println("the Sum is: "+ sum);
	}

}
