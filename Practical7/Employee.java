public class Employee extends StaffMember
{
protected String socialSecurityNumber;
protected double payRate;
//-----------------------------------------------------------------
// Sets up an employee with the specified information.
//-----------------------------------------------------------------
public Employee (String eName, String eAddress, String ePhone,
String socSecNumber, double rate)
{
//IMPLEMENT THIS
super(eName,eAddress, ePhone);
socialSecurityNumber = socSecNumber;
payRate = rate;
}
//-----------------------------------------------------------------
// Returns information about an employee as a string (including their Social Security Number).
//-----------------------------------------------------------------
public String toString()
{
return super.toString() + "\n" + "Social Security Number: " + socialSecurityNumber;
//IMPLEMENT THIS
}
//-----------------------------------------------------------------
// Returns the pay rate for this employee.
//-----------------------------------------------------------------
public double pay()
{
return payRate;
//IMPLEMENT THIS
}
} 