import java.util.Scanner;

public class Employee
	{
	// the variables here are private so that they will not be changed except
	// Accidentally, only changed when using the various set methods 
	
		private String firstName;
		private String lastName;
		private Double monthlySalary;
				


public Employee(String first, String last, Double salary)
	{ 
		this.firstName = first;
		this.lastName = last;
		this.monthlySalary = salary;
	} // end Employee constructor


/************************************************************
 * 
 *  The following get methods simply return the appropriate 
 *  variable from the instance  
 *  
 **********************************************************/


public String getFirstName()
	{
		return this.firstName;
	} // end getFirstName

public String getLastName()
	{
		return this.lastName;
	} // end getLastName

public Double getSalary()
	{
		return this.monthlySalary;
	} //end getSalary


/*****************************************************
 * 
 *  The following set methods use the Scanner object
 *  to take keyboard input from the user  
 * 
 *****************************************************/


public void setFirstName()
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("First Name:");
		this.firstName = stdIn.nextLine();
		
	} // end setFirstName

public void setLastName()
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Last Name:");
		this.lastName = stdIn.nextLine();
	} // end setLastName

public void setSalary()
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Monthly Salary:");
		this.monthlySalary = stdIn.nextDouble();
	} //end setSalary

/***************************************************
 * 
 * 	The employeeYearlyRaise method applies a  
 *  fixed 10% raise to the employee's previous salary
 * 
 ****************************************************/


public void employeeYearlyRaise()
{
	this.monthlySalary = this.monthlySalary * 1.1;
}



}// end Employee class



