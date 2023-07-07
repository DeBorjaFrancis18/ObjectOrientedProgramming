package polymorphism;

public class Watermelon extends Fruit{
	Watermelon(){
		name = "Watermelon";
		color = "Green";
		taste = "Sweet";
		isSeedless = false;
		age = 3;
	}
	
	void showQual() {
		if(taste == "Sweet") {
			System.out.print(" ^_^ \n");
		}
		else{
			System.out.print(" >_< \n");
		}
		
		if(isSeedless){
			System.out.println("I am seedless.");
		}
		
		else {
			System.out.println("I have seeds.");
		}
	}
}
