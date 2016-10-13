public class ComplexTest{
	public static void main(String[] args){
		Complex a = new Complex(5 , "5i");
		Complex b = new Complex(10, "10i");
		Complex d = new Complex();
		System.out.println(d.Addition(a,b));
		System.out.println(d.Subtraction(a,b));
		System.out.println(d.Multiplication(a,b));
		System.out.println(d.Division(a,b));
		System.out.println(a.getImag());
		a.setImag("7i4");
		System.out.println(a);
		a.setImag("7i");
		System.out.println(a);
		
	}
}