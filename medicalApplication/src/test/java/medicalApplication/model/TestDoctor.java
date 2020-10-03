package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;


public class TestDoctor {
	// I have created an empty car class
		private Doctor doctor;
		
		private String name = "Doctor";
		private String id = "01234";

		// The before annotation gets called before the test run
		@Before
		public void setUp() throws Exception {
			this.doctor = new Doctor("Doctor","01234");
		}
		
		@Test
		public void testConstructor() {
			String expectedName = name.toString();
			String actualName = doctor.getName();
			String expectedId = id.toString();
			String actualId = doctor.getId();
			assertTrue(expectedId.equals(actualId) && expectedName.equals(actualName));
		}

		@Test
		public void testSetName() {
			String expectedValue = "NewDoctor";
			doctor.setName(expectedValue);
			String actualValue = doctor.getName();
			assertTrue(expectedValue.equals(actualValue));
		}
		
		@Test
		public void testId(){
			String expectedValue = "56789";
			doctor.setId(expectedValue);
			String actualValue = doctor.getId();
			assertTrue(expectedValue.equals(actualValue));
		}
		
		@Test
		public void testToString() {
			String expectedValue = "Doctor Name:"+ name + " ID: "+id;
			String actualValue = doctor.toString();
			assertTrue(expectedValue.equals(actualValue)) ;
		}

}
