package org.thread;

class Even extends Thread{
	int no ;
	public Even(int no) {
		this.no = no;
	}
	public void run() {
		try {
			for(int i = 1 ; i <= no ; i++) {
				if(i % 2 == 0) {
					System.out.println("Even----->"+i);
					sleep(1000);
				}
			}
		}
		catch(Exception ex){
			System.out.println("Error is: "+ex.getMessage());
		}
	}
}
class Odd extends Thread{
	int no ;
	public Odd(int no) {
		this.no = no;
	}
	public void run() {
		try {
			for(int i = 1 ; i <= no ; i++) {
				if(i % 2 != 0) {
					System.out.println("Odd----->"+i);
					sleep(1000);
					
				}
			}
		}
		catch(Exception ex){
			System.out.println("Error is: "+ex.getMessage());
		}
	}
}
public class AsyncApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Even even = new Even(10);
		even.start();
	
		Odd odd = new Odd(10);
		odd.start();
		
	}

}
