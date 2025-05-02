package org.IntermediateCodes;
import java.util.*;

class Solution{
	int max = 0;
	int start = 0;
	public boolean isPalindrome(String s , int i ,  int j) {
		
		while(i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			if(ch1 != ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public String longestPalindrome(String s) {
		int n = s.length();
   
		for(int i = 0 ; i < n ; i++ ) {
			for(int j = i ; j < n; j++) {
				if(isPalindrome(s,i,j)) {
					if(j - i + 1 > max) {
						max = j - i + 1;
						start = i;
					} 
				}
			}
		}
		
		
		return s.substring(start, start + max);
	}
}
public class LongestPalindromeApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println(s.longestPalindrome(str));
	}

}
