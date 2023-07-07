package arrayOfObjects;

public class Student {
	
	private String firstName, lastName;
	private String course;
	private int year, section;
	
	Student(String firstName, String lastName, String course, int year, int section){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year = year;
		this.section = section;
	}
	
	void introduceSelf() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("CYS : " + course + " " +  year + "-" + section);
		System.out.println();
	}
	
}
