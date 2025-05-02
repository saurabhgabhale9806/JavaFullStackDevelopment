/*Q11. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class 
VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
VotingMachineApp: this method cantais voter details and pass to VotingMachine class 
*/

package org.OppsPractice;

import java.util.*;

class Voter {

	private int id;
	private String name;
	private int age;

	public Voter() {

	}

	public Voter(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class VotingMachine {

	void acceptWord(Voter... v) {
		System.out.println("-----------------------------------------------------");
		System.out.println("Eligile Voter List: ");
		System.out.println("-----------------------------------------------------");
		System.out.println("ID: \t\tName: \t\tAge: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i].getAge() >= 18) {
				System.out.println(v[i].getId() + "\t\t" + v[i].getName() + "\t\t" + v[i].getAge());
			}
		}
		System.out.println("-----------------------------------------------------");
	}
}

public class VotingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*************Voting Machine Application***************\n");
		System.out.println("Enter total Voters: ");
		int size = sc.nextInt();

		Voter v[] = new Voter[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Voters ID: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.println("Voters Name: ");
			String name = sc.nextLine();

			System.out.println("Voters Age: ");
			int age = sc.nextInt();

			v[i] = new Voter(id, name, age);
		}
		VotingMachine vm = new VotingMachine();
		vm.acceptWord(v);
	}

}
