package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.PatientHistory;
import medical.com.medicalApplication.model.Treatment;

public class TestPatientHistory {
	private PatientHistory patientHistory;
	
	//treatment data
	private  Treatment treatment;
	private String treatmentDate = "09/01/2020";
	private String diagnose = "WURMS";
	private String description = "HOLY SHIT ITS WURMS";
	
	//medication data
	private Medication medication;
	private String name = "DRUGS";
	private String startDate = "09/01/01";
	private String endDate = "02/02/02";
	private String dose = "10 L";
	
	//allergy data
	private  Allergey allergey;
	private String allergeyName = "INVERTIBRITS";

	@Before
	public void setUp() throws Exception {
		this.treatment = new Treatment(treatmentDate, diagnose, description);
		this.medication = new Medication(name, startDate, endDate, dose); 
		this.allergey = new Allergey(allergeyName);
		this.patientHistory = new PatientHistory();	
	}
	
	@Test
	public void testConstructor() {
		assertTrue(patientHistory.getAllTreatments().size() == 0 && patientHistory.getAllMedications().size() == 0 && patientHistory.getAlergies().size() == 0 );
	}
	
	@Test
	public void testGetTreatments() {
		assertTrue(patientHistory.getAllTreatments().size() == 0 );
	}
	
	@Test
	public void testGetMedications() {
		assertTrue(patientHistory.getAllMedications().size() == 0 );
	}

	@Test
	public void testgetAlergies() {
		assertTrue(patientHistory.getAlergies().size() == 0 );
	}

	// TODO: Nice job finding this!
	@Test
	public void testAddMedicationNoTreatment() {
		patientHistory.addMedication(medication);
		assertTrue(patientHistory.getAllMedications().size() == 0);
	}
	
	@Test
	public void testAddTreatment() {
		patientHistory.addTreatment(treatment);
		assertTrue(patientHistory.getAllTreatments().size() == 1);
	}
	
	@Test
	public void testAddMultipleTreatment() {
		for(int i = 0; i<=4;++i) {
			patientHistory.addTreatment(treatment);
		}
		assertTrue(patientHistory.getAllTreatments().size() == 5);
	}
	
	@Test
	public void testAddMedication() {
		patientHistory.addTreatment(treatment);
		patientHistory.addMedication(medication);
		assertTrue(patientHistory.getAllMedications().size() == 1);
	}
	
	@Test
	public void testAddMultipleMedications() {
		patientHistory.addTreatment(treatment);
		for(int i = 0; i<=4;++i) {
			patientHistory.addMedication(medication);
		}
		assertTrue(patientHistory.getAllMedications().size() == 5);
	}
	
	@Test
	public void testAddAllergy() {
		patientHistory.addAllergy(allergey);
		assertTrue(patientHistory.getAlergies().size() == 1);
	}
	
	@Test
	public void testAddMultipleAllergy() {
		for(int i = 0; i<=4;++i) {
			patientHistory.addAllergy(allergey);
		}
		assertTrue(patientHistory.getAlergies().size() == 5);
	}

}
