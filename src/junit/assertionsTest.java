package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class assertionsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("First step");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Last step");
	}

	@Test
	void testadd() {
		int result=20+30;
		assertEquals(50,result);
		
	}
	
	void testNotEqual() {
		int notequ=12*2;
		assertNotEquals(23,notequ);
	}

}
