package org.thread;
import java.util.*;
class First extends Thread{
	private int no;
	public First(int no) {
		this.no = no;
	}
	public void run() {
		try {
			for(int i = 1 ; i <= no ; i++) {
				System.out.println(Thread.currentThread().getName()+i);
				Thread.sleep(500);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is : "+ex.getMessage());
		}
	}
}
class MyThread1 extends Thread{
	private int no;
	public MyThread1(int no) {
		this.no = no;
	}
	public void run() {
		try {
			for(int i = no ; i > 0;i--) {
				System.out.println(Thread.currentThread().getName()+i);
				Thread.sleep(500);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is : "+ex.getMessage());
		}
	}
}
public class MethodApp1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		First t1 = new First(5);
		MyThread1 t2 = new MyThread1(5);
		t1.start();
		t2.start();
		
		try {
			System.out.println(" "+t1.isAlive());
			System.out.println(" "+t2.isAlive());
			
			t1.join();
			t2.join();
		}
		catch(Exception ex) {
			System.out.println("Error is : "+ex.getMessage());
		}
	}

}
