public class Complex{
	private double a,c,b,d;
	public void setComplexNumber1(double real, String imag){
	if (imag.charAt(imag.length())) == "i"{
		try {
			b = Double.parseDouble(imag.substring(0,imag.length()-1));
			a = real;

		}
		catch (NumberFormatException e){
			System.out.println(imag+" is not an imaginary number. Enter in the correct format i.e. 5i");
	}
	else{
		System.out.println(imag+" is not an imaginary number. Enter in the correct format i.e. 5i");
	}
	public void setComplexNumber2(double real, String imag){
	if (imag.charAt(imag.length())) == "i"{
		try {
			d = Double.parseDouble(imag.substring(0,imag.length()-1));
			c = real;

		}
		catch (NumberFormatException e){
			System.out.println(imag+" is not an imaginary number. Enter in the correct format i.e. 5i");
	}
	else{
		System.out.println(imag+" is not an imaginary number. Enter in the correct format i.e. 5i");
	}
	public String getComplexNumber1(){
		return String.format("%f + %fi",a,b);
	}
	public String getComplexNumber2(){
		return String.format("%f + %fi",c,d);
	}
	public String Addition(){
		double realSum = a + c;
		double imagSum = b + d;
		return String.format("%f + %fi",realSum,imagSum);
	}
	public String Subtraction(){
		double realDiff = a - c;
		double imagDiff = b - d;
		return String.format("%f + %fi",realDiff,imagDiff);
	}
	public String Multiplication(){
		double realPro = (a * c) - (b * d);
		double imagPro = (b * c) + (a * d);
		return String.format("%f + %fi",realPro,imagPro);
	}
	public String Division(){
		double realQuo = ((a * c) + (b * d)) / (c*c + d*d);
		double imagQuo = ((b * c) - (a * d)) / (c*c + d*d);
		return String.format("%f + %fi",realQuo,imagQuo);
	}

}