package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {
	
	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {8,46,28,20,38})
	public void testArrParam(int arg) {
		System.out.println("arg: " + arg);
		Assertions.assertTrue(arg%2 == 0);
	}
	
	@Disabled
	@DisplayName("should pass test case if all params not null")
	@ParameterizedTest
	@ValueSource(strings = {"Hdf", "fjfl"})
	public void testStrParams(String arg) {
		Assertions.assertNotNull(arg);
	}
	
	@Test
	public void testLambdaList() {
		Integer[] intArr = {10,20,5,35};
		List<Integer> intList = Arrays.asList(intArr);
		
		Assertions.assertAll(
				() -> assertEquals(10,intList.get(0)),
				() -> assertEquals(20,intList.get(1)),
				() -> assertEquals(5,intList.get(2)),
				() -> assertEquals(35,intList.get(3)),
				() -> assertNull(null)
				);
	}
	
	@RepeatedTest(value=3, name="Repeat 3 times")
	public void repeatTest() {
		int a = 2,b =100;
		Assertions.assertEquals(200, a*b);
	}
}
