package ProblemSolving;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			Scanner input = new Scanner(System.in);	
			try {
				
				System.out.print("Please enter number 1 = ");
				int num1 = input.nextInt();
				
				System.out.print("Please enter number 2 = ");
				int num2 = input.nextInt();
				double result = (double) num1/ num2;
				System.out.println("result is:"+result);
				
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("You must input a integer. Please try again");
			}
		}

	}

}
