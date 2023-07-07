package fundamentals;

public class Person {
	
	String firstName;
	String lastName;
	String sex;
	int age;
	
	Person(String firstName, String lastName, String sex, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		
		System.out.println("Person Created");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age + " \nSex: " + sex + "\n");
	}
}
