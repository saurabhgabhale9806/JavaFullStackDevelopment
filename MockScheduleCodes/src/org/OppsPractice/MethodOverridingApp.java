/*Q16. Write Program to perform method overriding you have to create class name as ArrParent with method
	void setValue(int arr[]): this method can accept array as parameter
	void arrangeSeq(): this method can display array as per user input sequence You have to create two child class
	name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() method in 
 	ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name
  	ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.
*/

package org.OppsPractice;
import java.util.*;

class ArrayParent{
	int arr[];
	void setValue(int arr[]) {
		this.arr = arr;
	}
	void arrangeSeq() {
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
class ArrangeAscendingOrder extends ArrayParent{
	void arrangeSeq() {
		for(int i = 0 ; i< arr.length;i++) {
			for(int j = 0 ;j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nArray After Sorting: ");
		System.out.println("=================================================");
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	} 
}
class ReverseArray extends ArrayParent{
	void arrangeSeq() {
		int mid = arr.length / 2;
		int end = arr.length - 1;
		for(int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}
		System.out.println("\nArray After Reverse: ");
		System.out.println("=================================================");
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
public class MethodOverridingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter ther Values in array: ");
		int arr[] = new int[size];
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayParent ar = new ArrayParent();
		ar.setValue(arr);
		
		ArrangeAscendingOrder asc = new ArrangeAscendingOrder();
		asc.setValue(arr);
		asc.arrangeSeq();
		
		ReverseArray rev = new ReverseArray();
		rev.setValue(arr);
		rev.arrangeSeq();
	}

}
