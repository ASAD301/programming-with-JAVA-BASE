package problemSolving;

import java.util.Scanner;

public abstract class Shape {
	
	private int length;
	private int width;
	
	
	Scanner input = new Scanner(System.in);
	void  setLength() {
		System.out.print("entr the length ");
		 length = input.nextInt();
	}
	int getLength() {
		return length;
	}
	
	void setwidth() {
		System.out.print("entr the width ");
		width = input.nextInt();
	}
	int getwidth() {
		return width;
	}
	
	abstract void display();
	
}
