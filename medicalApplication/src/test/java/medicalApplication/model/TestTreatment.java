package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Treatment;

public class TestTreatment {
	private  Treatment treatment;
	private String treatmentDate = "09/01/2020";
	private String diagnose = "WURMS";
	private String description = "HOLY SHIT ITS WURMS";
	

	@Before
	public void setUp() throws Exception {
		this.treatment = new Treatment(treatmentDate, diagnose, description);
		
	}

	@Test
	public void testConstructor() {
		String expectedDate = treatmentDate;
		String actualDate = treatment.getTreatmentDate();
		String expectedDiagnose = diagnose;
		String actualDiagnose = treatment.getDiagnose();
		String expectedDescription = description;
		String actualDescription = treatment.getDescription();
		assertTrue(expectedDate.equals(actualDate) && expectedDiagnose.equals(actualDiagnose) && expectedDescription.equals(actualDescription));
	}

	@Test
	public void testGetDate() {
		String expectedDate = treatmentDate;
		String actualDate = treatment.getTreatmentDate();
		assertTrue(expectedDate.equals(actualDate));
	}
	
	@Test
	public void testGetDiagnose() {
		String expectedDiagnose = diagnose;
		String actualDiagnose = treatment.getDiagnose();
		assertTrue(expectedDiagnose.equals(actualDiagnose));
		}
	
	@Test
	public void testGetDescription() {
		String expectedDescription = description;
		String actualDescription = treatment.getDescription();
		assertTrue(expectedDescription.equals(actualDescription));
	}
	
	@Test
	public void testSetDate() {
		String expectedDate = "09/01/2020";
		treatment.setTreatmentDate(expectedDate);
		String actualDate = treatment.getTreatmentDate();
		assertTrue(expectedDate.equals(actualDate));
	}
	
	@Test
	public void testSetDiagnose() {
		String expectedDiagnose = "KITTIES";
		treatment.setDiagnose(expectedDiagnose);
		String actualDiagnose = treatment.getDiagnose();
		assertTrue(expectedDiagnose.equals(actualDiagnose));
	}
	
	@Test
	public void testSetDescription() {
		String expectedDescription = "PARALYZED FROM CUTENESS";
		treatment.setDescription(expectedDescription);
		String actualDescription = treatment.getDescription();
		assertTrue(expectedDescription.equals(actualDescription));
	}
	
	@Test
	public void testToString() {
		String expectedValue = "Treatment: "+ description +" Date: "+ treatmentDate+ " Diagnose: " + diagnose;
		String actualValue = treatment.toString();
		assertTrue(expectedValue.equals(actualValue)) ;
	}

}