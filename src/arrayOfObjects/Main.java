package arrayOfObjects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many students to be registered?");
		System.out.print("Number of students: ");
		int size = s.nextInt();
		s.nextLine();
		System.out.print("");
		
		Student students [] = new Student[size];
		
		for (int i = 0; i < students.length; i ++) {
			String firstName, lastName;
			String course;
			int year, section;
			
			System.out.println("Student " + (i+1) + ": ");
			
			System.out.print("First Name: ");
			firstName = s.nextLine();
			System.out.print("Last Name : ");
			lastName = s.nextLine();
			System.out.print("Course    : ");
			course = s.nextLine();
			System.out.print("Year      : ");
			year = s.nextInt(); s.nextLine();
			System.out.print("Section   : ");
			section = s.nextInt(); s.nextLine();
			System.out.println("\n\n");
			
			students[i] = new Student(firstName, lastName, course, year, section);
			
		}
		
		for (Student stud:students) {
			stud.introduceSelf();
		}
		
	}
	
}
