package org.arrayProgram;
import java.util.*;
public class FrequencyofCharacterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		boolean [] visited = new boolean[ch.length];
		for(int i = 0 ; i  < ch.length; i++) {
			if(visited[i]) {
				continue;
			}
			int count = 1;
			for(int j = i + 1 ; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++; 	
					visited[j] = true;
				}
			}
			System.out.println(ch[i] + "----->"+ count);
		}
	}

}
