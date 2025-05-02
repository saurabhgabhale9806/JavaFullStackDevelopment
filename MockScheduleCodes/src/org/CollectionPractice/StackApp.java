package org.CollectionPractice;
import java.util.*;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		
		do {
			System.out.println("==============================================================");
			System.out.println(" 🥰--------------- Stack Application ------------------🥰");
			System.out.println("==============================================================");

			System.out.println("Case 1: push data in stack ");
			System.out.println("Case 2: pop data from stack");
			System.out.println("Case 3: display all data from stack");
			System.out.println("case 4: Exit code...");
			System.out.println("==============================================================");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				//Case 1: push data in stack 
				System.out.println("Enter data in Stack: ");
				for(int i = 0 ; i < 5; i++) {
					stack.push(sc.nextInt());
				}
				break;
				
			case 2:
				//Case 2: pop data from stack
				if(!stack.isEmpty()) {
					System.out.println(stack.pop());
				}else {
					System.out.println("Stack is Empty");
				}

				break;
				
			case 3:
				//Case 3: display all data from stack
				System.out.println(stack);
				break;
				
			case 4:
				//case 4: Exit code...
				System.out.println("Exiting......");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice...");
			}
		}while(true);
		
	}

}
