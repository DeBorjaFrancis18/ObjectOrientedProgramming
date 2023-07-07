package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Mango m = new Mango();
		Watermelon w = new Watermelon();
		
		a.showTraits();
		a.showQual();
		System.out.println("\n");
		m.showTraits();
		m.showQual();
		System.out.println("\n");
		w.showTraits();
		w.showQual();
		
	}

}
