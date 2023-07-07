package arrayList;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//PRIMITIVE
		/*int a; float b; double c; 
		char d; boolean e; byte f;
		
		//NON PRIMITIVE
		//String name; //Student ab;
		
		//(WRAPPER CLASS)
		//Integer g; //Float h;	//Character i; //Double j; //Boolean k;	//Byte l;*/
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		names.add("Cis"); names.add("Deng"); names.add("Mel");
		nums.add(5); nums.add(7); nums.add(9);
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s = new Student("Francis", "BSECE");
		students.add(s);
		//Can also add this way
		students.add(new Student("Andrea", "BESD"));
		students.add(new Student("Noaim", "BSECE"));
		
		System.out.println(names.get(2));
		s.introduce(); System.out.println();
		//Can also be called this way
		students.get(1).introduce();
		
		//Updating List
		names.set(2, "Johnny");
		System.out.println("\n" + names.get(2) + "\n");
		
		students.set(2, new Student("Carl", "BSIT"));
		students.get(2).introduce();
		System.out.println();
		
		//Delete Value or whole array list
		names.remove(0); 
		//Cis is removed and replaced with Deng
		System.out.println(names.get(0) + "\n");
		
		students.remove(0);
		//Francis is removed and replaced with Andrea
		students.get(0).introduce();
		System.out.println();
		
		//Delete whole list
		//names.clear();
		//System.out.println(names.get(0));
		//error because array has no element
		
		//ArrayList Size
		System.out.println("Size: " + names.size());
		
		//Iterating ArrayList
		for(int x = 0; x < names.size(); x++) {
			System.out.println(names.get(x));
		}
		System.out.println("");
		for(Student x:students) {
			x.introduce();
			System.out.println("");
		}
		
	}

}
