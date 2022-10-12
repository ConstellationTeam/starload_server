package batang.common.entity;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Entity<T extends batang.common.domain.Domain>
{
	public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREAN);
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREAN);

	public abstract T buildDomain();
	
	public abstract void build(T domain);
	
	public static String timestamp2String(Timestamp timestamp)
	{
		if (timestamp == null)
		{
			return null;
		}
		else
		{
			return DATE_TIME_FORMAT.format(timestamp);
		}
	}
	
	public static Timestamp string2Timestamp(String str)
	{
		if (str == null)
		{
			return null;
		}
		
		try
		{
			Date time = DATE_TIME_FORMAT.parse(str);
			return new Timestamp(time.getTime());
		}
		catch (ParseException e)
		{
			return null;
		}
	}

	public static String date2String(Timestamp timestamp)
	{
		if (timestamp == null)
		{
			return null;
		}
		else
		{
			return DATE_FORMAT.format(timestamp);
		}
	}

	public static String date2String(java.sql.Date timestamp)
	{
		if (timestamp == null)
		{
			return null;
		}
		else
		{
			return DATE_FORMAT.format(timestamp);
		}
	}

	public static java.sql.Date string2Date(String str)
	{
		if (str == null)
		{
			return null;
		}
		
		try
		{
			Date time = DATE_FORMAT.parse(str);
			return new java.sql.Date(time.getTime());
		}
		catch (ParseException e)
		{
			return null;
		}
	}
	
	public static java.sql.Date date2Date(Date date)
	{
		if (date == null)
		{
			return null;
		}
		else
		{
			return new java.sql.Date(date.getTime());
		}
	}

	
	public static boolean yn2Boolean(String str)
	{
		return "Y".equals(str);
	}
	
	public static String boolean2Yn(boolean value)
	{
		return (value ? "Y": "N");
	}
}
