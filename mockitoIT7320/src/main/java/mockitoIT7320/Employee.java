package mockitoIT7320;

public class Employee {

	double weeklySalary;
	double fortnightSalary;
	double computeKiwiSaver;
	
	public Employee(double weeklySalary, double fortnightSalary, double computeKiwiSaver) {
		super();
		this.weeklySalary = weeklySalary;
		this.fortnightSalary = fortnightSalary;
		this.computeKiwiSaver = computeKiwiSaver;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getFortnightSalary() {
		return fortnightSalary;
	}

	public void setFortnightSalary(double fortnightSalary) {
		this.fortnightSalary = fortnightSalary;
	}

	public double getComputeKiwiSaver() {
		return computeKiwiSaver;
	}

	public void setComputeKiwiSaver(double computeKiwiSaver) {
		this.computeKiwiSaver = computeKiwiSaver;
	}
	
	
}

