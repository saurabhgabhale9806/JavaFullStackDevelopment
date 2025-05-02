package org.arrayProgram;
import java.util.*;
public class MissingNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
			
		System.out.println("Enter the Values of Array: ");
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length - 1; i++) {
			for(int j = arr[i] + 1 ; j < arr[i + 1] ; j++) {
				System.out.printf("%d\t",j);
			}
		}
	}

}
