//outputs average accelaration for velocity v0 and v1 over time t (km/h and h or m/s and s respectively)
import java.io.*;
import java.util.Scanner;
public class Acceleration{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double v0;
		double v1;
		double t;
		double ave;
		System.out.print("Enter v0, v1, and t: ");
		v0 = in.nextDouble();
		v1 = in.nextDouble();
		t = in.nextDouble();
		ave = ((v1 - v0) / t);
		System.out.println("The average acceleration is " + ave);
	}
}
