package thisKey;

public class A {
	
	A (int age ,String name  ){
		System.out.println(age);
		System.out.println(name);
	}
	
	A (int age ,String name , String home ){
		this(age,name);// constructor calling with this keyword
		System.out.println(home);
	}
	
	void person() {
		System.out.println("I am Person method");
	}
	
	void display() {
		this.person();
		System.out.println("I am display method");
	}
	
	

}
