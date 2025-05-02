package org.Date12_03_2025;
import java.util.*;
public class RemoveDuplicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		System.out.println("Enter the elements in Set");
		
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		Set set = new HashSet(list);
		System.out.println(set);
	}

}
