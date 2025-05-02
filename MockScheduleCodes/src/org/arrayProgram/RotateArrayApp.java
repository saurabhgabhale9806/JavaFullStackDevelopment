package org.arrayProgram;
import java.util.*;
public class RotateArrayApp {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		System.out.println("Enter the Values of Array: ");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the position to rotate array: ");
		int p = sc.nextInt();
		
		for(int i = 0; i < p ; i++) {
			int temp = arr[0];
			for(int j = 0 ; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}
