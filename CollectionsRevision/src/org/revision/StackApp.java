/*Q3.Stack Implementation - Implement a stack using Stack 
  case 1: push()
  case 2: pop()
  case 3: peek() operations.
  case 4: display stack value using last in first out 
*/

package org.revision;
import java.util.*;
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack stack =  new java.util.Stack();
		do {
			System.out.println("case 1: push()");
			System.out.println("case 2: pop()");
			System.out.println("case 3: peek() operations.");
			System.out.println("case 4: display stack value using last in first out ");
			System.out.println("case 5: Exit code...");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:				
				System.out.println("Add elements in Stack: ");
				for(int i = 0; i < 5 ; i++) {
					stack.push(sc.nextInt());
				}			
				break;
			case 2:
				if(stack.isEmpty()) {
					System.out.println("Add some elements in stack");
				}
				else {
					stack.pop();
					System.out.println(stack);
				}
				break;
			case 3:
				if(stack.isEmpty()) {
					System.out.println("Add some elements in stack");
				}
				else {
					
					System.out.println(stack.peek());
				}
				break;
			case 4:
				System.out.println(stack);
				break;
			case 5:
				System.out.println("Exiting code......");
				System.exit(0);
				break;
				
				default:
					System.out.println("Enter the Valid choice");
			}
		}while(true);
	}

}
