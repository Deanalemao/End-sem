package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class cartest {
	
	static car cr;
	String name,color;
	int year;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		cr=new car("Mustang","Black",1860);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testname() {
		name=cr.getName();
		assertEquals("Mustang",name);
		
	}

}
