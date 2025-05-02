package org.arrayProgram;
import java.util.*;
public class ConvertToLowercaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char)(ch[i] + 32);
			}
		}
		String s = new String(ch);
		System.out.println(s);
	}

}
