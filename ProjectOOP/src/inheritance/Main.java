package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for OOP main");
		
		Teacher tObject = new Teacher();
		
		tObject.setName();
		tObject.setAge();
		tObject.setPhoneNumber();
		tObject.setQualification();
		//get value
		tObject.getAge();
		tObject.getName();
		tObject.getQualification();
		tObject.getphoneNumber();
		// checking inheritance:: Object instanceof Class
		System.out.println(tObject instanceof Person);
		
	}

}
