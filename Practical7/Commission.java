public class Commission extends Hourly{
	protected double Sales = 0;
	protected double commissionRate;
	public Commission(String eName, String eAddress, String ePhone,
String socSecNumber, double payrate, double comRate){
		super(eName, eAddress, ePhone, socSecNumber, payrate);
		commissionRate = comRate;
	}
	public void addSales(double totalSales){
		Sales += totalSales;
	}
	public double pay(){
		double pay = super.pay() + (Sales * commissionRate);
		Sales = 0;
		return pay;
	}
	public String toString(){
		return super.toString() + "\n" + "Total Sales: " + Sales;
	}
}
