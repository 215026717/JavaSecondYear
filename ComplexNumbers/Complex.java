public class Complex{
	private double real,imag;
	public Complex(){
	}
	public String toString(){
		return(real+" + "+imag+"i");
	}
	public Complex(double a, String b){
		if (b.charAt(b.length()-1) == 'i'){
			try {
				imag = Double.parseDouble(b.substring(0,b.length()-1));
				real = a;
			}
			catch (NumberFormatException e){
				System.out.println(b+" is not an imaginary number. Enter in the correct format i.e. \"5i\"");
				real = Double.NaN;
				imag = Double.NaN;
				}
		}
		else{
			System.out.println(b+" is not an imaginary number. Enter in the correct format i.e. \"5i\"");
			real = Double.NaN;
			imag = Double.NaN;		
		}
	}
	public void setImag(String b){
		if (!(Double.isNaN((new Complex(0, b)).getImag()))){
			imag = Double.parseDouble(b.substring(0,b.length()-1));
		}
	}
	public void setReal(double a){
		real = a;
	}
	public double getReal(){
		return real;
	}
	public double getImag(){
		return imag;
	}
	public Complex Addition(Complex A, Complex B){
		double realSum = A.getReal() + B.getReal();
		double imagSum = A.getImag() + B.getImag();
		return new Complex(realSum,String.format("%fi",imagSum));
	}
	public Complex Subtraction(Complex A, Complex B){
		double realDiff = A.getReal() - B.getReal();
		double imagDiff = A.getImag() - B.getImag();
		return new Complex(realDiff,String.format("%fi",imagDiff));
	}
	public Complex Multiplication(Complex A,Complex B){
		double realPro = (A.getReal() * B.getReal()) - (A.getImag() * B.getImag());
		double imagPro = (A.getImag() * B.getReal()) + (A.getReal() * B.getImag());
		return new Complex(realPro,String.format("%fi",imagPro));
	}
	public Complex Division(Complex A, Complex B){
		double realQuo = ((A.getReal() * B.getReal()) + (A.getImag() * B.getImag())) / (B.getReal()*B.getReal() + B.getImag()*B.getImag());
		double imagQuo = ((B.getReal() * A.getImag()) - (A.getReal() * B.getImag())) / (B.getReal()*B.getReal() + B.getImag()*B.getImag());
		return new Complex(realQuo,String.format("%fi",imagQuo));
	}
}
