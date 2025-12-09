package fr.ynov.srp;

public class EmployeeContract {

	private int daysPerWeek = 5;
	private int hoursPerDay = 7;
	private int workedHoursPerDay = 8;
	
	public int getDaysPerWeek() {
		return daysPerWeek;
	}

	public void setDaysPerWeek(int daysPerWeek) {
		this.daysPerWeek = daysPerWeek;
	}

	public int getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public int getWorkedHoursPerDay() {
		return workedHoursPerDay;
	}

	public void setWorkedHoursPerDay(int workedHoursPerDay) {
		this.workedHoursPerDay = workedHoursPerDay;
	}
	
}
