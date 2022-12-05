package formate_Specefire;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.846313613553;
		double y = 546543.26546645;
		
		
		DecimalFormat object = new DecimalFormat("0.00");
		
		System.out.println(object.format(x));
		System.out.println(object.format(y));
		
		MethodCheck obj1 = new MethodCheck("Apple", 29);

	}
	
	

}
