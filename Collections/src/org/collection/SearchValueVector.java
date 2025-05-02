package org.collection;

import java.util.*;
public class SearchValueVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of vector: ");
		for(int i = 0; i < 5; i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Enter ther values to Search: ");
		int s = sc.nextInt();
		
		boolean isfound = false;
		for(int i = 0; i < v.size();i++){
			if((int)v.get(i) == (int)s){
				isfound = true;
				System.out.println("Value found at: "+ i);
				break;
			}
		}
		if (!isfound){
			System.out.println("Values not Found.");
		}
	}

}
