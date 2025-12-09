package fr.ynov.srp;

public class HRProvider {

	private EmployeeContract employeeContract;

	public HRProvider(EmployeeContract employeeContract) {
		this.employeeContract = employeeContract;
	}

	public int provideToHRHoursPerWeek() {
		int hours = employeeContract.getWorkedHoursPerDay() * employeeContract.getDaysPerWeek();
		System.out.println("HR, the employee contract indicated " + hours + " hours.");
		return hours;
	}

}
