//calculates monthly payments and interest each month on a loan(user input)
import java.lang.Math;
import java.util.Scanner;
public class Loan{
	public static void main(String[] args){
	Scanner in = new Scanner (System.in);
	short l,y;
	int i = 1;
	double rate,intr;
	System.out.print("Loan Amount: ");
	l = in.nextShort();
	System.out.print("Number of Years: ");
	y = in.nextShort();
	System.out.print("Annual Interest Rate: ");
	rate = in.nextDouble();
	rate /= 100;
	double mp = l*rate/12 / (1 - (Math.pow(1 / (1 + rate/12), y * 12)));
	intr = l * (rate/12);
	double Balance = l - (mp - intr);
	System.out.printf("\nMonthly Payment: %.2f%nTotal Payment: %.2f",(mp),(mp*12*y));
	System.out.println("\nPayment#\tInterest\tPrincipal\tBalance\t");
	for (i = 1; i < y*12+1; i++){
		System.out.printf("\n%d\t\t%.2f\t\t%.2f\t\t%.2f",(i),(intr),(mp-intr),Balance);
		intr = Balance * (rate/12);
		Balance -= (mp-intr);
	}
	}
}
