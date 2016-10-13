public class Hourly extends Employee
{
private int hoursWorked = 0;
//-----------------------------------------------------------------
// Sets up this hourly employee using the specified information.
// Initially the Employee worked for zero hours.
//-----------------------------------------------------------------
public Hourly (String eName, String eAddress, String ePhone,
String socSecNumber, double rate)
{
super(eName, eAddress, ePhone, socSecNumber, rate);
//IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Adds the specified number of hours to this employee's
// accumulated hours.
//-----------------------------------------------------------------
public void addHours (int moreHours)
{
hoursWorked += moreHours;
//IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Computes and returns the pay for this hourly employee.
// Hourly workers are paid according to the number of hours worked at a set Rate.
// Once they have been paid, the number of hours worked is reset.
//-----------------------------------------------------------------
public double pay()
{
double pay = hoursWorked * payRate;
hoursWorked = 0;
return pay;
//IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Returns information about this hourly employee as a string (including the number of hours worked).
//-----------------------------------------------------------------
public String toString()
{
return super.toString() + "\n" + "Hours Worked" + hoursWorked;
//IMPLEMENT THIS
}
} 