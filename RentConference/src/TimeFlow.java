import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeFlow 
{
	private Calendar calendar;
	
	public Calendar getDate (int y, int m, int d) 
	{
		calendar = new GregorianCalendar();
		calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, y);
		calendar.set(Calendar.MONTH, m);
		calendar.set(Calendar.DAY_OF_MONTH, d);
		return calendar;
	}
	public Calendar addDay() 
	{
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return calendar;
	}
	public Calendar subtractDay() 
	{
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return calendar;
	}
}
