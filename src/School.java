import java.util.ArrayList;

public class School {
	
	//Variables for this class
	ArrayList<Book> catalog = new ArrayList<Book>();
	int numStudents = 0;
	String name;

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	public static void main(String args[]) {
		//TODO create a school (similar to the library)
		
		//TODO Print the toString method in school. Such as, school.toString()
		
		//TODO Print any other variables that make sense for a school. Be creative.
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
	
	/**
	 * adds a single student to the school
	 */
	public void AddSingleStudent() {
		numStudents++;
		//Do I need a MAX_STUDENTS ???
	}
	
	/**
	 * removes a single student from the school
	 */
	public void removeSingleStudent() {
		if(numStudents > 0) {
			numStudents--;
		}
	}
	
	/**
	 * method to return number of students
	 * 
	 * @return number of students in the school
	 */
	public int getStudents() {
		return numStudents;
	}
}
