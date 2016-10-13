class CollegeStudent extends Student{
	protected String major;
	protected int year;
	public CollegeStudent(String myName,int myAge ,String myGender, String myIdNum, double myGPA, int years, String majors){
		super(myName,myAge,myGender,myIdNum,myGPA);
		year = years;
		major = majors;
	}
	public int getYear(){
		return year;
	}
	public String getMajor(){
		return major;
	}	
	public void setYear(int A){
		year = A;
	}
	public void setMajor(String A){
		major = A;
	}
	public String toString(){
		return super.toString()+", Major: "+major+", Id Num :"+myIdNum + ", GPA: "+myGPA + ", Year of study:"+year;
	}
}
