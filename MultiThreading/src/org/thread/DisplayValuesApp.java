/*Q1. WAP to create thread using Thread class and display five values with a difference of 10000 milliseconds time slot?
*/

package org.thread;

class MyThread extends Thread{
	public void run() {
		try {
			for(int i = 1; i <= 5;i++) {
				sleep(10000);
				System.out.println(i);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is: "+ex);
		}
	}
}
public class DisplayValuesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
	}

}
