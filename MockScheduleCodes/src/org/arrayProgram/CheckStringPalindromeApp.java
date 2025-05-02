package org.arrayProgram;
import java.util.*;
public class CheckStringPalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int mid = ch.length / 2;
		int end = ch.length - 1;
		
		char c[] = new char[ch.length];
		for(int i = 0 ; i < ch.length; i++) {
			c[i] = ch[i];
		}
		
		for(int  i = 0 ; i < mid; i++) {
			char temp = ch[i];
			ch[i] = ch[end];
			ch[end] = temp;
			end--;
		}
		
		String s = new String(ch) ;
		if(str.equals(s)){
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
//		boolean isPalindrome = true;
//		for(int i = 0; i < ch.length; i++) {
//			if(ch[i] != c[i]) {
//				isPalindrome = false;
//				break;
//			}
//		}
//		if(isPalindrome) {
//			System.out.println("String is palindrome");
//		}
//		else {
//			System.out.println("String is not palindrome");
//		}
	} 

}
