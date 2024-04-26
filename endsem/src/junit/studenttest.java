package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class studenttest {
	
	static Student dean;
	
	String name,rollno;
	int age;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		dean=new Student("John","R/BCA-22-124",20);
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
	public void testRoll() {
		rollno=dean.getRollno();
		assertEquals("R/BCA-22-124",rollno);
		assertTrue(rollno.contains("124"));
		
		
	}
	@Test
	public void testname() {
		name=dean.getName();
		assertEquals("John",name);
		assertTrue(name.contains("John"));
		
		
	}
}
