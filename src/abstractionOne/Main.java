package abstractionOne;

public class Main {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		d.setName("Doggy");
		d.showName();
		d.makeSound();
		d.walk();
		
		System.out.println("");
		
		c.setName("Cathy");
		c.showName();
		c.makeSound();
		c.walk();
		
	}

}
