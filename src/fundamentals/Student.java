package fundamentals;

public class Student {
	String firstName, lastName, course;
	int year, section;
	float midtermGrade, finalGrade;
	
	Student(String firstName, String lastName, 
			String course, int year, int section, 
			float midtermGrade, float finalGrade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year = year;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	}
	
	void introduceSelf() {
		System.out.println("Full Name    : "+ firstName + " " + lastName);
		System.out.println("Course	     : "+ course); 
		System.out.println("Year-Section : "+ year + "-" + section);	
	}
	
	void evaluateGrade() {
		float average = (midtermGrade + finalGrade)/2;
		
		System.out.println("Average	     : " + average);
		System.out.print("Remarks	     : ");
				
		if (average > 100) {
			System.out.println("Invalid Grade");
		}
		else if (average > 98) {
			System.out.println("Highest Honor");
		}
		else if (average > 95) {
			System.out.println("High Honor");
		}
		else if (average > 90) {
			System.out.println("With Honor");
		}
		else if (average > 75) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	
}
