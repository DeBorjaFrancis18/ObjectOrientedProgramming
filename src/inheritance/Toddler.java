package inheritance;

public class Toddler extends Person{
	
	String faveGame;
	
	Toddler(String name, String sex, int age, String faveGame){
		super(name,sex,age);
		this.faveGame = faveGame;
	}
	
	void drink() {
		System.out.println(name + " is Drinking Milk");
	}
	
	void checkStatus() {
		super.checkStatus();
		System.out.println("Favorite Game: " + faveGame);
	}
	
}
