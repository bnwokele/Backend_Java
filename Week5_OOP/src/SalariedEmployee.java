
public class SalariedEmployee extends Employee {
	// extends means the class inherits from another class

	public SalariedEmployee(String firstName, String lastName, double pay, String address, String reportTo) {
		super(firstName, lastName, pay, address, reportTo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		
		return this.getPay() * 80;
	}
	 
	

}
