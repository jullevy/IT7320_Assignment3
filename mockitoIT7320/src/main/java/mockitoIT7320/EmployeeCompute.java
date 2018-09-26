package mockitoIT7320;
	
public class EmployeeCompute implements EmployeeInterface {

		EmployeeInterface obj;
		
		public double computeTax(double amount) {
			return obj.computeTax(amount);
		}

		public double weeklySalary(Employee income) {
			return obj.weeklySalary(income);
		}
		
		public double computeKiwiSaver(Employee kiwiOption) {
			return obj.computeKiwiSaver(kiwiOption);
		}

		public double fortnightSalary(Employee income) {
			return obj.fortnightSalary(income);

		}
		public void setObj(EmployeeInterface obj) {
			this.obj = obj;
		}
}


