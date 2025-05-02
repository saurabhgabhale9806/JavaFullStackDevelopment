package org.collection;
import java.util.*;
public class ReverseVectorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		Vector v = new Vector(size);
		
		for(int i = 0; i < size ; i++) {
			v.add(sc.nextInt());
		}
		int mid =  v.size()/2;
		int end = v.size() -1;

		for(int i = 0; i < mid ;i++) {
			int temp = (int) v.get(i);
			v.set(i, v.get(end));
			v.set(end, temp);
			end--;
		}
		for(int i = 0; i < size; i++) {
			System.out.print(v.get(i)+" ");
		}
	}

}
