package com.gul.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class DateClass {

	public static void main(String[] args) throws ParseException {

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		System.out.println(">>>>>>>>>>>> " + cal.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date da = new Date();
		formatter.parse(formatter.format(new Date()));
		System.out.println(formatter.parse(formatter.format(new Date())));
		
		DateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date todayWithZeroTime = formatter2.parse(formatter2.format(today));
		System.out.println("zero:      "+todayWithZeroTime);
		
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Calendar call = Calendar.getInstance();
			System.out.println("Current Date: "+sdf.format(call.getTime()));
			//Adding 1 Day to the current date
			call.add(Calendar.DAY_OF_MONTH, 1);  
			//Date after adding one day to the current date
			String newDate = sdf.format(call.getTime());  
			//Displaying the new Date after addition of 1 Day
			System.out.println("Incremnted current date by one: "+newDate);
			
			Date dd = new Date();
			DateTime dateTime = new DateTime(dd);
			System.out.println("increment date: "+dateTime.plusDays(2));

			Date date = new Date(); // wherever you get this from
			 
			Calendar ca = Calendar.getInstance();
//			ca.setTime(date);
			ca.add(Calendar.DATE, 10); // add 10 days
			 
			date = ca.getTime();
			todayWithZeroTime = ca.getTime();
			System.out.println(">>>>>> "+todayWithZeroTime);
			todayWithZeroTime =  formatter2.parse(formatter2.format(todayWithZeroTime));
			System.out.println("?????????????????    "+todayWithZeroTime);
	}
}
