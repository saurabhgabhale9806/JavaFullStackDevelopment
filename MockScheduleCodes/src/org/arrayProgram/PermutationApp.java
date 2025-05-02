package org.arrayProgram;
import java.util.*;
public class PermutationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		for(int i = 0 ; i < ch.length; i++) {
			for(int j = 0 ; j < ch.length ; j++) {
				if(j == i) {
					continue;
				}
				for(int k = 0 ; k < ch.length; k++) {
					if(k == i || k == j) {
						continue;
					}
					System.out.print(" "+ch[i] + ch[j] + ch[k]);
				}
			}
		}
	}

}
