package org.handling;
import java.util.*;
import java.io.*;
public class StoreDataByFileWriterApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data in file: ");
		String data = sc.nextLine();
		
		try (FileWriter fw = new FileWriter("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\MyDoc1.doc",true)){
			fw.write(data);
			System.out.println("Data Succesfully written");
			
		}
		catch(Exception ex) {
			System.out.println("Some Problem there");
			System.out.println("Error is : " + ex);
		}
	}

}
