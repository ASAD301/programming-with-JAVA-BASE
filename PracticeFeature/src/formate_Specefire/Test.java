package formate_Specefire;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.846313613553;
		double y = 546543.26546645;
		
		// Decimal  formate specefire by object 
		DecimalFormat object = new DecimalFormat("0.00");
		
		System.out.println(object.format(x));
		System.out.println(object.format(y));
		
		MethodCheck ob = new MethodCheck("Apple", 29);
		System.out.println(ob);
		

	}
	
	

}
