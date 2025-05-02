package org.OppsPractice;

import java.util.*;

class Reverse1 {

	public Reverse1(int arr[]) {
		int mid = arr.length / 2;
		int end = arr.length - 1;

		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public Reverse1(String str) {
		char[] ch = str.toCharArray();
		int mid = ch.length / 2;
		int end = ch.length - 1;
		for (int i = 0; i < mid; i++) {
			char temp = ch[i];
			ch[i] = ch[end];
			ch[end] = temp;
			end--;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "");
		}
	}
}

public class ReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		System.out.println("Enter the Values in Array: ");
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.nextLine();
		Reverse1 rev = new Reverse1(a);

		System.out.println("\nEnter the String: ");
		String str = sc.nextLine();

		Reverse1 rev1 = new Reverse1(str);
	}

}
