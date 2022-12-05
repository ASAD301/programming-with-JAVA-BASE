package list;

public class Array {

	public static void main(String[] args) {
		try {
			int[] number = new int[4];
			
			number[0] = 2;
			number[1] = 3;
			number[2] = 5;
			number[3] = 7;
			
			int i = 0;
			for( ; i<4 ; i++) {
				System.out.println(number[i]);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		////////////////////
		try {
			String[] fruit = {"Apple", "Banana", "Guava", "Papaya","Dragon Fruit" };
			
			System.out.println(fruit.length);
			
			//for_each loop 
			for(String i : fruit) {
				System.out.println(i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}


