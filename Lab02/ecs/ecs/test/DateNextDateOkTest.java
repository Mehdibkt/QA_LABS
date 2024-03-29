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
public class DateNextDateOkTest
{

	private Date actual;
	private Date expectedResult;

	public DateNextDateOkTest(Date actual, Date expected)
	{
		this.actual = actual;
		this.expectedResult = expected;
	}

	@Parameters
	public static List<Date[]> data( )
	{
		List<Date[]> params = new LinkedList<Date[]>( );
		params.add(new Date[] {new Date(1700,06,20), new Date(1700,06,21)});
		params.add(new Date[] {new Date(2005 ,04 ,15), new Date(2005 ,04 ,16)});
		params.add(new Date[] {new Date(1901 ,07 ,20), new Date(1901 ,07 ,21)});
		params.add(new Date[] {new Date(3456 ,03 ,27), new Date(3456 ,03 ,28)});
		params.add(new Date[] {new Date(1500 ,02 ,17), new Date(1500 ,02 ,18)});
		params.add(new Date[] {new Date(1700 ,06 ,29), new Date(1700 ,06 ,30)});
		params.add(new Date[] {new Date(1800 ,11 ,29), new Date(1800 ,11 ,30)});
		params.add(new Date[] {new Date(3453 ,01 ,29), new Date(3453 ,01 ,30)});
		params.add(new Date[] {new Date(444 ,02 ,29), new Date(444 ,03 ,01)});
		params.add(new Date[] {new Date(2005 ,04 ,30), new Date(2005 ,05 ,01)});
		params.add(new Date[] {new Date(3453 ,01 ,30), new Date(3453 ,01 ,31)});
		params.add(new Date[] {new Date(3456 ,03 ,30), new Date(3456 ,03 ,31)});
		params.add(new Date[] {new Date(1901 ,07 ,31), new Date(1901 ,8 ,01)});
		params.add(new Date[] {new Date(3453 ,01 ,31), new Date(3453 ,02 ,01)});
		params.add(new Date[] {new Date(3456 ,12 ,31), new Date(3457 ,01, 01)});
		return params;
	}

	
	@Test
	public void test(){
        Date date = new Date(actual.getYear(),actual.getMonth(),actual.getDay()).nextDate();
		Assert.assertEquals(expectedResult, new Date(date.getYear(),date.getMonth(),date.getDay()) );
	}

}