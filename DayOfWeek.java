//outputs the day of corresponding user input
import java.util.Scanner;
public class DayOfWeek{
	public static void main(String[] args){
	Scanner in = new Scanner (System.in);
	String a = "";
	System.out.print("Enter year: ");
	short k = in.nextShort();
	System.out.print("Enter month: ");
	short m = in.nextShort();
	if (m == 1 || m == 2){
		k -= 1;
	}
	short j = (short)(k/100);
	k %= 100;
	m = (m == 1) ? (13) : m;
	m = (m == 2) ? (14) : m;
	System.out.print("Enter the day of the month: ");
	short q = in.nextShort();
	int h = (q + ((26*(m+1))/10) + k + (k/4) + (j/4) + (5*j))%7;
	a = (h == 1) ? ("Sunday") : (a);
	a = (h == 2) ? ("Monday") : (a);
	a = (h == 3) ? ("Tuesday") : (a);
	a = (h == 4) ? ("Wednesday") : (a);
	a = (h == 5) ? ("Thursday") : (a);
	a = (h == 6) ? ("Friday") : (a);
	a = (h == 0) ? ("Saturday") : (a);
	System.out.println("Day of the week is "+a);
	}
}
