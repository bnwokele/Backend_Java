import java.io.FileNotFoundException;
import java.io.FileReader;

public class java_classes {
	
	/*
	 * 
	 * Object oriented Programming (OOP)
	 * 
	 * DVD Player
	 * 
	 * Properties -
	 *   - Height
	 *   - Weight
	 *   - Color
	 *   
	 * Functionality -
	 *   - Play
	 *   - Fast Forward
	 *   - Rewind
	 *   - Pause
	 *   
	 * Four Pillars
	 * 1. Abstraction
	 *    - Exposing essential features of an object and hiding those that don't matter that much
	 * 2. Encapsulation
	 *    - Hiding inner data of the code so it cannot be manipulated by the users and exposing public features to the users
	 *    - example accessing object properties using dot notation is very bad practice
	 *    - instead use access modifiers
	 *        - Public - accessible everywhere
	 *        - Private - only accessible within the class
	 *        - Protected - accessible within the class, other classes in the same package, and all subclasses
	 *        - No modifier - same as protected except is it is not accessible by subclasses in a different package
	 *        
	 *        - we encapsulate our properties so they do not change in a way we don't want them to
	 *        - we access data using getters and setters
	 * 3. Inheritance
	 *    - Allows objects of classes to inherit from parent classes
	 * 4. Polymorphism
	 *    - One method of a class can take different forms for different objects
	 *    - animals communicate in different ways but they all communicate (method)
	 * 
	 * 
	 * Class - is how we structure our code in OOP
	 * Class is the blueprint
	 * Object is like the actual product developed from the blueprint
	 * Object is an instance of a class
	 * 
	 * Projects only have one main method
	 * 
	 */
	
	public static void main(String[] args) {
		// Class name object / variable name = creating new instance of StringBuilder class
		StringBuilder name = new StringBuilder();
		
		Student student1 = new Student("Ben", "Nwokeleme", "2409858925", 25);
		student1.introduce();
		Student student2 = new Student("Steph", "Smith");
		student2.setLasttName("Nwokeleme");
		student2.introduce();
		
		Rectangle square = new Rectangle(5, 5);
		System.out.println(square.getArea());
		square.setLength(7);
		square.setWidth(7);
		System.out.println(square.getArea());
		
		
		Employee salariedEmployee = new SalariedEmployee("Ben", "Nwokeleme", 150, "D.C.", "Kim");
		Employee hourlyEmployee = new HourlyEmployee("Ned", "Nob", 100, "Philly", "Tim", 80);
		Employee manager = new Manager("Kim", "Yea", 175, "D.C.", "Jim", 10);
		System.out.println(salariedEmployee.calculatePay());
		System.out.println(hourlyEmployee.calculatePay());
		System.out.println(manager.calculatePay());
		
		
		System.out.println("------------------- EXCEPTION HANDLING-----------------");
		/*
		 - exceptions cause the code to crash
		 - 2 types :
		 - checked exception - something we want to explicitly check in our code. so we can handle them if and when they occur. something that we don't always have control over
		 
		 - unchecked exception - an exception that we don't check for. occurs only thrown b/c of coders mistakes
		 - can be avoided by writing clean code
		 - we always have control over these types of exceptions
		 
		*/
		 int[] numbers = new int[3];
		 if (numbers.length > 3) {
			 System.out.println(numbers[3]);
		 }
		
		/*
		 * 	checked exceptions are handled with try/catch blocks
		 * 	reading from an empty file or empty database can throw an error but we might not have known that the file or database was empty
		 */
		// generally don't use try/catch to catch unchecked exceptions like index out of bounds. They should only be used for checked exceptions
		 try {
			 System.out.println(numbers[3]);
			 System.out.println("in the try");
		 } catch (Exception e) {
			 System.out.println(e.toString());
		 }
		 
		 // instead of crashing the program, we print out the exception and the code still runs
		 
		 try {
			 FileReader fileReader = new FileReader("test.txt");
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 } finally {
			 // finally runs no matter if exception is thrown or the code runs successfully
			 System.out.println("finally");
		 }
		 
		 System.out.println("after try catch");
		 
		 try {
			openFile("anotherfile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
		 
		 
		 System.out.println("-------------------Interface-----------------");
		 
		 /*
		  * you can only inherit from one class
		  *  
		  * a house-boat or maybe cruise or yacht can't inherit from a house and boat class, it can only inherit from one of those classes 
		  * 
		  * we want to make an abstract class when we have a general idea of the implementation of the subclasses but we also want some functionality to be handled solely by each individual subclass
		  * 
		  * 
		  * interface solves the multiple inheritance problem
		  * difference between abstract class and interface is that interface has no method definition
		  * - only declare the method signature
		  * - you create the interface when you know what functionality you want but when you don't know how each class that implements the interface will implement it
		  * 
		  * - interface is a contract
		  * - when a class implements an interface, it has to implement all the methods defined in the interface
		  * 
		  * 
		  * Common rule is to code to interface
		  * instead of creating a class, you create an interface with all the methods the class will have and then you create the classes
		  * reason why is b/c if there is any change in the future, instead of changing your class and breaking things, you can just create a new class that implements the same interface and then switch out one class for the other
		  * 
		  */
		 
		 logger logger = new FileLogger();
		 
		 logger.info("Pls God, be with us!");
		 logger.warning("Be better at communication so you reduce chance of losing those you love");
		 logger.error("Major error with letting her go");
		 logger.fatal("Decide soon and commit fully: T, M, or A! No regrets");
		 
		 logger.close();
		 
		 
		 
		 
		 
	}
	
	
	
	// if a method is going to throw an exception add the throws keyword and the exception it will throw
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}

}
