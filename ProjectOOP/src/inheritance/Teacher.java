package inheritance;

public class Teacher extends Person {
	private String qualification;
	String department;
	
	void setQualification() {
		this.qualification = "MSC in CSE";
	}
	
	void getQualification() {
		System.out.println(this.qualification);
	}
}
