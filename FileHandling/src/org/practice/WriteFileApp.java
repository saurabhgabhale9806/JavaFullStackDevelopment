package org.practice;
import java.util.*;
import java.io.*;
public class WriteFileApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path: ");
		String path = sc.nextLine();
		Writer fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter the data to write: ");
		String str = sc.nextLine();
		bw.write(str);
		bw.close();
		fw.close();
		System.out.println("Data Added Successfully 🥰");
	}

}
