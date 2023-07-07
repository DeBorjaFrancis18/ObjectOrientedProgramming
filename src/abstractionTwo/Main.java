package abstractionTwo;

public class Main {

	public static void main(String[] args) {
		
		//ABSTRACT IDEA
		// Animal a = new Animal();
		
		Dog d = new Dog();
		Bird b = new Bird();
		Frog f = new Frog();
		
		System.out.print("The dog is ");
		d.walk();
		System.out.print("The dog is ");
		d.swim();
		System.out.print("\nFrog can do: ");
		f.swim();
		f.walk();
		System.out.println("\nBirds can do: ");
		b.fly();
		b.walk();
		
	}

}
