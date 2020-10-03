package medicalApplication.model;

import static org.junit.Assert.*;


import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.services.MedicalRescordService;

public class TestMedicalRecordService {
	
	MedicalRescordService medicalRecordService = MedicalRescordService.getReference();
	
	//allergy data
	private  Allergey allergey;
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetReference() {
		if (medicalRecordService instanceof MedicalRescordService) {
			assertTrue(true);
		} else assertTrue(false);
	}
	
	@Test
	public void testGetAllPatients() {
		
		if(medicalRecordService.getAllPatients() instanceof List<?>) {
			assertTrue(medicalRecordService.getAllPatients().size() == 0);
		}
		else assertTrue(false);
	}
	
	@Test
	public void testAddPatient() {
		assertTrue(medicalRecordService.addPatient("Jerry Garcia", "A2"));
		
	}
	
	@Test
	public void testAddIdenticalPatients() {
		medicalRecordService.addPatient("Jerry Garcia", "A3");
		assertFalse(medicalRecordService.addPatient("Jerry Garcia", "A3"));
		
	}
	
	@Test
	public void testAddMultiplePatients() {
		//System.out.println(medicalRecordService.getAllPatients().size());
	    for(int i =0; i<10; i++) {
	    	medicalRecordService.addPatient("Jerry Garcia", RandomStringUtils.randomAlphanumeric(10));
	    }
	    //System.out.println(medicalRecordService.getAllPatients().size());
	    assertTrue(medicalRecordService.getAllPatients().size() == 12);
	
	}
	
	@Test
	public void testAllergyFindNonePopulated() {
		try {
			assertTrue(medicalRecordService.getPatientsWithAllergies("FUNGUS").size() == 0);
		}
		catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testGetPatient() {
		medicalRecordService.addPatient("Jerry Garcia", "A1");
		//System.out.println(medicalRecordService.getAllPatients().size());
		assertTrue(medicalRecordService.getPatient("A1").getName().equals("Jerry Garcia"));	
	}
	
	@Test
	public void testGetMedicalRecord() {
		if(medicalRecordService.getMedicalRecord("A1") instanceof MedicalRecord) {
		assertTrue(true);	
		} else assertTrue(false);
	}
	
	@Test
	public void testAllergyFindOnePopulated() {
		medicalRecordService.addPatient("Jerry Garcia", "A1");
		this.allergey = new Allergey("NAME");
		medicalRecordService.getMedicalRecord("A1").getHistory().addAllergy(allergey);
	    assertTrue(medicalRecordService.getPatientsWithAllergies("NAME").size() == 1);
	}
	
	@Test
	public void testAllergyFindTwoPopulated() {
		medicalRecordService.addPatient("Jerry Garcia", "A1");
		medicalRecordService.addPatient("Jerry Garcia", "A2");
		this.allergey = new Allergey("NAME");
		medicalRecordService.getMedicalRecord("A1").getHistory().addAllergy(allergey);
		medicalRecordService.getMedicalRecord("A2").getHistory().addAllergy(allergey);
	    assertTrue(medicalRecordService.getPatientsWithAllergies("NAME").size() == 2);
	}


}
