package com.gul.stringtest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class StringClassTest {

	public static void main(String[] args) {
		
		String d1= "1";
//		String exp = "0 0 */"+d1+" ? * *"; // on every second day of month
//		System.out.println(">>>>>>>>>>> "+exp);
		//"hh" in pattern is for 12 hour time format and "aa" is for AM/PM
		//Setting the time zone
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd");
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(dateTimeInGMT.format(new Date()));
		String sss = dateTimeInGMT.format(new Date());
		String exp = "0 0 "+sss+"/"+d1+" ? * *"; 
		System.out.println(">>>>>> "+exp);
		
	}
}
