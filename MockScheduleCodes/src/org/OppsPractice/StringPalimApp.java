package org.OppsPractice;
import java.util.*;

class StringPalim{
	String str;
	public StringPalim(String str) {
		this.str = str;
	}
	
	String getRevString() {
		return new StringBuffer(str).reverse().toString();
	}
	boolean isPalim() {
			boolean b = false;
			String rev = new StringBuffer(str).reverse().toString();
			if(str.equals(rev)) {
				b = true;
			}
			else {
				b = false;
			}
			return b;
	}
}
public class StringPalimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		StringPalim palim = new StringPalim(str);
		
		System.out.println(palim.getRevString());
		boolean b = palim.isPalim();
		if(b) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}

}
