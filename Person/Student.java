class Student extends Person { 
	protected String myIdNum; // Student Id Number 
	protected double myGPA; // grade point average
	public Student(String name, int age, String gender, String idNum, double gpa){
		super(name,age,gender);
		myIdNum = idNum;
		myGPA = gpa;
	}
	public String getIdNum(){
		return myIdNum;
	}
	public double getGPA(){
		return myGPA;
	}
	public void setIdNum(String A){
		myIdNum = A;
	}
	public void setGPA(double A){
		myGPA = A;
	}
}