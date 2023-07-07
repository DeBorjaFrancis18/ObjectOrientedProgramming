package fundamentals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the following:");
		System.out.print("First Name: ");
		String firstName = s.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = s.nextLine();
		
		System.out.print("Sex      : ");
		String sex = s.nextLine();
		
		System.out.print("Age      : ");
		int age= s.nextInt();
		
		Person p = new Person(firstName, lastName, sex, age);
		
		
		
	}

}