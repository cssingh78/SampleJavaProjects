package test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.typecast.TestPrimitiveTypeCast;

public class TestCase1 {
	@BeforeClass
	public static void executeOnceBefore() {
		System.out.println(TestCase1.class+": executeOnceBefore called");
	}
	
	@Before
	public void executeBeforeEachMethod() {
		System.out.println(TestCase1.class+": executeBeforeEachMethod called");
	}
	
	@After
	public void executeAfterEachMethod() {
		System.out.println(TestCase1.class+": executeAfterEachMethod called");
	}
	
	@AfterClass
	public static void executeOnceAfter() {
		System.out.println(TestCase1.class+": executeOnceAfter called");
	}

	@Test
	public void testIntSum() {
		System.out.println(TestCase1.class+": testIntSum called");
		Assert.assertEquals(10, TestPrimitiveTypeCast.add(6, 4));
	}

	@Test
	public void testdoubSum() {
		System.out.println(TestCase1.class+": testdoubSum called");
		Assert.assertEquals(10.0,TestPrimitiveTypeCast.add(6.0, 4.0));;
	}

}