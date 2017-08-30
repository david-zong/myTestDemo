package com.zongdw.exception;


public class TestLangException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			int a =1,b=0;
//			System.out.println(a/b);
//		} catch (Exception e) {
//			System.out.println(e.getClass());
//			if (e instanceof ArithmeticException) {
//				System.out.println(true);
//			}
//		}
		
		try {
			Exception exception = new Exception("java.lang.Exception: http://192.168.14.169:8084/integration/http/default: resStatu is 200;[];[x-service-code: 99];[x-service-message: java.lang.reflect.InvocationTargetException]");
			throw exception;
		} catch (Exception e) {
			System.out.println(e);
			if (e.toString().contains("InvocationTargetException")) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}
	
}
