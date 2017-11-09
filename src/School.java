import java.util.ArrayList;


/**
 * This is a school object. It is meant to mimic a real school.
 * 
 * Schools have books, students, teachers, principles, classes.
 * 
 * For this homework, create a school that has a list of books. Print that list.
 * 
 * Create other methods that would make sense for a school. Ideas:
 * Add students, remove students, add teachers, open the school, close the school.
 * 
 * Be creative.
 * 
 * CHALLENGE: Can a school have a library?
 * 
 * @author dustin
 *
 */
public class School {
	
	//Variables for this class
	ArrayList<Book> catalog = new ArrayList<Book>();
	int numStudents = 0;
	String name;
	
	public static void main(String args[]) {
		//TODO create a school (similar to the library)
		
		//Print the toString method in school. Such as, school.toString()
		
		//Print any other variables that make sense for a school. Be creative.
	}
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 */
	public String toString() {
		//TODO Write a method to return a list of all books at the school
		return "TODO";
	}
	
	//adds a single student to the school
	public void AddSingleStudent() {
		numStudents++;
		//Do I need a MAX_STUDENTS ???
	}
	
	//removes a single student from the school
	public void removeSingleStudent() {
		if(numStudents > 0) {
			numStudents--;
		}
	}
}
