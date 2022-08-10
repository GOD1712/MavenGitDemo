package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class CalculatorTests {
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	@Disabled
	@Test
	public void testSubNos() {
		Assertions.assertEquals(5,c.subNos(89, 84));
	}
	
	@Test
	public void testAddNos() {
		Assertions.assertEquals(50, c.addNos(30, 20), "please check addNos method");
		Assertions.assertNotEquals(100, c.addNos(80, 90));
	}
	
	@Test
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Hello";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Hello".length() == 10);
		Assertions.assertFalse(10>20,"10 is smaller");
	}

}
