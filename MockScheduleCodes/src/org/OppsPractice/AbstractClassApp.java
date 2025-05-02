/*Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter abstract
 int getResult(): this is abstract method and you have two child class name as Power and you have to 
 override getResult() method in Power class and calculate power of two values and return it as well as
  SearchDigit and you have to override getResult() consider first parameter of setValue() is number
   and second parameter is digit and you have to search digit in number and return it and 
   if digit not found return -1.
*/

package org.OppsPractice;

import java.util.*;

abstract class Value {
	int num1;
	int num2;

	void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	abstract int getResult();
}

class Power extends Value {
	@Override
	int getResult() {
		int power = 1;
		for (int i = 1; i <= num1; i++) {
			power = power * num2;
		}

		return power;
	}

}

class SearchDigit extends Value {

	@Override
	int getResult() {
		int num = num1;
		int digit = num2;

		for (; num != 0; num /= 10) {
			int rem = num % 10;
			if (rem == digit) {
				return digit;
			}
		}
		return -1;
	}

}

public class AbstractClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base = sc.nextInt();

		System.out.println("Enter index: ");
		int index = sc.nextInt();

		Power p = new Power();
		p.setValue(base, index);

		System.out.println("The power is: " + p.getResult());

		System.out.println("Enter number ");
		int num1 = sc.nextInt();

		System.out.println("Enter Digit to search: ");
		int num2 = sc.nextInt();
		SearchDigit digit = new SearchDigit();
		digit.setValue(num1, num2);

		System.out.println(digit.getResult());
	}

}
