package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Medication;

public class TestMedication {
	private Medication medication;
	private String name = "DRUGS";
	private String startDate = "09/01/01";
	private String endDate = "02/02/02";
	private String dose = "10 L";
	@Before
	public void setUp() throws Exception {
		this.medication = new Medication(name, startDate, endDate, dose); 
	}

	@Test
	public void testConstructor() {
		String expectedName = name;
		String actualName = medication.getName();
		String expectedStartDate = startDate;
		String actualStartDate = medication.getStartDate();
		String expectedEndDate = endDate;
		String actualEndDate = medication.getEndDate();
		String expectedDose = dose;
		String actualDose = medication.getDose();
		assertTrue(expectedName.equals(actualName) && expectedStartDate.equals(actualStartDate) && expectedEndDate.equals(actualEndDate) && expectedDose.equals(actualDose));
	}
	
	@Test
	public void testGetName() {
		String expectedName = name;
		String actualName = medication.getName();
		assertTrue(expectedName.equals(actualName));
	}
	
	@Test
	public void testGetStartDate() {
		String expectedStartDate = startDate;
		String actualStartDate = medication.getStartDate();
		assertTrue(expectedStartDate.equals(actualStartDate));
	}
	
	@Test
	public void testGetEndDate() {
		String expectedEndDate = endDate;
		String actualEndDate = medication.getEndDate();
		assertTrue(expectedEndDate.equals(actualEndDate));
	}
	
	@Test
	public void testGetDose() {
		String expectedDose = dose;
		String actualDose = medication.getDose();
		assertTrue(expectedDose.equals(actualDose));
	}
	
	@Test
	public void testSetName() {
		String expectedName = "CLOWNS";
		medication.setName(expectedName);
		String actualName = medication.getName();
		assertTrue(expectedName.equals(actualName));
	}
	
	@Test
	public void testSetStartDate() {
		String expectedStartDate = "01/01/01";
		medication.setStartDate(expectedStartDate);
		String actualStartDate = medication.getStartDate();
		assertTrue(expectedStartDate.equals(actualStartDate));
	}
	
	@Test
	public void testSetEndDate() {
		String expectedEndDate = "01/01/01";
		medication.setEndDate("01/01/01");
		String actualEndDate = medication.getEndDate();
		assertTrue(expectedEndDate.equals(actualEndDate));
	}
	
	@Test
	public void testSetDose() {
		String expectedDose = "5Mg";
		medication.setDose(expectedDose);
		String actualDose = medication.getDose();
		assertTrue(expectedDose.equals(actualDose));
	}
	
	@Test
	public void testToString() {
		String expectedValue = "Medication:"+name + " Start Date: " + startDate + " End Date: "+endDate+ " Dose: "+dose;
		String actualValue = medication.toString();
		assertTrue(expectedValue.equals(actualValue)) ;
	}

}
