import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeFlow 
{
	public static Calendar calendar;
	static DateFormat FormatStandard  = new SimpleDateFormat("yyyy/MM/dd");
	static Date CurrentDate;
	static Date ReservationStartDate = (Date) TimeFlow.getCurrentDate();
    static Date ReservationEndDate = (Date) TimeFlow.getCurrentDate();
    
	public static String getCurrentDateString()
	{
		CurrentDate =  new Date();
		return FormatStandard.format(CurrentDate);
	}
	public static Date getCurrentDate()
	{
		CurrentDate =  new Date();
		return CurrentDate;
	}
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
	public static Calendar subtractDay() 
	{
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return calendar;
	}
}
