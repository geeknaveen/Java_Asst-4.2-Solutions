//Write a program in java to show the difference between is-a relationship and has-a relationship and also show which one is better.

package asst4_2;
/*
 * IS-A relationship is implemented via Inheritance 
 * HAS-A relationship mean the use of instance variables that are references to other objects
 * */
public class Person {
	
	public String name() {
		return "name";
	}
	
	public void favBook(String book){
		System.out.println("My Favourite Book is : "+book);
	}

}