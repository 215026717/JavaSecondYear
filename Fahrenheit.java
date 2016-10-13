//user inputs temperature in a degrees celsius and program outputs the temperature in fahrenheit
import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	double cels;
	System.out.print("Enter a degree in Celsius: ");
	cels = in.nextDouble();
	double fahr;
	fahr = (cels * 1.8) + 32;
	System.out.println(cels + " Celsius is " + fahr + " Fahrenheit");
	}
}
