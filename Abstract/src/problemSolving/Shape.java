package problemSolving;

import java.util.Scanner;

public abstract class Shape {
	
	private int length;
	private int width;
	final double PI = 3.1416;
	
	Scanner input = new Scanner(System.in);
	int  setLength() {
		System.out.println("entr the length");
		return this.length = input.nextInt();
	}
	void getLength() {
		System.out.println(this.length);
	}
	
	void setwidth() {
		System.out.println("entr the width");
		this.width = input.nextInt();
	}
	void getwidth() {
		System.out.println(this.width);
	}
	
	abstract void display();
	
}
