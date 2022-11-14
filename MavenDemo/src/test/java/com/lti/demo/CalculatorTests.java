package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c = new Calculator();
	@Disabled
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello",c.sayHello());
	}
	@Disabled
	@Test
	public void testadd() {
								//expected   //actual      //message
		Assertions.assertEquals(100, c.add(60, 40), "check the code again");
	}
	
	@Test
	void testAssertNull() {
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	
//	@Test
//	public void testArrayList() {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//	}
}
