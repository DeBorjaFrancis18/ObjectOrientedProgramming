package abstractionTwo;

public class Bird implements Animal, airAnimal{
	
	public void makeSound() {
		System.out.println("Chirp!");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void fly() {
		System.out.println("Flying");
	}

}
