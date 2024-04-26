package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class caltest {

	calculator cal = new calculator();
	
	@Test
	public void testsum() {
		int result=cal.add(10, 10);
		assertEquals(20,result);
	}
	
	@Test
	public void testsub() {
		int result=cal.diff(5, 10);
		assertEquals(-5,result);
	}
	
	@Test
	public void testmul() {
		int result=cal.prod(10, 10);
		assertEquals(100,result);
	}
	@Test
	public void testdiv() {
		int result=cal.div(10, 2);
		assertEquals(5,result);
	}

}
