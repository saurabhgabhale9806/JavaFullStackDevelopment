package org.arrayProgram;
import java.util.*;
public class FrequencyofElementApp {
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
		
		System.out.println("Enter the Element: ");
		int value = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = 0 ; j < arr.length; j++) {
				if(value == arr[j]) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
