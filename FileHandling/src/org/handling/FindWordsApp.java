/*Q4. WAP to read text files using BufferedReader and find its words and character and line from file?
*/
package org.handling;
import java.util.*;
import java.io.*;
public class FindWordsApp {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path = "D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\MyDoc1.doc";
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line ;
		int words = 0;
		int ch = 0;
		int lcount = 0;
		
		while((line = br.readLine()) != null) {
			lcount++;
			ch = ch + line.length();
			String [] word = line.split(" ");
			words = word.length;
		}
		br.close();
		System.out.println("Total Words in file are: "+words);
		System.out.println("Total Characters in file are: "+ch);
		System.out.println("Total l in file are: "+lcount);
	}
}
