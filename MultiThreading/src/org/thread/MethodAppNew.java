/*Q4. WAP to demonstrate the use of wait(),notify() and notifyAll() methods?
*/

package org.thread;
import java.util.*;
class First1 extends Thread {
	int no;
	public	synchronized void showTable(int no) {
		try {
			for(int i = 1; i <= 10;i++) {
				System.out.println(" "+ no + " * " + i + " = " + i * no );
				if(i == 5) {
					wait();
				}
				sleep(1000);
			}
			
		}
		catch(Exception ex){
			System.out.println("Error is: "+ex.getMessage());
		}
	}
		synchronized void recall()
		   {
			try{
			    notifyAll();
			}
			catch(Exception ex)
			{ 
				System.out.println("Error is "+ex);
			}
			
	}
}
class Second1 extends Thread{
	First1  first;
	void setTable(First1  first) {
		this.first = first;
	}
	public void run() {
		first.showTable(2);
	}
}
public class MethodAppNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First1 first = new First1();
		first.start();
		
		Second1 second = new Second1();
		second.setTable(first);
		second.start();
		
		do{
			 Scanner xyz =new Scanner(System.in);
			  String msg=xyz.nextLine();
			    if(msg.equals("restart"))
			    { 
			    	first.recall();
		        }
			}while(true);

	}

}
