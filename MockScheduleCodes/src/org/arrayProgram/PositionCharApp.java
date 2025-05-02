package org.arrayProgram;
import java.util.*;
public class PositionCharApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		System.out.println("Enter the character to find Position: ");
		char c = sc.next().charAt(0);
		boolean flag = true;
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] == c) {
				System.out.println("Position is: "+i);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Character does not Exist");
		}
	}

}
