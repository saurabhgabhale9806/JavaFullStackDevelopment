package org.arrayProgram;
import java.util.*;
public class ReverseStringApp {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int mid = ch.length / 2;
		int end = ch.length - 1;
		
		for(int i = 0; i < mid; i++) {
			char temp = ch[i];
			ch[i] = ch[end];
			ch[end] = temp;
			end--;
		}
		 String s = new String(ch);
		 System.out.println(s);
	}
}