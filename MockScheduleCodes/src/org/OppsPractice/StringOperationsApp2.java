package org.OppsPractice;

import java.util.*;
class StringData{
	String data;
	public StringData(String data) {
		this.data = data;
	}
	
	int getLength() {
		char ch[] = data.toCharArray();
		int len = ch.length;
		return len;
 	}
	StringBuffer getConcat() {
		char ch[] = data.toCharArray();
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z' ) {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		return new StringBuffer(new String(ch));
	}
	
	StringBuffer getRev() {
		char ch[] = data.toCharArray();
		int mid = ch.length / 2;
		int end = ch.length - 1;
		
		for(int i = 0;i < mid; i++) {
			char temp = ch[i];
			ch[i] = ch[end];
			ch[end] = temp;
			end--;
		}
		return new StringBuffer(new String(ch));
	}
}
public class StringOperationsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		StringData data = new StringData(str);
		System.out.println("---------------------------------------");
		System.out.println("Length of String is : "+data.getLength());
		
		System.out.println("---------------------------------------");

		System.out.println("String after Converting to UpperCase: "+data.getConcat());
		
		System.out.println("---------------------------------------");

		System.out.println("Reversed String: "+data.getRev());
	}

}
