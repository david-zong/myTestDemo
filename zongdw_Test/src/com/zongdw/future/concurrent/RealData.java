package com.zongdw.future.concurrent;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {
	private String data;
	
	public RealData(String data) {
		this.data = data;
	}

	@Override
	public String call() throws Exception {
		System.out.println("in call");
		Thread.sleep(3000);
		return "这是处理"+data+"结果";
	}

}
