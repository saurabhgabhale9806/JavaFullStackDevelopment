/*Question3
Multiplayer Game (Ping-Pong Simulation)
In a simple ping-pong game, we simulate two players hitting the ball back and forth. 
Each player (represented as a thread) will try to hit the ball toward the opponent. If a player misses, 
the game ends.
Scenario Overview: Two threads represent two players.
The ball is passed back and forth between the players.
The game ends when a player fails to hit the ball.
*/
package org.thread;
class PingPongGame{
	private static final int MaxHits = 10;
	private int count = 0; 
	private boolean isPlayer1Turn = true;
	
	public synchronized void hit(String playerName) {
		while((playerName.equals("Player 1") && !isPlayer1Turn) || (playerName.equals("Player 2") && isPlayer1Turn)) {
			try {
				wait();
			}
			catch(Exception ex) {
				System.out.println("Error is: "+ ex.getMessage());
			}
		}
		if(count >= MaxHits) {
			System.out.println(playerName+" missed the ball. Game Over");
			System.exit(0);
		}
		count++;
		System.out.println(playerName+ " hits the ball! Hit count: "+count);
		isPlayer1Turn = !isPlayer1Turn;
		notifyAll();
	}
}
class Players implements Runnable{
	private String name;
	private PingPongGame game;
	public Players(String name, PingPongGame game ) {
		this.name = name;
		this.game = game;
	}
	public void run() {
		while(true) {
			game.hit(name);
			try {
				Thread.sleep(500);
			}
			catch(Exception ex) {
				System.out.println("Error is: "+ex);
			}
		}
	}
}
public class PinPongSimulatonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PingPongGame game = new PingPongGame();
		Thread p1 = new Thread(new Players("Player 1",game));
		Thread p2 = new Thread(new Players("Player 2",game));
		
		p1.start();
		p2.start();
	}
}
