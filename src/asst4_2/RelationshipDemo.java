//Write a program in java to show the difference between is-a relationship and has-a relationship and also show which one is better.

package asst4_2;
/*
 * IS-A relationship based on Inheritance, which can be of two types Class Inheritance or Interface Inheritance.
 * 
 * Has-a relationship is composition relationship which is a productive way of code reuse.
 * 
 * Comparison :
 * ****************************************************************************************
 * The Has-A relationship is preferred because it is more easy to modify later,
 * it's easy to change behavior on the fly with Dependency Injection / Setters.
 * Inheritance is more rigid as Java does not allow to derive from more than one class.
 * 
 * The composition approach to code reuse provides stronger encapsulation than inheritance.
 * 
 * But we should not follow Composition only approach as as some times we might need 
 * complete inheritance.
 * ****************************************************************************************
 * */
public class RelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Below you see that Person is a parent class
	    //and Employee is-A Person so it inherits the parent class Person
	    //so when you can have the below statement because Employee is-A Person
		Person p = new Employee(); //Employee is object of type person
		
		System.out.println("Displaying IS-A relationship : "+p.name());
		
		System.out.println("Displaying Has-A relationship below");
		Student stud = new Student();
		stud.showFavbook();
	}

}