package com.zongdw.threadlocal;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadAndThreadLocal {

	private static NotifyContextHelper notifyContextHelper = new NotifyContextHelper();
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		NotifyContext notifyContext = notifyContextHelper.getContext();
		notifyContext.setVariables("test", "abc");
		System.out.println("1:"+notifyContext.getVariables());
		
		TestThreadAndThreadLocal ttat = new TestThreadAndThreadLocal();
		executorService.execute(ttat.new test01(notifyContext));
		BigDecimal sum = new BigDecimal(1);
//		for (int i = 1; i < 100000; i++) {
//			sum.add(new BigDecimal(i));
//		}
		System.out.println("2:"+notifyContext.getVariables());
		
	}
	class test01 implements Runnable{
		NotifyContext notifyContext;
		public test01(){
			System.out.println("t1");
			//默认构造函数能够从main方法中取得notifyContext
			notifyContext = notifyContextHelper.getContext();
		}
		public test01(NotifyContext notifyContext){
			System.out.println("t2");
			this.notifyContext = notifyContext;
		}
		@Override
		public void run() {
			//该处不能从main函数中取得notifyContext的值
//			notifyContext = notifyContextHelper.getContext();
			
			notifyContext.setVariables("tt", "aa");
			System.out.println("3:"+notifyContext.getVariables());
		}
		
	}

}
