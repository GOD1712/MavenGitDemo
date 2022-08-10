package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

	Calculator c = new Calculator();
	int sum;
	
	@BeforeAll //only once before all test cases
	public static void testStartDbConn() {
		System.out.println("DB connection is up -- only once");
	}
	
	@BeforeEach //before each test case
	public void testStartup() {
		sum = 0;
		System.out.println("Sum is " + sum);
	}

	@Test
	public void testSubNos() {
		System.out.println("Test case 1 executed");
		Assertions.assertEquals(5,c.subNos(89, 84));
	}
	
	@Test
	public void testAddNos() {
		System.out.println("Test case 2 executed");
		Assertions.assertEquals(50, c.addNos(30, 20), "please check addNos method");
		Assertions.assertNotEquals(100, c.addNos(80, 90));
	}
	
	@AfterEach
	public void testShutDown() {
		System.out.println("Test case execution completed");
	}
	
	@AfterAll
	public static void testDbShutdown() {
		System.out.println("Db connection disabled");
	}

}
