
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A object = new A() { // no name class
			
			@Override
			void display(){
				System.out.println("Anonymous Class");
			}
			
		} ;// use semicolon must
		
		object.display();
	}

}
