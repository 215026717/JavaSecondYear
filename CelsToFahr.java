//outputs a table of celsius to fahrenheit and fahrenheit to celsius conversions
import java.util.Scanner;
public class CelsToFahr{
	public static void main(String[] args){
		int i;
		double c = 41.0;
		double f = 130.0;
		System.out.println("Celsius\tFahrenheit\tFahrenheit\tCelsius");
		for (i = 0; i<10;i++){
			c -= 1;
			f -= 10;
			System.out.printf("%.1f\t%.1f\t\t%.1f\t\t%.2f\n",(c),(celsiusToFahrenheit(c)),(f),(fahrenheitToCelsius(f)));
			}
	}
	static double celsiusToFahrenheit(double celsius){
		double fahr=(celsius * 1.8) +32;
		return fahr;
	}
	static double fahrenheitToCelsius(double fahrenheit){
		double cels = (fahrenheit - 32) / 1.8;
		return cels;
	}
}
