package test.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameters;

import test.singleton.TestSingleton;

//Order of execution of test methods is not guaranteed unless below annotation is used
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCase2 {

	//Timeout rule to applied to all test methods
	  @Rule
	  public final TestName name = new TestName();
	  
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
	           });
	    }

	    private int fInput;

	    private int fExpected;

	    public TestCase2(int input, int expected) {
	        this.fInput = input;
	        this.fExpected = expected;
	    }
	 
	 @Test
	public void testSingleton() {
		Assert.assertNotNull(TestSingleton.getInstance());;
		Assert.assertSame(TestSingleton.getInstance(), TestSingleton.getInstance());
	}
	//Annotation to ignore a test
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testFindBoolean() {
		Assert.assertFalse(false);;
	}

	//Timeout parameter. Test will fail if method execution took longer than timeout (millisecond)
	@Test (timeout=1000)
	public void testListElement() {
		List<String> list = new ArrayList<String>();
		Assert.assertTrue(list !=null);
	}

}
