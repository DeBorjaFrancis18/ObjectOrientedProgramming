package polymorphism;

public class WeakEnemy extends Enemy{
	
	WeakEnemy(){
		name = "Weak Guy";
		hp = 75;
		mp = 50;
	}
	
	void dialog() {
		System.out.println(name + ": I am weak >_<");
	}
	
}
