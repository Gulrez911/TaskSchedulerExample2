package com.gul.stringtest;

import java.util.Arrays;

import org.hibernate.mapping.Array;

public class RegexString2 {

	public static void main(String[] args) {
		String ss = "Java-Collection-ArrayList";
		String[] ss2 = ss.split("-");
		for(String sss:ss2) {
			System.out.println(sss);
		}
//		System.out.println(Arrays.toString(ss2));
	}
}
