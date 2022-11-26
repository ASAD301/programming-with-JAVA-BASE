package overWriding;

public class Main {

	public static void main(String[] args) {
		System.out.println("run");
		
		Teacher tobject = new Teacher();
		
		tobject.name = "Anis";
		tobject.age = 19;
		tobject.qualification = "MSC in CSE";
		
		tobject.print();
	}

}
