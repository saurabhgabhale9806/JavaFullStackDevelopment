package org.IntermediateCodes;

import java.util.*;

public class AnagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str = sc.nextLine().toLowerCase();
		char[] ch = str.toCharArray();

		System.out.println("Enter the Second String: ");
		String str1 = sc.nextLine().toLowerCase();
		char[] c = str1.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(c);

		if (ch.length != c.length) {
			System.out.println("Not Anagaram");
		} else {
			boolean flag = false;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == c[i]) {
						flag = true;
						break;
				}			
			}
			if (flag) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagaram");
			}

		}

	}

}
