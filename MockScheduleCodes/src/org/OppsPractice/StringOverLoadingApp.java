/* Q24. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.
*/

package org.OppsPractice;

import java.util.*;

class StringOverLoad {
	public void stringOperation(String s) {
		char ch[] = s.toCharArray();
		for(int i = 0 ; i < ch.length; i++) {
			for(int j = i + 1; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
	}

	public void stringOperation(String first, String second) {
		if (first.equals(second)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}

	public void stringOperation(String s, char ch) {
		char c[] = s.toCharArray();
		boolean b = false;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ch) {
				System.out.println("Character found " + ch);
				b = true;
				break;
			}
		}
		if (!b) {
			System.out.println("Character not found  " + ch);
		}
	}
}

public class StringOverLoadingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringOverLoad over = new StringOverLoad();
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("******** String Method OverLoading Operations *********");
			System.out.println("---------------------------------------------------------");

			System.out.println("case 1: Sort String: ");
			System.out.println("case 2: Check String: ");
			System.out.println("case 3: Search Character: ");
			System.out.println("case 4: Exit Code...");

			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------------------------------------");

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter the String: ");
				String s = sc.nextLine();
				over.stringOperation(s);
				System.out.println("=====================================================");
				break;
			case 2:
				sc.nextLine();
				System.out.println("Enter the firstString: ");
				String first = sc.nextLine();

				System.out.println("Enter the firstString: ");
				String second = sc.nextLine();
				over.stringOperation(first, second);
				System.out.println("=====================================================");

				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter the String: ");
				String str = sc.nextLine();

				System.out.println("Enter a character to Search: ");
				char ch = sc.next().charAt(0);
				over.stringOperation(str, ch);
				System.out.println("=====================================================");

				break;
			case 4:
				System.out.println("Exiting code....");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Choice: ");
			}

		} while (true);
	}

}
