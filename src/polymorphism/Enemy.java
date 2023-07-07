package polymorphism;

public class Enemy {
	String name;
	int hp, mp;
	
	void dialog() {
		System.out.println("Please override this.");
	}
	
	void showStats() {
		System.out.println("Name: " + name);
		System.out.println("HP  : " + hp);
		System.out.println("MP  : " + mp);
	}
	
}
