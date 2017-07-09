package collectioninfo;
//This java file is inside package named collectioninfo inside src folder.

import java.util.*;       
//importing all classes from java's util library.

public class Collection
{
	public static void main(String[] args)     
   //main function declaration.  
	{
		
		TreeSet<Employee> treeSetObject = new TreeSet<Employee>(new SortEmployee());
		//Creating the object of TreeSet and passing the object of the SortEmployees class.
		
		treeSetObject.add(new Employee("Sheetal",01, 400000));
		treeSetObject.add(new Employee("Hitesh", 03, 300000));
		treeSetObject.add(new Employee("Vinay", 02, 300000));
		treeSetObject.add(new Employee("Neha", 02, 400000));
		treeSetObject.add(new Employee("Hitesh", 03, 200000));
		treeSetObject.add(new Employee("Pawan", 02, 200000));
		
	
		for(Employee tempObject : treeSetObject)
			System.out.println(tempObject);    
	}   

}    

