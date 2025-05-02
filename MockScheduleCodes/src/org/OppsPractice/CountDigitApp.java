/*Q5. WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.
*/
package org.OppsPractice;
import java.util.*;

class CountDigit{
	private int no ;
	void setValue(int no) {
		this.no = no;
	}
	void showDigitCount() {
		int count = 0;
		for( ; no != 0; no /= 10) {
			count++;
		}
		System.out.println("Total Digits are: "+count);
	}
}
public class CountDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		CountDigit count = new CountDigit();
		count.setValue(num);
		count.showDigitCount();
	}
}
