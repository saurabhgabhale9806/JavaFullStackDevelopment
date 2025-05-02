package org.practice;
import java.util.*;
import java.io.*;
public class ReadFileApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path: ");
		String path = sc.nextLine();
		
		Reader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String data;
		while((data = br.readLine()) != null) {
 			System.out.print(data);
		}
		System.out.print(data);
	}

}
