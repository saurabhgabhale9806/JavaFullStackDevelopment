package org.OppsPractice;

import java.util.*;

class Player {
	private int id;
	private String name;
	private int run;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

}

public class Pojo_01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player();
		System.out.println("🥰=================================🥰============================🥰");
		System.out.println("Enter the Player Details: ");
		System.out.println("Player ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Player Name: ");
		String name = sc.nextLine();
	
		System.out.println("Player Runs: ");
		int runs = sc.nextInt();
		
		player1.setId(id);
		player1.setName(name);
		player1.setRun(runs);
		System.out.println("🥰=================================🥰============================🥰");
		
		System.out.println("\t\t\tID: "+player1.getId());
		System.out.println("\t\t\tName: "+player1.getName());
		System.out.println("\t\t\tRuns: "+player1.getRun());
		System.out.println("🥰=================================🥰============================🥰");
	}

}
