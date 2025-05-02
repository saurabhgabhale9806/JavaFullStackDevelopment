package org.arrayProgram;
import java.util.*;
public class CommonElementApp {

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
		
		System.out.println("Enter the size of array: ");
		int size1 = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int arr1[] = new int [size1];
		for(int i = 0 ; i < arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[size + size1] ;
		int k = 0;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					arr2[k] = arr[i];
					k++;
				}
			}
			
		}
		for(int i = 0 ; i < k; i++) {
			System.out.printf("%d\t",arr2[i]);
		}
	}

}
