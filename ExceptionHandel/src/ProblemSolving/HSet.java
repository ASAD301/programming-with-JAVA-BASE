package ProblemSolving;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj = new HashSet();
		//HashSet work only with Unique Value 
		
		obj.add("Apple");
		obj.add("Guava");
		obj.add("Apple");
		
		for(String i : obj) {
			System.out.println(i);
		}

	}

}
