package org.arrayProgram;
import java.util.*;

public class StartSWithSubsStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		System.out.println("Enter the SubString: ");
		String str1 = sc.nextLine();
		char c[] = str1.toCharArray();
		
		boolean startsWith = true;
		
		if(c.length > ch.length) {
			startsWith = false;
		}
		else {
			for(int i = 0 ;i < c.length; i++) {
				if(ch[i] != c[i]) {
					startsWith = false;
					break;
				}
			}
			
		}
		String s =  new String(c);
		if(startsWith) {
			System.out.println("String Starts with Substring :"+s);
		}
		else {
			System.out.println("String not Starts with Substring :"+s);
		}
	}

}
