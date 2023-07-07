package inheritance;

public class Kid extends Toddler{
	
	int gradeLevel;
	
	Kid(String name, String sex, int age, String faveGame, int gradeLevel){
		super(name, sex, age, faveGame);
		this.gradeLevel = gradeLevel;
	}
	
	void sayGradeLevel() {
		System.out.println("I am grade" + gradeLevel);
	}

}
