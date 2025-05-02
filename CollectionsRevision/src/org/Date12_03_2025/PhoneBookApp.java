/*Q6. Implementing a Simple Phone Book Using HashMap
Create a simple phone book program using a HashMap where the key is a person's name and the value is their phone number.
*/

package org.Date12_03_2025;
import java.util.*;
public class PhoneBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Phone Book");
		Map <String,String> map = new HashMap<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			String k = sc.nextLine();
			String v = sc.nextLine();
			map.put(k,v);
		}
		for(Map.Entry<String ,String> s :map.entrySet()) {
			System.out.println(s.getKey()+"\t"+s.getValue());
		} 
	}

}
