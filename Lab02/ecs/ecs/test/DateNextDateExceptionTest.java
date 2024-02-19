import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Example of a parameterized test case.
 * Parameterized test cases are run multiple times with different data. Two
 * items are needed to set this up: a constructor for instances of this class
 * that assigns the parameters to instance variables, and a method with the
 * &#64;Parameters notation that returns a list of parameter arrays.
 *
 */
@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{

	private int year;
	private int month;
	private int day;
	private IllegalArgumentException expectedResult;

	public DateNextDateExceptionTest(int year, int month, int day, IllegalArgumentException expected)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.expectedResult = expected;
	}

	@Parameters
	public static List<Object[]> data( )
	{
		List<Object[]> params = new LinkedList<Object[]>( );
		params.add(new Object[] {1500 ,02 ,31, new IllegalArgumentException("day must be less than 28 for month February on a non leap year.")});
		params.add(new Object[] {1500 ,02 ,29, new IllegalArgumentException("day must be less than 28 for month February on a non leap year.")});
		params.add(new Object[] {-1 ,10 ,20, new IllegalArgumentException("year must be greater or equal to 0.")});
		params.add(new Object[] {1458 ,15 ,12, new IllegalArgumentException("month must be between 1 and 12.")});
		params.add(new Object[] {1975 ,6 ,-50, new IllegalArgumentException("day must be greater or equal to 1.")});
		return params;
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void test(){

		Date date = new Date(year, month, day).nextDate();
		Assert.assertEquals(expectedResult, new Date(date.getYear(),date.getMonth(),date.getDay()) );
	}

}