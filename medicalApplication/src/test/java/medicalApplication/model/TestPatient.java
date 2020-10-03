package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Patient;

public class TestPatient {
	// I have created an empty car class
		private Patient patient;
		
		private String name = "Patient";
		private String id = "01234";

		// The before annotation gets called before the test run
		@Before
		public void setUp() throws Exception {
			this.patient = new Patient("Patient","01234");
		}
		
		@Test
		public void testConstructor() {
			String expectedName = name.toString();
			String actualName = patient.getName();
			String expectedId = id.toString();
			String actualId = patient.getId();
			assertTrue(expectedId.equals(actualId) && expectedName.equals(actualName));
		}

		@Test
		public void testSetName() {
			String expectedValue = "NewPatient";
			patient.setName(expectedValue);
			String actualValue = patient.getName();
			assertTrue(expectedValue.equals(actualValue));
		}
		
		@Test
		public void testId(){
			String expectedValue = "56789";
			patient.setId(expectedValue);
			String actualValue = patient.getId();
			assertTrue(expectedValue.equals(actualValue));
		}
		
		@Test
		public void testToString() {
			String expectedValue = "Patient Name: "+ name + " ID: "+id;
			String actualValue = patient.toString();
			assertTrue(expectedValue.equals(actualValue)) ;
		}

}