package org.practice;
import java.util.*;
import java.io.*;

public class CreateFolderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path: ");
		String path = sc.nextLine();
		File file = new File(path);
		boolean b = file.mkdir();
		if(b) {
			System.out.println("Directory Created");
		}
		else {
			System.out.println("Some Problem there");
		}
	}

}
