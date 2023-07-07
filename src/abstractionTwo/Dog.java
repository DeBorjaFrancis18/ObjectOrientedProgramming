package abstractionTwo;

public class Dog implements Animal, landAnimal, waterAnimal{
	
	public void makeSound() {
		System.out.println("Arf!");
	}
	
	public void walk() {
		System.out.println("Walking");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}

}
