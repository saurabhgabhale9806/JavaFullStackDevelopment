package org.IntermediateCodes;
import java.util.*;
public class LongestSuStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		int k = 0;
		int len = 0;
		for(int i = 0 ; i < str.length(); i++) {
			for(int j = k ; j < i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					k = k + 1;
					break;
				}
			}
			if(i - k + 1 > len) {
				len = i - k + 1;
			}
		}
		System.out.println(len);
	}

}
