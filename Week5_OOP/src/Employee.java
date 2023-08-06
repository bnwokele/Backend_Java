
public abstract class Employee {
	// abstract class cannot be instantiated
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportTo;
	
	public Employee(String firstName, String lastName, double pay, String address, String reportTo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
		this.address = address;
		this.reportTo = reportTo;
	}
	
	// will not have an implementation in this class
	// instead it will be implemented by each class that inherits from this class
	// example of polymorphism b/c each class that inherits it will implement it differently
	// so the method is polymorphic
	public abstract double calculatePay();
	
	public String getInformation() {
		return "Name:" + firstName + " " + lastName +
				"\nreports to " + reportTo +
				"\naddress: " + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportTo() {
		return reportTo;
	}

	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

}
