
public class Manager extends Employee {
	
	private double bonusPercentage;
	
	public Manager(String firstName, String lastName, double pay, String address, String reportTo, double bonusPercentage) {
		super(firstName, lastName, pay, address, reportTo);
		this.bonusPercentage = bonusPercentage;
	}
	
	@Override
	public double calculatePay() {
		
		return this.getPay() * 80 * bonusPercentage;
	}
	
	
	
}
