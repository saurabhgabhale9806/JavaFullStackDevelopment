package org.handling;
import java.util.*;
import java.io.*;

public class CopyImageFileHandelApp {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Source path: ");
		String SourcePath = sc.nextLine();
		
		System.out.println("Enter the Destination path: ");
		String DestPath = sc.nextLine();
		
		FileInputStream fis = new FileInputStream(SourcePath);
		FileOutputStream fos = new FileOutputStream(DestPath);
		
		int data ;
		while((data =  fis.read()) != -1) {
			fos.write(data);
		}
		fis.close();
		
		fos.close();
		System.out.println("Image copied in folder");
	}

}
