package medicalApplication.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAllUsers.class, TestMedicalRecord.class, TestPatientHistory.class,
		TestPatientHistoryComponents.class })
public class AllModelTests {

}
