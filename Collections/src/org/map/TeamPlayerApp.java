package org.map;
import java.util.*;
public class TeamPlayerApp {

	private static final boolean String = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total team: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		LinkedHashMap <String ,List<String>> team = new LinkedHashMap();
		for(int i = 0 ;i < num; i++) {
			System.out.println("Enter the team Name");
			String tname = sc.nextLine();
			
			System.out.println("Enter the number of players: ");
			int tplayer = sc.nextInt();
			sc.nextLine();
			
			List<String > player = new ArrayList<>();
			for(int j = 0 ; j < tplayer; j++) {
				System.out.println("Name of Player: ");
				String name = sc.nextLine();
				player.add(name);
			}
			team.put(tname, player );
		}
			for(Map.Entry <String ,List<String>> entry : team.entrySet()) {
				System.out.println(entry.getKey());
				int count = 1;
				for (String player : entry.getValue()) {
	                System.out.println(count + ". " + player);
	                count++;
	            }
			}
	}

}
