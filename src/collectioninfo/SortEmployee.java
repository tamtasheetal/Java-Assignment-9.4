package collectioninfo;

import java.util.*;       
//importing all classes from java's util library.

public class SortEmployee implements Comparator<Employee>   
//Class declaration extending the Class Comparator.
{
	public int compare(Employee firstEmployee, Employee secondEmployee) 
	{
		
		if(firstEmployee.EmpSalary < secondEmployee.EmpSalary)
		//This will Check if salary of firstEmployee is less.
		{
			return -1;   
		}
		
		else if(firstEmployee.EmpSalary > secondEmployee.EmpSalary)
	    //This will Check if salary of firstEmployee is more.
		{
			return 1;   
		}
		
		else if(firstEmployee.EmpSalary == secondEmployee.EmpSalary)
		//This will Check if salary of both employees are same.
		{
		
			if(firstEmployee.EmpName.compareTo(secondEmployee.EmpName) != 0)
			{
				return firstEmployee.EmpName.compareTo(secondEmployee.EmpName);   
			}
			
			else if(firstEmployee.EmpName.compareTo(secondEmployee.EmpName) == 0)
			{
			
				if(firstEmployee.EmpDesignation < secondEmployee.EmpDesignation)
					return -1;
				else if(firstEmployee.EmpDesignation > secondEmployee.EmpDesignation)
					return 1;
			}
		}
		return 0;
	}
}
