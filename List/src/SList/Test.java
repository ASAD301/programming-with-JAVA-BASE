package SList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with array list 
		try {
			ArrayList<Student> alist = new ArrayList();
			
			Student obj1 = new Student(101, "Karim ", "Eleven");
			Student obj2 = new Student(102, "Rahim ", "Eleven");
			Student obj3 = new Student(103, "kamrul", "Eleven");
			Student obj4 = new Student(104, "Fahim ", "Thirteen");
			Student obj5 = new Student(105, "Toha ", "Eleven");
			
			alist.add(obj1);
			alist.add(obj2);
			alist.add(obj3);
			alist.add(obj4);
			alist.add(obj5);
			
			for(Student i : alist) {
				System.out.println(i.id + " "+i.name + " "+i.className);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\n");
		// with linkedlist 
		
		try {
			LinkedList<Student> llist = new LinkedList();
			
			Student obj1 = new Student(101, "Karim ", "Eleven");
			Student obj2 = new Student(102, "Rahim ", "Eleven");
			Student obj3 = new Student(103, "kamrul", "Eleven");
			Student obj4 = new Student(104, "Fahim ", "Thirteen");
			Student obj5 = new Student(105, "Toha ", "Eleven");
			
			llist.add(obj5);
			llist.add(obj4);
			llist.add(obj3);
			llist.add(obj2);
			llist.add(obj1);
			
			for(Student s : llist ){
				System.out.println(s.id+" "+s.name+" "+s.className);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
