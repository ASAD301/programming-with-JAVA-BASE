package list;

import java.util.LinkedList;

public class LnkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> num = new LinkedList();
		num.add(2);
		num.add(0, 115);
		num.addFirst(9);
		num.addLast(10);
		for(int i : num) {
			System.out.println(i);
		}
		
		System.out.println("Size "+num.size());
	}

}
