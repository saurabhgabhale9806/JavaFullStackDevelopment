/*Q6. Frequency Count Using HashMap
Write a program that takes an array of integers and counts the frequency of each element using a HashMap.
*/

package org.revision;
import java.util.*;
public class FrequencyMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter values in array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer count = map.get(a[i]);
			if (count == null) {
				count = new Integer(0);
			}
			System.out.printf("%d\t", a[i]);
			++count;
			map.put(a[i], count);
		}
		System.out.println();
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (Map.Entry<Integer, Integer> m : set) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}

		
		
	}

}
