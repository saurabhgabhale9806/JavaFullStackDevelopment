package org.collection;
import java.util.*;

public class CountVowelsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the size of the Vector: ");
	        int size = sc.nextInt();
	        sc.nextLine();

	        Vector<String> v = new Vector<>(size);
	        
	        System.out.println("Enter the values in the Vector:");
	        for (int i = 0; i < size; i++) {
	            v.add(sc.nextLine());
	        }

		int count = 0;
		String vowels ="AEIOUaeiou";
		for(String word : v) {
			for(char ch: word.toCharArray()) {
				if(vowels.indexOf(ch) != -1) {
					count++;
				}
			}
		}
		System.out.println("Vowels count : "+ count);
	}

}
