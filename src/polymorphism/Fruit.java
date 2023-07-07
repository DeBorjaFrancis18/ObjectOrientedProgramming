package polymorphism;

public class Fruit {
	String color, taste, name;
	boolean isSeedless;
	int age;
	
	void showQual() {
		System.out.print("I am " + name + ".");
		System.out.print(" I am " + taste + ".");
	}
	
	void showTraits() {
		System.out.println("Name : " + name);
		System.out.println("Color: " + color);
		System.out.println("Age  : " + age + " days");
		System.out.print("Taste: " + taste);
	}
	
}
