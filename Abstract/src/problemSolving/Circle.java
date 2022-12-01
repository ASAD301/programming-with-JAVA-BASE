package problemSolving;

public class Circle extends Shape {
	
	double area() {
		return Math.PI*super.getLength()*super.getLength();
	}
	
	@Override
	 void display() {
		System.out.println("I'M in Circle class");
		System.out.println(this.area());
	}

}
