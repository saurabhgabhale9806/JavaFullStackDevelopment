package org.handling;
import java.util.*;
import java.io.*;

public class FileOutputStreamApp {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data in file: ");
		String data = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\Doc1.doc",true);
		fo.write(data.getBytes());
		fo.write(System.lineSeparator().getBytes());
		
		fo.close();
		System.out.println("Data Added Succesfully");
	}

}
