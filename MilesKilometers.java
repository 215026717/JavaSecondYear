//outputs table of miles to kilometers and kilometers to miles conversions
public class MilesKilometers{
	public static void main(String[] args){
	short i = 0;
	System.out.println("Miles\tKilometers\tKilometers\tMiles");
	for (i = 1; i < 11; i++){
	System.out.printf(i+"\t"+(double)(i*1.609)+"\t\t"+(15+i*5)+"\t\t%.3f%.3f%n",((15+i*5)/1.609));
	}
	}
}
