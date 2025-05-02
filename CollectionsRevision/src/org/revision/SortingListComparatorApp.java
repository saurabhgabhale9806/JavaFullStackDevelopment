package org.revision;

import java.util.*;

class Player {
	private int id;
	private String name;
	private int run;

	public Player(int id, String name, int run) {
		this.id = id;
		this.name = name;
		this.run = run;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRun() {
		return run;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Runs: " + run;
	}
}

class SortPlayerByID implements Comparator<Player> {
	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getId(), p2.getId());
	}
}

class SortPlayerByRun implements Comparator<Player> {
	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getRun(), p2.getRun());
	}
}

public class SortingListComparatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Player> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Runs: ");
			int run = sc.nextInt();
			list.add(new Player(id, name, run));
		}

		do {
			System.out.println("Case 1: sort player by id ");
			System.out.println("Case 2: sort player by run");
			System.out.println("Case 3: Exite code...");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Collections.sort(list, new SortPlayerByID());
				System.out.println("Sort players by ID: \n" + list);
				System.out.println();
				break;
			case 2:
				Collections.sort(list, new SortPlayerByRun());
				System.out.println("Sort players by Run:\n " + list);
				System.out.println();
				break;
			case 3:
				System.out.println("Exiting code......");
				sc.close();
				System.exit(0);
				break;
			}
		} while (true);
	}
}
