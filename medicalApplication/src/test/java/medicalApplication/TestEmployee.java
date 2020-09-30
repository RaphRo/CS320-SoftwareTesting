package medicalApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Employee;


public class TestEmployee {
	private Employee employee;
	
	private String name = "Employee";
	private String id = "01234";
	private String password = "Open";

	// The before annotation gets called before the test run
	@Before
	public void setUp() throws Exception {
		this.employee = new Employee("Employee","01234");
	}
	
	@Test
	public void testConstructor() {
		String expectedName = name.toString();
		String actualName = employee.getName();
		String expectedId = id.toString();
		String actualId = employee.getId();
		String expectedPassword = password.toString();
		String actualPassword = employee.getPassword();
		assertTrue(expectedId.equals(actualId) && expectedName.equals(actualName) && expectedPassword.equals(actualPassword));
	}

	@Test
	public void testGetName() {
		String expectedValue = name.toString();
		String actualValue = employee.getName();
		assertTrue(expectedValue.equals(actualValue));
	}
	
	@Test
	public void testGetId(){
		String expectedValue = id.toString();
		String actualValue = employee.getId();
		assertTrue(expectedValue.equals(actualValue));
	}
	
	@Test
	public void testGetPassword() {
		String expectedValue = password.toString();
		String actualValue = employee.getPassword();
		assertTrue(expectedValue.equals(actualValue)) ;
	}



}
