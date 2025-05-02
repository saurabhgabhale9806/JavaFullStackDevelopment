package org.handling;
import java.util.*;
import java.io.*;

public class DisplayAllFilesFodldersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path: ");
		 String path = sc.nextLine();
		 
		// int count = 0;
		 File dir = new File(path);
		 if(dir.exists() && dir.isDirectory()) {
			 String [] folderAndFiles = dir.list();
			// count = count + folderAndFiles.length;
			// System.out.println("Total File And Folders are: ");
			 System.out.println("Files and folder in the directory: ");
			 for(String name :  folderAndFiles) {
				System.out.println(name);
			 }
		 }
		 else {
			 System.out.println("Invalid Path");
		 }
	}

}
