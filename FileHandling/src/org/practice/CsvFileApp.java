package org.practice;
import java.util.*;
import java.io.*;

public class CsvFileApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

				
		System.out.println("Enter the  path of file" );
		String path = sc.nextLine();
		
		Reader fr = new FileReader(path);
		BufferedReader br =  new BufferedReader(fr);
		String line ;
		
		while((line = br.readLine()) != null) {
			String [] details = line.split(",");
			for(String l : details) {
				System.out.print(l+ "\t\t");
			}
			System.out.println();
		}
		br.close();
		fr.close();
	}

}
