package org.arrayProgram;
import java.util.*;
public class RemoveLeadingAndTrailingSpaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
//		str = str.trim();
//		System.out.println(str);
		char ch[] = str.toCharArray();
		int start = 0;
		int end = ch.length -1;
		for( ;start < ch.length ; start++) {
			if(ch[start] != ' ') {
				break;
			}
		}
		for( ; end >= 0; end--) {
			if(ch[end] != ' ') {
				break;
			}
		}
		for(int i = start ; i <=end; i++) {
			System.out.print(ch[i]);
		}
		
	}

}
