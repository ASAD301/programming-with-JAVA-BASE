package problemSolving;

public class Triangle extends Shape {
	
	private int high;
	
	void setHigh() {
		System.out.println("Enter the high");
		this.high = input.nextInt();
		}
	
	double area = 1/2*this.high*super.setLength();

	
	@Override
	 void display() {
		System.out.println("I'M in Triangle class");
		System.out.println("The area of Triangle : "+area);
	}

}
