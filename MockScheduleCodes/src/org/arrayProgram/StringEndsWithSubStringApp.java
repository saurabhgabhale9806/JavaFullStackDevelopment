package org.arrayProgram;
import java.util.*;
public class StringEndsWithSubStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the SubString: ");
		String str1 = sc.nextLine();
		
		char ch [] = str.toCharArray();
		char c [] = str1.toCharArray();
		
		boolean endsWith = true;
		if(c.length > ch.length) {
			endsWith = false;
		}
		else {
			for(int i = c.length - 1; i >= 0 ; i--) {
				if(ch[ch.length - c.length + i] != c[i]) {
					endsWith = false;
					break;
				}
			}
		}
	
		if(endsWith) {
			System.out.println("String Ends with SubsString: "+str1);
		}
		else {
			System.out.println("String does not Ends with SubsString: "+str1);
		}
	}

}
