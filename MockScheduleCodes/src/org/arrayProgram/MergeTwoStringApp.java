package org.arrayProgram;
import java.util.*;

public class MergeTwoStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch [] = str.toCharArray();
		
		System.out.println("Enter the String: ");
		String str1 = sc.nextLine();
		char c [] = str1.toCharArray();
		
		char join[] = new char[ch.length + c.length];
		int k = 0;
		for(int i = 0 ; i < ch.length; i++) {
			join[k] = ch[i];
			k++;
		}
		for(int i = 0 ; i < c.length; i++) {
			join[k] = c[i];
			k++;
		}
		String s = new String(join);
		System.out.println(s);
		
	}
}
