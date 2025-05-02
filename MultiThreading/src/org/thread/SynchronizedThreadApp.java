package org.thread;

class EvenSync extends Thread{
	int no ;
	public EvenSync(int no) {
		this.no = no;
	}
	public synchronized void run() {
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
class OddSync extends Thread{
	int no ;
	public OddSync(int no) {
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
public class SynchronizedThreadApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		EvenSync even = new EvenSync(10);
		even.start();
		even.join();
		OddSync odd = new OddSync(10);
		odd.start();
		
	}

}
