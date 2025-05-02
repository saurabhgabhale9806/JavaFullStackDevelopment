package org.OppsPractice;
import java.util.*;

class OccurenceApp{
	public OccurenceApp(int arr[]){
		int countEven = 0;
		int countOdd = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				countEven++;
			} 
			else {
				countOdd++;
			}
		}
		System.out.println("Total Even Numbers are: "+ countEven);
		System.out.println("Total Odd Numbers are: "+ countOdd);
	}
	public OccurenceApp(char ch[]) {
		int countVowel = 0;
		int countConsonat = 0 ;
		for(int i = 0 ; i < ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U'){
				countVowel++;
			}
			else {
				countConsonat++;
			}
		}
		System.out.println("Total Vowels are: "+countVowel);
		System.out.println("Total Consonant are: "+countConsonat);
	}
}
public class OccuranceApplication {

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
		new OccurenceApp(a);
		System.out.println("Enter the Size of Array: ");
		int size1 = sc.nextInt();

		System.out.println("Enter the Values in Array: ");
		char ch[] = new char[size1];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
		}
		
		new OccurenceApp(ch);
	}

}
