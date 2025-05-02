/*3. Write a program to print all alphabets from a to z. - using while loop 
*/
package org.Date17_03_2025;
import java.util.*;
public class AlphabateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while(i <= 255) {
			if(i >=97 && i <= 122 ) {
				System.out.printf("%c\t",i);
			}
			i++;
		}
		
		
	}

}
