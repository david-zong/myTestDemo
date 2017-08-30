package com.zongdw.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BigDecimal bg = new BigDecimal("12345");
//		String string = "123.45";
//		System.err.println(new BigDecimal(string).multiply(new BigDecimal(100)));
//		System.out.println(bg.compareTo(new BigDecimal(string).multiply(new BigDecimal(100))));
		
//		BigDecimal b1 = new BigDecimal("1000");
//		long amount = 0;
//		System.out.println((new BigDecimal(amount)).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString());
		
		System.out.println(new BigDecimal("0.8").multiply(new BigDecimal("7")));
		System.out.println(new BigDecimal(0.8).multiply(new BigDecimal(7)));
		System.out.println(0.8 * 7);
	}

}
