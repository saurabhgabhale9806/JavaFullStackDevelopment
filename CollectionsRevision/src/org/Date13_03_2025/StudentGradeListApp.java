/*Question1 : Student Grade List Using LinkedList
 Description: Use a LinkedList to store student names and their grades. Implement methods to add a student’s grade, 
 display all students and their grades, and remove students who failed (grade below 50).
*/
package org.Date13_03_2025;

import java.util.*;

class Student {
	private String name;
	private int grade;

	public Student() {

	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String toString() {
		return name + " - " + grade;
	}
}

public class StudentGradeListApp {
	//static Student student = new Student();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new LinkedList();
		Student s = new Student();
		for (int i = 0; i < 3; i++) {
			System.out.println("Name: ");
			String name = sc.nextLine();

			System.out.println("Grade: ");
			int id = sc.nextInt();
			sc.nextLine();

			list.add(new Student(name, id));
		}
		System.out.println("Students before removing failure: ");
		dispalyStudents(list);
		
		removeFailedStudent(list);
		
		System.out.println("Students After removing failure: ");
		dispalyStudents(list);

	}
	
	public static void removeFailedStudent(List<Student> list) {
		
		list.removeIf(student -> student.getGrade() < 50);

	}

	public static void dispalyStudents(List<Student> list) {
		for (Student s : list) {
			System.out.println(s);
		}

	}

}