package org.arrayProgram;
import java.util.*;
public class FirstNonRepeatedWordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		
		for(int i = 0 ; i < ch.length; i++) {
			boolean flag = true;
			for(int j = 0 ;  j < ch.length; j++) {
				if(i != j && ch[i] == ch[j] ) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(ch[i]);
				return;
			}
		}
	}

}
