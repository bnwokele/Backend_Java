public class Student {
	
	// use static keyword to denote a property shared by the whole class and each object created from the class
	static int numStudents;
	
	// each object created has their own unique properties
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	// Constructor creates instances of a class
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.phoneNumber = phoneNumber;
	}
	
	// constructor overloading - when we have different constructors that can create objects based on what is passed into the constructor
	public Student() {}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	// method
	
	public void introduce() {
		System.out.println("Hello my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	// getters and setters
	// we can add logic to validate the value that are used to set a property
	// can add logic to control access to the properties
	public void setFirstName(String firstName) {
		if (checkLength(firstName, 1)) {
			this.firstName = firstName;
		}
		
	}
	
	public void setLasttName(String lastName) {
		if (checkLength(lastName, 1)) {
			this.lastName = lastName;
		}
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel <= 12)
		this.gradeLevel = gradeLevel;
		
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLasttName() {
		return lastName;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
