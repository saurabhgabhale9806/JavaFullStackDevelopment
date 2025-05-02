package org.OppsPractice;
import java.util.*;
class Reverse{
	private int no;
	void setNumber(int no) {
		this.no = no;
	}
	void reverseNumber() {
		
		int rem = 0;
		int rev = 0;
		
		for( ; no != 0; no /= 10) {
			rem = no % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reversed number is: "+rev);
	}
}
public class ReverseNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		Reverse rev = new Reverse();
		rev.setNumber(num);
		rev.reverseNumber();
	}

}
