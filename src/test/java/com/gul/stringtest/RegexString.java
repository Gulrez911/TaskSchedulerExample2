package com.gul.stringtest;

public class RegexString {

	public static void main(String[] args) {
		String ss = "Java-Threading";
		String ss1 = ss.replaceAll(".+-","");
		System.out.println(ss1);
		ss = ss.replaceAll("-.+", "");
		System.out.println(ss);
		String test = "eo21jüdjüqw=realString";
		test = test.replaceAll(".+=", "");
		System.out.println(test);
		
		String val = "Java-Thread-coll";
		if(val.contains("-")) {
			System.out.println("found");
		}
		val = val.replaceAll(".+-", "");
		System.out.println(val);
	}
}
