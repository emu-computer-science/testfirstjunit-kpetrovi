package buildToTestLab;

import org.junit.*;
import static org.junit.Assert.*;

public class DateAddDaysTest {
	@Test
	public void testAddOneDayInMonth() {
		Date setDate = new Date ("January", 20, 2019);
		Date datePlusOne = new Date ("January", 21, 2019);
		Date datePlusTwo = new Date ("January", 22, 2019);
		
		assertEquals(datePlusOne, setDate.addOneDay());
		assertEquals(datePlusTwo, datePlusOne.addOneDay());
	}
	
	@Test
	public void testAddOneDayAcrossMonth() {
		Date setMonth = new Date ("February", 28, 2019);
		Date monthPlusOne = new Date ("March", 1, 2019);
		Date setMonth2 = new Date ("March", 31, 2019);
		Date monthPlusOne2 = new Date ("April", 1, 2019);
		Date setMonth3 = new Date ("November", 30, 2019);
		Date monthPlusOne3 = new Date ("December", 1, 2019);
		
		assertEquals(monthPlusOne, setMonth.addOneDay());
		assertEquals(monthPlusOne2, setMonth2.addOneDay());
		assertEquals(monthPlusOne3, setMonth3.addOneDay());
	}
	
	@Test
	public void testAddOneDayAcrossYear() {
		Date setYear = new Date ("December",31, 2019);
		Date YearPlusOne = new Date ("January", 1, 2020);
		Date setYear2 = new Date ("December", 31, 2025);
		Date YearPlusOne2 = new Date ("January", 1, 2026);
		
		assertEquals(YearPlusOne, setYear.addOneDay());
		assertEquals(YearPlusOne2, setYear2.addOneDay());
	}
}
