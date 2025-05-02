/*Question1.
 Space Shooter Game (Firing Bullets)
In this game, the player (thread) controls a spaceship that shoots bullets. The bullets are fired by the player 
in separate threads, simulating the shooting action in a space shooter game.
Scenario Overview:
The player can fire bullets at a rate of one bullet every few milliseconds.
Each bullet is a separate thread that moves across the screen.
*/
package org.thread;

class Bullet implements Runnable{
	private int position = 0 ;
	public void run() {
		while(position < 50) {
			position++;
			System.out.println(Thread.currentThread().getName() + " -Bullet at position " + position );
			try {
				Thread.sleep(100);
			}
			catch(Exception ex) {
				System.out.println("Error is : "+ ex);
			}
		}
		  System.out.println(Thread.currentThread().getName() + " - Bullet reached the end.");
	}
}

class Playerss implements Runnable{
	public void run() {
		int bullet = 0;
		
		while(bullet < 5) {
			Thread bulletThread = new Thread(new Bullet()," Bullet-" + bullet);
			bulletThread.start();
			bullet++;
	           
			try {
				Thread.sleep(500); 
	       } 
			catch (Exception ex) 
			{
	             System.out.println("Error is : "+ex);
	        }
		}
	}
}
public class SpaceShooterGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread player = new Thread(new Playerss(),"Player");
		player.start();

	}

}
