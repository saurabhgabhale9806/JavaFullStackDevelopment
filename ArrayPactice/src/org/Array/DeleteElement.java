/*3) Delete a Specific Element from an Array

Create a Java program that allows the user to input an array and a specific value, 
then deletes all occurrences of that value while maintaining the order of other elements.
*/

package org.Array;
import java.util.*;
public class DeleteElement {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Value to delete");
		int value = sc.nextInt();
		
		int j = 0;
		for(int i = 0; i < a.length  ; i++) {
			if(a[i] != value) {
				a[j] = a[i];
				j++;
			}
		}
		for(int i = 0 ; i < j; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
