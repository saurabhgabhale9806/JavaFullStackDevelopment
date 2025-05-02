/*Q3. WAP to create class name as Perfect with two functions 
	void setValue(): this function can accept number as parameter 
	void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect
*/

package org.OppsPractice;
import java.util.*;

class Perfect{
	private int no;
	void setValue(int no) {
		this.no = no;
	}
	void checkPerfect() {
		int sum = 0;
		for(int i = 1 ;i < no ; i++) {
			if(no % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == no) {
			System.out.println(no + " is perfect Number ");
		}
		else {
			System.out.println(no + " is Not perfect Number ");
		}
	}
}
public class PerfectNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		Perfect perfect = new Perfect();
		perfect.setValue(num);
		perfect.checkPerfect();
	}

}
