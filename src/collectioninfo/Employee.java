package collectioninfo;

//This java file is inside package named package1 inside src folder.

public class Employee    
//Class declaration. 
{
	public String EmpName;    
	//String to store name of Employee.
	public int EmpDesignation;    
	public double EmpSalary;    
	//double variable to store the salary of an Employee.
	
	public Employee(String EmpName, int EmpDesignation, double EmpSalary) 
	{
		this.EmpName = EmpName;
		this.EmpDesignation = EmpDesignation;
		this.EmpSalary = EmpSalary;
	}
	
	
	public String toString()
	//Method to return the information as a String.
	{
		return "Name : "+EmpName+"\nDesignamtion : "+EmpDesignation+"\nSalary : "+EmpSalary+"\n\n";
	}
}

