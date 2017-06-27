//Write a program in java to show the difference between is-a relationship and has-a relationship and also show which one is better.

package asst4_2;

//Here we have established an IS-A Relationship Where "Employee" is a Person
/*
* Where ever you see extend keyword or implements keyword in a class declaration, then this class is said to have IS-A relationship.
* 
* IS - A relationship is uni-directional means an Employee is a Person but All Persons are not Employees
* */
public class Employee extends Person{
	
	public String name() {
		return "INDIA";
	}
}