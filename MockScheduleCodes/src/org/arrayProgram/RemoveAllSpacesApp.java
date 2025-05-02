package org.arrayProgram;
import java.util.*;
public class RemoveAllSpacesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		char c[] = new char[ch.length];
		
		int k = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] != ' ') {
				c[k] = ch[i];
				k++;
			}
		}
	
		String s = new String(c,0,k);
		System.out.println(s);
	}

}
