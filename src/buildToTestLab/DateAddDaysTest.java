package buildToTestLab;

import org.junit.*;
import static org.junit.Assert.*;

public class DateAddDaysTest {
	@Test
	public void testAddOneDayInMonth() {
		Date setDate = new Date ("January", 20, 2019);
		Date datePlusOne = new Date ("January", 21, 2019);
		Date datePlusTwo = new Date ("January", 22, 2019);

		setDate.addOneDay();
		assertEquals(datePlusOne.toString(), setDate.toString());
		
		datePlusOne.addOneDay();
		assertEquals(datePlusTwo.toString(), datePlusOne.toString());
	}
	
	@Test
	public void testAddOneDayAcrossMonth() {
		Date setMonth = new Date ("February", 28, 2019);
		Date monthPlusOne = new Date ("March", 1, 2019);
		Date setMonth2 = new Date ("March", 31, 2019);
		Date monthPlusOne2 = new Date ("April", 1, 2019);
		
		setMonth.addOneDay();
		assertEquals(monthPlusOne.toString(), setMonth.toString());
		
		setMonth2.addOneDay();
		assertEquals(monthPlusOne2.toString(), setMonth2.toString());
		
	}
	
	@Test
	public void testAddOneDayAcrossYear() {
		Date setYear = new Date ("December",31, 2019);
		Date YearPlusOne = new Date ("January", 1, 2020);
		Date setYear2 = new Date ("December", 31, 2025);
		Date YearPlusOne2 = new Date ("January", 1, 2026);
		
		setYear.addOneDay();
		assertEquals(YearPlusOne.toString(), setYear.toString());
		
		setYear2.addOneDay();
		assertEquals(YearPlusOne2.toString(), setYear2.toString());
	}
}
