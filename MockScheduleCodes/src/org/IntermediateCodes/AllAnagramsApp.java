package org.IntermediateCodes;
import java.util.*;
public class AllAnagramsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char []ch = str.toCharArray();
		
		System.out.println("Enter the SubString: ");
		String str1 = sc.nextLine();
		char []c = str1.toCharArray();
		
		if(ch.length < c.length) {
			return;
		}
		
		int p[] = new int[26];
		int s[] = new int[26];
		
		int count = 0;
		
		int [] result = new int[ch.length];
		
		for(int i = 0; i < c.length; i++) {
			p[c[i] - 'a']++;
			s[ch[i] - 'a']++;
		}
		
		boolean isEqual = true;
		for(int i = 0 ; i < 26 ; i++) {
			if(p[i] != s[i]) {
				isEqual = false;
				break;
			}
		}
		if(isEqual) {
			result[count++] = 0;
		}
		
		for(int i = c.length ; i < ch.length; i++) {
			s[ch[i] - 'a']++;
			s[ch[i - c.length] - 'a']--;
			
			isEqual = true;
			for(int j = 0 ; j < 26; j++) {
				if(p[j] != s[j]) {
					isEqual = false;
					break;
				}
			}
			if(isEqual) {
				result[count++] = i - c.length + 1;
			}
		} 
		for(int i = 0 ; i < count; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
