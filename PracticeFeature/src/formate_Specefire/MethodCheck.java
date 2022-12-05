package formate_Specefire;

public class MethodCheck {
	String name ;
	int age;
	
	MethodCheck(String name , int age){
		this.name = name ;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"\n"+age;
		
	}
	
	
	
	
	
	
}
