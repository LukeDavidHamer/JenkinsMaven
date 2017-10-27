import junit.framework.TestCase;

public class TestClassTest extends TestCase {


	TestClass testClass;
	int x, y;
	
	protected void setUp() throws Exception{
	x = 1;
	y = 5;
	testClass = new TestClass();
	}
	

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		assertEquals(x, testClass.add(1));
	}
	
	public void testBlurb() {
		assertEquals(x, testClass.mod(y));
	}


}
