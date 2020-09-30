package medicalApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

public class TestAllergy {
	private  Allergey allergey;

	@Before
	public void setUp() throws Exception {
		this.allergey = new Allergey("WURMS");
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
