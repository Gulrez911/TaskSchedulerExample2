package com.gul.stringtest;

public class SplitString {

	public static void main(String[] args) {

		String sss = "total-5,correct-3";
//		String sss2 = sss.replaceAll("total-+", "");
//		System.out.println(sss2);
//		sss2 = sss2.replaceAll(",.+", "");
//		System.out.println("Total: "+sss2);
//
//		sss = sss.replaceAll(".+-","");
//		System.out.println("Correct: "+sss);

		String sss2 = sss.replaceAll("total-+", "");
		System.out.println(sss2);
		sss2 = sss2.replaceAll(",.+", "");
		System.out.println("Total: " + sss2);

		sss = sss.replaceAll(".+-", "");
		System.out.println("Correct: " + sss);
		Integer per = Integer.parseInt(sss) * 100 / Integer.parseInt(sss2);
		System.out.println("Percent::::   " + per);

		String str = "gulfarooqui1@gmail.com86-2]";
		if(str.contains("[")) {
			str =str.substring(0, str.indexOf("["));
		}
		System.out.println(str);
	}

}
