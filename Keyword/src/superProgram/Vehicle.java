package superProgram;

public class Vehicle {
	String color;
	String type;
	int seat;
	
	Vehicle(String color, int seat, String type){
		this.color = color;
		this.seat = seat;
		this.type = type;
	}
	
	
	void display(){
		System.out.println(color);
		System.out.println(type );
		System.out.println(seat );
	}

}
