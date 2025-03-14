package buildToTestLab;

import org.junit.*;
import static org.junit.Assert.*;

public class DateSetDateTest {

	@Test
	public void testLegalSetDate() {
		
		Date date = new Date(11,22,2004);
		
		date.setDate("February", 14, 2003);
		assertEquals("February 14, 2003", date.toString());
		
		date.setDate("January", 18, 1979);
		assertEquals("January 18, 1979", date.toString());
	}
	
	@Test
	public void testIllegalMonth() {
		
		Date date = new Date(11,22,2004);
		
		date.setDate("Blah", 14, 2003);
		assertEquals("November 22, 2004", date.toString());
	}
	
	@Test
	public void testIllegalDay() {
		Date date = new Date(11,22,2004);
		
		date.setDate("January", 31, 2004);
		assertEquals("November 22, 2004", date.toString());
	}
}
