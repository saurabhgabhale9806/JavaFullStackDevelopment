package org.map;
import java.util.*;
public class LongestWordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		LinkedHashMap <String,Integer > map = new LinkedHashMap();
		
		String [] s = str.split(" ");
		
		String k = "";
		for(String word : s) {
			map.put(word , word.length());
			if(word.length() > k.length()) {
				k = word;
			}
		}
		
		for(Map.Entry<String , Integer> entry : map.entrySet()) {
			if(entry.getValue().equals(k.length())) {
				System.out.println(entry.getKey() +"\t" + entry.getValue());
			}
		}
		
	}

}
