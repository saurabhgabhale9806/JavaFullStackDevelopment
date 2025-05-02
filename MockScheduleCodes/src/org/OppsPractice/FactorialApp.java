/*Q2. WAP to create class name as Factorial with two functions 
void setNumber(): this function can accept the number as parameter
void displayFactorial(): this function can display the factorial of number
*/

package org.OppsPractice;
import java.util.*;

class Factorial{
	private int no;
	void setNumber(int no) {
		this.no = no;
	}
	void displayFactorial() {
		int fact = 1;
		for(int i = 1 ; i <= no ; i++) {
			fact =  fact * i;
		}
		System.out.println("Factorial: "+fact);
	}
	
	
}
public class FactorialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		Factorial fact = new Factorial();
		fact.setNumber(num);
		fact.displayFactorial();
		
	}

}
