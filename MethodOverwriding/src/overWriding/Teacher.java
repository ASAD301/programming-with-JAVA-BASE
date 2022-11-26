package overWriding;

public class Teacher extends Person {
	String qualification ;
	
	

	@Override
	void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(qualification);
	}
}
