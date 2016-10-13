//test person class and the sub classes
public class PersonTest{
	public static void main(String[] args){
	Person bob = new Person("Coach Bob", 27, "M");
	System.out.println(bob);
	Student lynne = new Student("Lynne Brooke", 16, "F", "HS951293", 3.5);
	System.out.println(lynne);
	Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
	System.out.println(mrJava);
	CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB1233", 4.0, 1, "English"); 
	System.out.println(ima);
	}
}
