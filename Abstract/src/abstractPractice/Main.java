package abstractPractice;

public class Main {

	public static void main(String[] args) {
		System.out.println("check the abstract use ");
		
		MobileUser obj1  ; // can not make the object 
		// made reference veritable 
		obj1 = new Asad();// create the child class object 
		obj1.message();
		obj1.call();
		
		MobileUser obj2; //reference veritable
		obj2 = new Karim();
		
		obj2.message();
		obj2.call();
		
		
		
		
	}

}
