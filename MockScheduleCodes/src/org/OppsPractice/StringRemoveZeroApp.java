/*Q23. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.
*/

package org.OppsPractice;
import java.util.*;

class RemoveLeaningZero{
	String str;
	void setString(String str) {
		this.str = str;
	}
	String getStringWithoutZero() {
		int k = 1;
		char ch[] = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++) {
			if(ch[i] == '0') {
				continue;
			}
			else {
				k = i;
				break;
			}
		}
		String s = "";
		for(int i = k ; i < ch.length ; i++) {
			s = s + ch[i];
		}
		return s;
	}
}
public class StringRemoveZeroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
 		String str = sc.nextLine();
 		
 		RemoveLeaningZero zero = new RemoveLeaningZero();
 		zero.setString(str);
 		
 		System.out.println(zero.getStringWithoutZero());
 		
	}

}
