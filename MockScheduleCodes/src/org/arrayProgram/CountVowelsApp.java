package org.arrayProgram;
import java.util.*;
public class CountVowelsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int count = 0;
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' ||ch[i] == 'i' || ch[i] == 'I' ||ch[i] == 'o' || ch[i] == 'O' ||ch[i] == 'u' || ch[i] == 'U' ) {
				count++;
			}  
		}
		System.out.println("Total vowels are: "+count);
	}

}
