//Q1. WAP to create class name as Table with two functions 
//void setValue(): this function is used for accept number from keyboard 
//void showTable(): this function can display the table of number 

package org.OppsPractice;
import java.util.*;

class Table{
	private int no ;
	void setValue(int no) {
		this.no = no;
	}
	void showTable() {
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(no + " * " + i + " = " + no*i );
		}
	}
}
public class TableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		Table table = new Table();
		table.setValue(num);
		table.showTable();
	}

}
