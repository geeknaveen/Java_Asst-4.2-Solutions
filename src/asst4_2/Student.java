//Write a program in java to show the difference between is-a relationship 
//and has-a relationship and also show which one is better.

package asst4_2;

/* HAS-A relationship means the use of instance variables that are references to other objects
 * */
public class Student {
	
	Person pers = new Person();
	/*
	 * Student class uses Person 
	 * object’s favBook() method via composition. We can say that Student class HAS-A Person.
	 * 
	 * */
	public void showFavbook() {
		pers.favBook("Life Mantras by Subrata Roy");
	}
}