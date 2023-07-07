package fundamentals;

public class Character {
	
	String name, dialog;
	int hp, mp, lvl;
	
	Character(String name, String dialog, int hp, int mp, int lvl){
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}
	
	void introduce() {
		System.out.println("Hello, my name is " + name);
	}
	
	void talkTo(Character x) {
		System.out.println(name + ": Hello, " + x.name);
	}
	
}
