public class Executive extends Employee
{
private double bonus;
//-----------------------------------------------------------------
// Sets up an executive with the specified information.
// Note: bonus has yet to be awarded
//-----------------------------------------------------------------
public Executive (String eName, String eAddress, String ePhone,
String socSecNumber, double rate)
{
super(eName, eAddress, ePhone, socSecNumber, rate);
 //IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Awards the specified bonus to this executive.
//-----------------------------------------------------------------
public void awardBonus (double execBonus)
{
bonus = execBonus;
//IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Computes and returns the pay for an executive, which is the
// regular employee payment plus a one-time bonus.
// After bous has been paid, this amount must be reset. 
//-----------------------------------------------------------------
public double pay()
{
double totPay = bonus + payRate;
return totPay;
//IMPLEMENT THIS
}
} 