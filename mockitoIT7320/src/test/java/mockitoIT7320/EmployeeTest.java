package mockitoIT7320;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class EmployeeTest {
	
	EmployeeInterface obj;
	EmployeeCompute obj1;
	
	Employee emp;
	double amount;

	@Before
	public void setUp() throws Exception {
		obj1 = new EmployeeCompute();
		amount = 45; 
		
		//employee is part time casual while being a student
		
		emp = new Employee(315, 630, 9);
		
		//Initializing the mock object using Mockito
		 
		obj = Mockito.mock(EmployeeInterface.class);
		Mockito.when(obj.computeTax(amount)).thenReturn((double) 5);
		Mockito.when(obj.weeklySalary(emp)).thenReturn((double) 315);
		Mockito.when(obj.fortnightSalary(emp)).thenReturn((double) 630);
		Mockito.when(obj.computeKiwiSaver(emp)).thenReturn((double) 9);

		
		//setting EmployeeCompute object to Interface object
		obj1.setObj(obj);
		
	}

	@After
	public void tearDown() throws Exception {
		
		//setting EmployeeInterface and Employee compute objects to null
		obj = null;
		obj1 = null;
	}
	
	@Test
	public void testComputeTax() {
		double setAmount = (obj1.computeTax(amount));
		double expectedAmount = amount/9;
		assertEquals((int)setAmount, (int)expectedAmount);
	}
	
	@Test
	public void testWeeklySalary() {
		
		assertEquals(((int)amount * 7), (int)obj1.weeklySalary(emp));
	}
	
	@Test
	public void testComputeKiwiSaver() {
		assertEquals(((int)amount / 5), (int)obj1.computeKiwiSaver(emp));
	}
		
	@Test
	public void testFortnightSalary() {
		assertEquals(((int)amount * 14), (int)obj1.fortnightSalary(emp));
	}
		
	
}
