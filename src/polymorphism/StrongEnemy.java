package polymorphism;

public class StrongEnemy extends Enemy{
	
	StrongEnemy(){
		name = "Strong Dude";
		hp = 150;
		mp = 100;
	}
	
	void dialog() {
		System.out.println(name + ": I am strong ^_^");
	}
}
