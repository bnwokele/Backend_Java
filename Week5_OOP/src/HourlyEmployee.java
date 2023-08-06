
public class HourlyEmployee extends Employee  {
	
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double pay, String address, String reportTo, double hoursWorked) {
		super(firstName, lastName, pay, address, reportTo);
		this.hoursWorked = hoursWorked;
	}

	
	@Override
	public double calculatePay() {
		return this.getPay() * hoursWorked;
	}
	

	
}
