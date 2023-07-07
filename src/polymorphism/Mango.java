package polymorphism;

public class Mango extends Fruit{
	
	Mango(){
		name = "Mango";
		color = "Yellow";
		taste = "Sweet";
		isSeedless = true;
		age = 2;
	}
	
	void showQual() {
		System.out.print(" ^_^ \n");
		
		if(isSeedless){
			System.out.println("I am seedless.");
		}
		
		else {
			System.out.println("I have seeds.");
		}
	}
	
	
}
