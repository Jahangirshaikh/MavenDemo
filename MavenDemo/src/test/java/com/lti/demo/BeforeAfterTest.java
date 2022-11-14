package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

	Calculator c = new Calculator();
	int sum;
	@BeforeAll
	public static void testDbConn() {
		System.out.println("conn is up");
	}
	@AfterAll
	public static void testDbclose() {
		System.out.println("cenn is close");
	}
	@BeforeEach
	public void set() {
		sum = 500;
		System.out.println("befor each");
	}
	@AfterEach
	public void clean() {
		System.out.println("clean up");
	}

	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello",c.sayHello());
		sum =sum+1000;
		System.out.println(sum);
	}
	
	@Test
	public void testadd() {
								//expected   //actual      //message
		Assertions.assertEquals(100, c.add(60, 40), "check the code again");
	}
	
	@Test
	void testAssertNull() {
		String str1=null;
		String str2="abcd";
		sum=sum+2000;
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		System.out.println(sum);
	}

}
