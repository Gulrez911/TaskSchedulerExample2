package com.gul.stringtest;

import java.math.BigDecimal;
import java.text.DateFormatSymbols;

public class DoubleTest {

	public static void main(String[] args) {
		double[][] dd = new double[][] { { 123, 1213 }, { 234, 12134 } };
//		dd.ad

		for (int row = 0; row < dd.length; row++) {
			for (int col = 0; col < dd[row].length; col++) {
				double value = dd[row][col];
//		        System.out.println(value);
//		        System.out.println(dd);
				// Do stuff
			}
		}

		double[]  first =  {12,12};
		int[] ff = {12,14,34};
		double[][] dd2 = new double[][] {{first[0],first[1]},{}} ;

		for (int r = 0; r < dd2.length; r++) {
			for (int c = 0; c < dd2[r].length; c++) {
				dd2[r][c] = 12;// your value
			}
		}
		
//		for (int row = 0; row < dd2.length; row++) {
//			for (int col = 0; col < dd2[row].length; col++) {
//				double value = dd2[row][col];
//				System.out.println(value);
//			}
//		}
		
//		String[][] shades = new String[2][2];
//		// print array in rectangular form
//		for (int r = 0; r < shades.length; r++) {
//			for (int c = 0; c < shades[r].length; c++) {
//				shades[r][c] = "hello";// your value
//			}
//		}
//		for (int row = 0; row < shades.length; row++) {
//			for (int col = 0; col < shades[row].length; col++) {
//				String value = shades[row][col];
//				System.out.println(value);
//			}
//		}
		String[] months = new DateFormatSymbols().getMonths();
		System.out.println("Months: "+months[0]);
	}
}
