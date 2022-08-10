package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ExceptionsTest {
	
	//dev writes exception - junit checks whether those exceptions are handled or not
	@Disabled
	@Test
	void testExceptions() {
		assertThrows(IllegalArgumentException.class,() -> Integer.parseInt("One"));
	}
	
	@Test
	public void testMethodExp() {
		Calculator c = new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class,
				() -> {c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero", e.getMessage());
	}

}
