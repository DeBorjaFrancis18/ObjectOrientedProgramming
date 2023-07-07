package abstractionTwo;

public class Frog implements Animal, landAnimal, waterAnimal{
	
	public void makeSound() {
		System.out.println("Ribbit!");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}

}
