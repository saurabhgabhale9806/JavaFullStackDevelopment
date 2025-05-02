package org.thread;

class Abc implements Runnable{
	public void run() {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println("i= "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex){
			System.out.println("Error is: "+ex.getMessage());
		}		
	}
}
public class RunnableApp {

	public static void main(String[] args) {
		Abc a = new Abc();
		Thread t = new Thread(a);
		t.start();
		
	}

}
