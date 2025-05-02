package org.arrayProgram;
import java.util.*;
public class SecondLargestApp {

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
		int max = arr[0];
		int max1 = arr[1];
		
		for(int i = 0 ; i < arr.length; i++) {
			if(max < arr[i]) {
				max1 = max;
				max = arr[i];
			}
			else if(arr[i] > max1 && arr[i] != max) {
				max1 = arr[i];
			}  
			
		}
		System.out.println("The Second Highest Element is : " +max1);
	}

}
