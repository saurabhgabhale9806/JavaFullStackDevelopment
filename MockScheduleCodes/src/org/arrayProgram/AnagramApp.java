package org.arrayProgram;
import java.util.*;
public class AnagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		System.out.println("Enter the First String: ");
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		
		if(str.length() == str1.length()) {
			char ch[] =  str.toCharArray();
			for(int i = 0 ; i < ch.length ; i++) {
				for(int j = i + 1; j < ch.length;  j++) {
					if(ch[i] < ch[j]) {
						char temp = ch[i];
						ch[i] = ch[j];
						ch[j] = temp;
					}
				}
			}
			
			String s = new String(ch);
			
			char c[] = str1.toCharArray();
			for(int i = 0 ; i < c.length ; i++) {
				for(int j = i + 1; j < c.length;  j++) {
					if(c[i] < c[j]) {
						char temp = c[i];
						c[i] = c[j];
						c[j] = temp;
					}
				}
			}
			String s1 = new String(c);
			if(s.equals(s1)) {
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is not Anagram");
			}
			
		}
		else {
			System.out.println("String is not Anagram");
		}
		
	}

}
