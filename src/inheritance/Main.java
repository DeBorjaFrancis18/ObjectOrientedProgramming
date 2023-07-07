package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Francis", "Male", 23);
		Toddler t = new Toddler("Andrea", "Female", 23, "Peek-a-boo");
		Kid k = new Kid("Ohm", "Male", 7, "Tumbang Preso", 2);
		
		k.checkStatus();
		k.sayGradeLevel();
		
	}

}
