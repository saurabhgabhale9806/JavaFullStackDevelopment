/*Q2. Scenario: Race Game Simulation
Scenario Overview: In this simulation, we have multiple players, each running in their own thread.
 The goal is for each player to race to the finish line. The position of each player will be updated 
 in each thread, and we’ll simulate the race by allowing each player to randomly move a small distance
 forward on each update.

Program Steps:
Create a Player class: Represents each player in the game.
Implement the Runnable interface: Each player's movement will be handled by a separate thread.
Run the race: We’ll create a number of players, start their threads, and simulate the race.
Race Outcome: Once a player reaches the finish line, the race will end, and we will announce the winner.

Explanation:
Player Class:
The Player class implements the Runnable interface to allow each player to run in its own thread.
Each player has a position that starts at 0, and the race ends when the player's position reaches or exceeds 
100 (the finish line).
In the run() method, the player randomly moves forward between 1 and 5 units, with a delay of 500 milliseconds 
to simulate real-time movement.
The run() method keeps updating the player's position until they cross the finish line.
RaceGame Class (Main):
The RaceGame class is where the main logic occurs. It creates instances of the Player class 
(representing the racers),then starts their respective threads.
After starting the threads, it waits for all players to finish the race using join() to ensure the main thread 
only finishes once all players have crossed the finish line.
Once all threads are finished, the game announces the race is over.

Key Concepts can use :
Multithreading:
Each player runs in its own thread, allowing for concurrent execution of the game, simulating a race where all 
players move independently.
Synchronization:
In this specific implementation, we don't need explicit synchronization because each player has its own 
independent thread, and we are not sharing data between threads. However, if we were to track the progress or 
make a shared leaderboard , synchronization would be necessary.
Thread Management:
The join() method ensures that the main thread waits for all player threads to finish before declaring the race 
over.
Random Movement:
Each player moves by a random amount, making the race dynamic and unpredictable.

Key Variations You Can Add:
Winner Announcement: You could modify the game to announce the winner when the first player reaches the finish 
line.
Add Power-ups: Introduce random "power-ups" (like double speed) to give players a temporary advantage during the 
race.
Increase Race Complexity: Add obstacles or conditions that could make a player's movement slower or faster 
(such as random delays or speed boosts).
*/

package org.thread;

class Player implements Runnable{
	private String name;
	private int  position = 0;
	private final int FINISH_LINE =  100;
	private static  boolean raceWon = false;
	
	public Player(String name) {
		this.name = name;
	}
	public  void run() {
		int move = 3;
		
		while(position < FINISH_LINE && !raceWon) {
			position = position + move;
			System.out.println(name + " moved to postion "+ position);
			
			if(position >= FINISH_LINE && !raceWon) {
				raceWon = true;
				System.out.println(name+ " has won the race");
			}
			try {
				Thread.sleep(500);
			}
			catch(Exception ex) {
				System.out.println("Error: "+ex);
			}
		}
	}
}

public class RaceGameApp {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		int palyers = 5;
		Thread [] th = new Thread[palyers];
		Player p;
		for(int i = 0; i < th.length;i++) {
		   th[i]=new Thread();
		   
		  p =new Player("player"+i+1);
		
		}
		
		for(Thread thread : th) {
			thread.start();
		}
		for(Thread thread : th) {
			thread.join();
		}

 	}

}