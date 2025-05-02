/*Q7. List Reversal Using LinkedList
Write a program that reverses the order of elements in a LinkedList using an iterator.
*/
package org.Date12_03_2025;
import java.util.*;
public class ReverseListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <Integer>list = new LinkedList<>();
		for(int i = 0 ; i < 5; i++ ) {
			list.add(sc.nextInt());
		}
		List<Integer> rev = new LinkedList<>();
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			rev.addFirst(i.next());
		}
		System.out.println(rev);
	}
}