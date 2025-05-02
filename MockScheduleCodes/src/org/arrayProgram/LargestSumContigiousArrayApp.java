package org.arrayProgram;
import java.util.*;
public class LargestSumContigiousArrayApp {

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
		int sum = arr[0];
		int sum1 = arr[0];
		
		for(int i = 0 ; i < arr.length;i++) {
			if(sum + arr[i] > arr[i]) {
				sum += arr[i];
			}
			else {
				sum = arr[i];
			}
			if(sum > sum1) {
				sum1 = sum;
			}
		}
		System.out.println(sum1);
	}

}
