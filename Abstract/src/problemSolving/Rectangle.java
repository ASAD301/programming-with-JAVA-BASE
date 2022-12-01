package problemSolving;

public class Rectangle extends Shape {
	
	double area() {
		return super.getwidth()*super.getLength();
	}
	
	@Override
	 void display() {
		System.out.println("I'M in Rectangle class");
		System.out.println("Rectangle Area is :"+this.area());
	}

}
