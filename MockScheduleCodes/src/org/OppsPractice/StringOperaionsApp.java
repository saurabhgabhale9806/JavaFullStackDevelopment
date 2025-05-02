package org.OppsPractice;
import java.util.*;

interface StringTemplate{
	void setString(String str);
	int getresult();
}
class ExtractDigit implements StringTemplate{
	String str;
	@Override
	public void setString(String str) {
		this.str = str;
	}

	@Override
	public int getresult() {
		char ch[] = str.toCharArray();
		int sum = 0;
		for(int i = 0 ; i < ch.length;i++) {
			if(ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + ch[i] - '0';
			}
		}
		return sum;
	}
	
}
class CountVowel implements StringTemplate{
	String str;
	@Override
	public void setString(String str) {
		this.str = str;
	}

	@Override
	public int getresult() {
		int count = 0;
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
				count++;
			}
		}
		return count;
	}
	
}
class StringHelper{
	void performOperation(StringTemplate template) {
		System.out.println(template.getresult());
	}
}
public class StringOperaionsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		StringHelper help = new StringHelper();
		do {
			System.out.println("\n===================================================");
			System.out.println("case 1: Extract Digit: ");
			System.out.println("case 2: Count Vowel: ");
			System.out.println("case 3: Exit code");
			System.out.println("\n===================================================");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				ExtractDigit ex = new ExtractDigit() ;
				ex.setString(str);
				help.performOperation(ex);
				break;
			case 2:
				CountVowel cv = new CountVowel();
				cv.setString(str);
				help.performOperation(cv);
				break;
			case 3:
				System.out.println("Exiting code..🙏🙏🙏");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice ❌"); 
			}
		}while(true);
	}

}

