package finalKey;

public class finalVariable {
	
	final String UNIVERSITY = "BUBT";
	int fees = 1000000;
	
	final int fees1; // this is blank final veriable
	
	finalVariable(int fees){
		this.fees = fees;
		
		//must use constructor for initial the final veriable value 
		this.fees1 = 10000000;
		// for final UNIVERSITY can not change 
	}
	
	void display() {
		System.out.println(this.fees);
		System.out.println(this.fees1);
		
	}
	
	

}
