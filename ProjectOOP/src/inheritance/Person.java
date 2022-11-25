package inheritance;

import java.util.Scanner;

public class Person {
	Scanner input = new Scanner(System.in);
	private String name ;
	private int age ;
	private String phoneNumber;
	
	void setName() {
		System.out.println("Enter Name");
		this.name = input.next();
	}
	void setAge() {
		System.out.println("Enter Age");
		this.age = input.nextInt();
	}
	void setPhoneNumber() {
		System.out.println( "Enter Phonenumber");
		this.phoneNumber = input.next();
	}
	
	void getName() {
		System.out.println(this.name);
	}
	void getAge() {
		System.out.println(this.age);
	}
	void getphoneNumber() {
		System.out.println(this.phoneNumber);
	}

}
