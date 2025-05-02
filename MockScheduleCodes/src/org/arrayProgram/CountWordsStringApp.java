package org.arrayProgram;
import java.util.*;
public class CountWordsStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
//		
//		str = str.trim();
		int count = 0;
//		if(!str.isEmpty()) {
//			String s [] = str.split("\\s+");
//			count = s.length;
//		}
//		System.out.println("Total words are: "+count);
		boolean isword = false;
		for(int i = 0; i < ch.length; i++) {
			 if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')) {
                if(!isword) {
                	count++;
                	isword = true;
                }
            } else {
               isword = false;
            }
		}
		System.out.println("Total words are: "+count);
		
		
	}	

}
