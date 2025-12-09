package fr.ynov.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeContractTest {

	@Test
	public void testProvideToEmployeeHoursPerWeek() {
		
		EmployeeContract employeeContract = new EmployeeContract();
		EmployeeProvider employeeProvider = new EmployeeProvider(employeeContract);

		int result = employeeProvider.provideToEmployeeHoursPerWeek();
		
		assertEquals(35, result);
		
	}
	
	@Test
	public void testProvideToHRHoursPerWeek() {
		
		EmployeeContract employeeContract = new EmployeeContract();
		HRProvider hrProvider = new HRProvider(employeeContract);

		int result = hrProvider.provideToHRHoursPerWeek();
		
		assertEquals(40, result);
		
	}
	
	
}
