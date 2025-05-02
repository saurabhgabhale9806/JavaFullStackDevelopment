/*Q5.  Map to List Conversion
Write a program that converts a HashMap to a list of entries and then sorts the list by the keys.
*/

package org.Date12_03_2025;
import java.util.*;

public class CovertMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map <Integer, String> map = new HashMap<>();
		
		for(int i = 0 ; i < 5; i++) {
			int k = sc.nextInt();
			sc.nextLine();
			String v =sc.nextLine();
			map.put(k, v);
		}
		
		List <Map.Entry <Integer ,String>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByKey());
		
		 System.out.println("Sorted Map Entries:");
	        for (Map.Entry<Integer, String> entry : list) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
		
	}

}
