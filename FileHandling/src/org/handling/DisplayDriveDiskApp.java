/*Q6. Write a program to display the all drive list from the hard disk on the output screen?*/

package org.handling;
import java.util.*;
import java.io.*;
public class DisplayDriveDiskApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File [] drives = File.listRoots();
		System.out.println("Drives Available in System are: ");
		
		for(File drive : drives) {
			System.out.println(drive);
		}
	}

}
