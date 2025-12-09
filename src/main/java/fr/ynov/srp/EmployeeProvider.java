package fr.ynov.srp;

public class EmployeeProvider {

	private EmployeeContract employeeContract;

	public EmployeeProvider(EmployeeContract employeeContract) {
		this.employeeContract = employeeContract;
	}

	public int provideToEmployeeHoursPerWeek() {
		int hours = employeeContract.getHoursPerDay() * employeeContract.getDaysPerWeek();
		System.out.println("Employee, your contract indicated " + hours + " hours.");
		return hours;
	}

}
