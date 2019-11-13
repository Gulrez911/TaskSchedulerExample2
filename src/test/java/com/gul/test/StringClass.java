package com.gul.test;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "gulfarooqui[1209-1]";
//		String str = "String-with-dash-";
//		    str=str.replace("-", "");
//		    System.out.println(str);
		    
//		    String s1 = "the sdfasdfadr=text";
//		      s1 = s1.substring(s1.indexOf("-")+1);
//		    s1.trim();
//		    System.out.println("............. "+s1);

//		String test = "eo21jüdjüqw=realString";
		String test = "gulfarooqui1[1201-2]";
		test = test.replaceAll(".+-", "").replaceAll("]","");
		
		System.out.println(test);
	}
}
