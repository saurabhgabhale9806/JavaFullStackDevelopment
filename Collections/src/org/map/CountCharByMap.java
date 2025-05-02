package org.map;
import java.util.*;
public class CountCharByMap {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
			LinkedHashMap<String , Integer> map = new LinkedHashMap <>();
 
		String s[] = str.split(" ");
		
		for(String word : s) {
			map.put(word, word.length() );
			
		}
		for(Map.Entry<String , Integer> entry : map.entrySet() ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}  
	}

}
