class Teacher extends Person {
	protected String subject;
	protected double salary;
	public Teacher(String name, int age, String gender,String sub,double sal){
		super(name,age,gender);
		subject = sub;
		salary = sal;
	}
	public String getSubject(){
		return subject;
	}
	public double getSalary(){
		return salary;
	}	
	public void setSubject(String A){
		subject = A;
	}
	public void setSalary(double A){
		salary = A;
	}	
	public String toString(){
		return super.toString()+", Subject: "+subject+", Salary:"+salary;
	}
}
