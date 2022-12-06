package hMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// HashMap works based on key 
		//list & Array works based on index 
		
		HashMap<Integer, String> map = new HashMap();
		map.put(101, "Apple");
		map.put(105, "Banana");
		map.put(103, "Dragon fruit");
		map.put(109, "Guava");
		map.put(102, "Maltra");
		
		
		System.out.println(map.get(105));

	}

}
