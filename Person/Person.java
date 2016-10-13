class Person {
	protected String myName ; // name of the person 
	protected int myAge; // person's age
	protected String myGender; // "M" for male, "F" for female
	public Person(String name, int age, String gender) {
		myName = name;myAge = age ; myGender = gender; }
	public String toString() { 
		return myName + ", age: " + myAge + ", gender: " +myGender; 
} 
	public String getName(){
		return myName;
	}
	public int getAge(){
		return myAge;
	}
	public String getGender(){
		return myGender;
	}
	public void setName(String A){
		myName = A;
	}
	public void setAge(int A){
		myAge = A;
	}
	public void setGender(String A){
		myGender = A;
	}
}