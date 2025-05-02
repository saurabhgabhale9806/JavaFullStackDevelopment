package org.practice;
import java.util.*;
import java.io.*;
public class CreateFilleApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path: ");
		String path = "D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\java.txt";
		File file = new File(path);
		boolean b = file.createNewFile();
		if(b) {
			System.out.println("File created successfully");
		}
		else {
			System.out.println("Some problem there: ");
		}
	}

}
