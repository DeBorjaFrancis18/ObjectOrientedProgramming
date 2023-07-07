package arrayList;

import java.util.*;

public class Challenge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students to be registered?\n");
		System.out.print("Enter number: ");
		int size = scan.nextInt(); scan.nextLine();
		System.out.println("\n--Enter the following details--\n");
		
		ArrayList<StudentChallenge> studs = new ArrayList<StudentChallenge>();
		
		for(int i = 0; i < size; i++) {
			System.out.println("Student " + (i+1));
			System.out.print("First Name: "); String firstName = scan.nextLine();
			System.out.print("Last Name : ");	String lastName = scan.nextLine();
			System.out.print("Course    : ");	String collegeCourse = scan.nextLine();
			System.out.print("Year      : ");	int year = scan.nextInt(); scan.nextLine();
			System.out.print("Section   : ");	int section = scan.nextInt(); scan.nextLine();
			studs.add(new StudentChallenge(firstName, lastName, collegeCourse, year, section));
			System.out.println("");
			
		}
		for(StudentChallenge x:studs) {
			System.out.println("Student " + (studs.indexOf(x)+1));
			x.introduceSelf();
		}
	}

}
