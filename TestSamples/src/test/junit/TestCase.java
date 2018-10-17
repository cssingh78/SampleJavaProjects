package test.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.singleton.TestSingleton;
/**
 * Possible to run the JUnit test directly from here or from command line by having a separate class
 * All Test related classes will be called from separate class
 * @author Chandra
 *
 */
public class TestCase {
	private static TestSingleton instance;
	
	@BeforeClass
	public static void executeOnceBefore() {
		System.out.println(TestCase.class+": executeOnceBefore called");
		instance = TestSingleton.getInstance();
	}
	
	@Before
	public void executeBeforeEachMethod() {
		System.out.println(TestCase.class+": executeBeforeEachMethod called");
	}
	
	@After
	public void executeAfterEachMethod() {
		System.out.println(TestCase.class+": executeAfterEachMethod called");
	}
	
	@AfterClass
	public static void executeOnceAfter() {
		System.out.println(TestCase.class+": executeOnceAfter called");
	}

	@Test
	public void testSingleton() {
		System.out.println(TestCase.class+": testSingleton called");
		Assert.assertNotNull(instance);;
		Assert.assertSame(instance, TestSingleton.getInstance());
	}

	@Test
	public void testFindBoolean() {
		System.out.println(TestCase.class+": testFindBoolean called");
		Assert.assertFalse(false);;
	}

}
