package medicalApplication.model;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.services.DoctorService;

public class TestDoctorService {
	DoctorService doctorService = DoctorService.getReference();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test1GetReference() {
		if (doctorService instanceof DoctorService) {
			assertTrue(true);
		} else assertTrue(false);
	}
	
	@Test
	public void test2GetAllDoctors() {
		if(doctorService.getAllDoctors() instanceof List<?>) {
			assertTrue(doctorService.getAllDoctors().size() == 0);
		}
		else assertTrue(false);
	}
	
	@Test
	public void testAddDoctor() {
		doctorService.addDoctor("Jerry Garcia", "A2");
		assertTrue(doctorService.getAllDoctors().size() == 1);
		
	}
	
	@Test
	public void testAddIdenticleDoctors() {
		doctorService.addDoctor("Jerry Garcia", "A2");
		doctorService.addDoctor("Jenny Garcia", "A2");
		assertTrue(doctorService.getAllDoctors().size() == 1);
		
	}
	
	@Test
	public void testAddMultipleDoctors() {

		
		for(int i =0; i<10; i++) {
			doctorService.addDoctor("Jerry Garcia", RandomStringUtils.randomAlphanumeric(10));
	    }
	    //System.out.println(doctorService.getAllDoctors().size());
	    assertTrue(doctorService.getAllDoctors().size() == 13);
	
		
	}

}
