/*Q4. Finding Common Elements Between Two Sets
Write a program that takes two HashSet objects and prints the elements that are common to both
*/

package org.Date12_03_2025;
import java.util.*;
public class CommonElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set set = new HashSet();
		System.out.println("Enter Values in 1st set");
		for(int i = 0; i < 5; i++) {
			set.add(sc.nextInt());
		}
		
		Set st1 = new HashSet();
		System.out.println("Enter Values in 2nd set");
		for(int i = 0; i < 5; i++) {
			st1.add(sc.nextInt());
		}
		
		Set st3 = new HashSet(set);
		st3.retainAll(st1);
		System.out.println(st3);
	}

}
