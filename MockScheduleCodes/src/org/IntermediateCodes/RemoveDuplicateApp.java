/*12. Remove Duplicates from Sorted Array
Description: Remove duplicates from a sorted array and return the new length.


Input: [1, 1, 2]


Output: 2
*/
package org.IntermediateCodes;
import java.util.*;
public class RemoveDuplicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];
		for(int i = 0 ; i < a.length; i++) {
			a[i]  = sc.nextInt();
		}
		
		for(int i = 0 ;i < a.length; i++) {
			for(int j =  i + 1 ; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} 
			}
		}
		int count = 0;
		int b[] = new int[size];
		for(int i = 1 ; i < size ; i++) {
			if(a[i] != a[count]) {
				count++;
				a[count] = a[i];
			}
		}
		int len = count + 1;
		
		System.out.println(len);
	}

}
