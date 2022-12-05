package list;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> number = new ArrayList();
		
		number.add("Apple");
		number.add("Banana");
		number.add("Guava");
		
		for(String i: number) {
			System.out.println(i);
		}
		System.out.println();
		number.remove(2);
		for(String i : number) {
			System.out.println(i);
		}
		number.add("orange");
		number.set(2, "Dragon");
		
		for(String i : number) {
			System.out.println("is "+i);
		}
		System.out.println(number.size());

	}

}
