package org.arrayProgram;
import java.util.*;
public class CountSubStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		System.out.println("Enter the SubString: ");
		String substr = sc.nextLine();
		char subch[] = substr.toCharArray();
	
		int count = 0;
		for(int i = 0 ; i < ch.length - subch.length; i++) {
			boolean flag =  true;
			for(int j = 0 ; j < subch.length; j++) {
				if(ch[i + j] != subch[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
			
		}
		System.out.println("Occurence: "+count);
	}

}
