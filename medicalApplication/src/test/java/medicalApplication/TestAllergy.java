package medicalApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

public class TestAllergy {
	private  Allergey allergey;
	
	private String name = "WURMS";

	@Before
	public void setUp() throws Exception {
		this.allergey = new Allergey("WURMS");
		
	}

	@Test
	public void testConstructor() {
		String expectedName = name.toString();
		String actualName = allergey.getName();
		assertTrue(expectedName.equals(actualName));
	}

	@Test
	public void testSetName() {
		String expectedValue = "NewWURMS";
		allergey.setName(expectedValue);
		String actualValue = allergey.getName();
		assertTrue(expectedValue.equals(actualValue));
	}
	
	@Test
	public void testToString() {
		String expectedValue = "Allergy " + name;
		String actualValue = allergey.toString();
		assertTrue(expectedValue.equals(actualValue)) ;
	}

}
