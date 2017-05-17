
public class EmployeeDriver 

	{
		public static void main(String[] args)
		{
			
			/*************************************************
			 * 
			 *  This section creates two new instances of the 
			 *  Employee class
			 * 
			 *************************************************/
			Employee employee1 = new Employee(null, null, null);
			Employee employee2 = new Employee(null, null, null);
			
			/****************************************************
			 * 
			 *  This section will initialize the two Employee
			 *  instances using the three set methods in 
			 *  Employee.java
			 * 
			 ****************************************************/
			
			employee1.setFirstName();
			employee1.setLastName();
			employee1.setSalary();
			
			employee2.setFirstName();
			employee2.setLastName();
			employee2.setSalary();
					
			/***************************************************************
			 * 
			 * This section will display the information just entered using 
			 * the set methods
			 * 
			 * 
			 ****************************************************************/
			
			System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "'s monthly salary is: $" + employee1.getSalary());
			System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "'s monthly salary is: $" + employee2.getSalary());
			
			
			/*****************************************************************
			 * 
			 * This section will apply the yearly raise using the 
			 * employeeYearlyRaise method
			 * 
			 *******************************************************************/
			
			employee1.employeeYearlyRaise();
			employee2.employeeYearlyRaise();
			
			/*******************************************************************
			 * 
			 * This section will display the employee's new monthly salary
			 * 
			 ********************************************************************/
			
			System.out.println("After a yearly rasie" + employee1.getFirstName() + " " + employee1.getLastName() + "'s monthly salary is: $" + employee1.getSalary());
			System.out.println("After a yearly rasie" + employee2.getFirstName() + " " + employee2.getLastName() + "'s monthly salary is: $" + employee2.getSalary());
		} // end main
		
	} // end EmployeeDriver
