/*5) Left Rotate an Array by a Given Number of Positions

Implement a Java program that rotates an array to the left by a specified number of positions.
*/

package org.Array;
import java.util.*;

public class RotateLeftApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Position to rotate: ");
		int p = sc.nextInt();
		
		for(int i = 0 ; i < p;i++) {
			int temp = a[0];
			for(int j = 0 ; j < a.length - 1; j++) {
				a[j] = a[j + 1];	
			}
			a[a.length - 1] = temp;
		}
		System.out.println("\nArray After Rotation: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
