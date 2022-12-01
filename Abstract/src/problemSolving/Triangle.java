package problemSolving;

public class Triangle extends Shape {
	
	private int high;
	
	void setHigh() {
		System.out.println("Enter the high");
		this.high = input.nextInt();
		}
	int getHigh() {
		return this.high;
	}

	/*
	 * AREA of triangle 
	 * */
	double area() {
		return +0.5*this.getHigh()*super.getLength();
	}
	@Override
	 void display() {
		System.out.println("I'M in Triangle class");
		
		System.out.print(this.getHigh()+" ");
		System.out.println(super.getLength());
		System.out.println("The area of Triangle : "+this.area());
	}

}
