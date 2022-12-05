package Exception_handeling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			int x = 10;
			int y = 0;
			double result =(double) x/y;
			System.out.println("Result :"+result);// if Exception work this line not work
		}catch(Exception object){
			System.out.println("Exception is "+object);
		}
		
		System.out.println("This is the last line of this programe"); 
		
		
		
	}

	

}
