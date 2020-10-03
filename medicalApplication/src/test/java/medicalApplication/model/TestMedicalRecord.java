package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.PatientHistory;


public class TestMedicalRecord {
	private MedicalRecord medicalRecord;
	
	//Patient data
	private Patient patient;
	private String patientName = "Patient";
	private String id = "01234";
	
	@Before
	public void setUp() throws Exception {
		this.patient = new Patient(patientName,id);
		this.medicalRecord = new MedicalRecord(patient);
	}

	@Test
	public void testGetPatient() {
		Patient expectedPatient = patient;
		Patient actualPatient = medicalRecord.getPatient();
		assertTrue(expectedPatient == actualPatient);
	}
	
	@Test
	public void testGetHistory() {
		if (medicalRecord.getHistory() instanceof PatientHistory) {
			assertFalse(medicalRecord.getHistory() == null);
		}else {
			assertTrue(false);
		}
	}
	

}
