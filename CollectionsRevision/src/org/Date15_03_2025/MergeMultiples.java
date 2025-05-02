package org.Date15_03_2025;
import java.util.*;
public class MergeMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <String>list = new ArrayList();
		System.out.println("Enter the names : ");
		for(int i = 0 ; i < 5; i++) {
			list.add(sc.nextLine());
		}
		List<String> list1 = new ArrayList();
		System.out.println("Enter the names: ");
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		Set <String> set = new HashSet<>(list);
		set.addAll(list1);
		
		List <String>l = new ArrayList<>(set);
		Collections.sort(l);
		System.out.println(l);
	}

}