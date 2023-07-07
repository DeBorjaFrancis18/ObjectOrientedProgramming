package polymorphism;

public class Apple extends Fruit{
	
	Apple(){
		name = "Apple";
		color = "Red";
		taste = "Sweet";
		isSeedless = true;
		age = 4;
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
