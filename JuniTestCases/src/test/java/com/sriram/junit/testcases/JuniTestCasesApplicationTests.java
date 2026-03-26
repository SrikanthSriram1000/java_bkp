package com.sriram.junit.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sriram.junit.testcases.practice.Calculation;
import com.sriram.junit.testcases.practice2.ToDoBusinessMock;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(JUnit4.class)
public class JuniTestCasesApplicationTests {

	@Test
	void contextLoads() {
	}



	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testExternalMethods(){
		System.out.println("in externam lmethod ca;l");
		ToDoBusinessMock businessMock = new ToDoBusinessMock();
		businessMock.testusing_Mocks();
	}
	@Test
	public void testFindMax(){
		System.out.println("test case find max");
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		//assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}
	@Test
	public void testCube(){
		System.out.println("test case cube");
		assertEquals(27,Calculation.cube(3));
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}


}
