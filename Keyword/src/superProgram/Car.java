package superProgram;

public class Car extends Vehicle {



	String company;
	int wheel;
	
	
	public Car(String color, int seat, String type, String company, int wheel) {
		// TODO Auto-generated constructor stub
		super(color , seat, type);
		this.company = company;
		this.wheel = wheel;
	}
	@Override
	void display() {
		super.display();
		System.out.println(company);
		System.out.println(wheel);
		
	}
	
}
