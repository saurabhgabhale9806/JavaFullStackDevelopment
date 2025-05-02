package org.arrayProgram;
import java.util.*;
public class SearchElementApp {

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
		System.out.println("Enter the value to search: ");
		int value = sc.nextInt();
		
		boolean b = false;
		for(int i = 0 ; i < arr.length; i++) {
			if(value == arr[i]) {
				System.out.println("Value Found");
				b = true;
				break;
			}
		}
		if(!b) {
			System.out.println("Not Found");
		}
	}

}
