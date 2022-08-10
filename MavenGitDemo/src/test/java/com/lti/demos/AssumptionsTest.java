package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionsTest {

	/*
	 * Assumptions class provides static methods to support conditional test
	 * execution based on assumptions. A failed assumption results in a test being
	 * aborted.
	 * 
	 * Assumptions are typically used whenever it does not make sense to continue
	 * the execution of a given test method. In the test report, these tests will be
	 * marked as passed.
	 * 
	 * Assumptions class has three such methods: assumeFalse(), assumeTrue() and
	 * assumingThat()
	 */

	@Test
	void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
		System.out.println(" pgm continue execution");
	}

	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")), AssumptionsTest::message);
		System.out.println(" don't continue execution");
	}

	private static String message() {
		return "TEST Execution Failed :: ";
	}

}
