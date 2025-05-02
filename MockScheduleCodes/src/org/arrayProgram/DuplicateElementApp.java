package org.arrayProgram;
import java.util.*;
public class DuplicateElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of array: ");
	      int size = sc.nextInt();

	      System.out.println("Enter the Values in Array: ");
	      int arr[] = new int[size];
	      for (int i = 0; i < arr.length; i++) {
	          arr[i] = sc.nextInt();
	      }	
	      
	      boolean []b = new boolean[size];
	      
	      for(int i = 0 ; i < arr.length; i++) {
	    	  if(b[i]) {
	    		  continue;
	    	  } 	
	    	  int count = 0;
	    	  for(int j = 0 ; j < arr.length; j++) {
	    		  if(arr[i] == arr[j]) {
	    			  count++;    
	    			  b[j] = true;
	    		  }
	    	  }
	    	  if(count > 0) {
	    		  	System.out.printf("%d\t",arr[i]);
	    	  }
	      }
	}

}
