package org.handling;

import java.util.*;
import java.io.*;
public class StoreDataInFileApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to store in file: ");
		String data = sc.nextLine();
		
		Writer write = new FileWriter("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\MyDoc.doc",true);
		BufferedWriter bw = new BufferedWriter(write);
		bw.newLine();
		bw.write(data);
		
		bw.close();
	}
}