package org.arrayProgram;
import java.util.*;

public class ReplaceCharStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		System.out.println("Enter the character to replace with: ");
		char c = sc.next().charAt(0);
		
		System.out.println("Enter the character to inset: ");
		char c1 = sc.next().charAt(0);
		
		for(int i = 0 ; i < ch.length; i++ ) {
			if(ch[i] == c) {
				ch[i] = c1;
			}
		}
		System.out.print(" "+new String(ch));
		
	}

}
