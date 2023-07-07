package arrayList;

public class StudentChallenge {
	
	String firstName, lastName;
	String collegeCourse;
	int year, section;
	
	StudentChallenge(String firstName,
			String lastName, String collegeCourse,
			int year, int section){
		this.firstName = firstName;
		this.lastName = lastName;
		this.collegeCourse = collegeCourse;
		this.year = year;
		this.section = section;
	}
	
	void introduceSelf() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("CYS : " + collegeCourse + " " +  year + "-" + section);
		System.out.println();
		
	}
	
}
