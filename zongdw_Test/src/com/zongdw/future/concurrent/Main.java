package com.zongdw.future.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) throws Exception {
		Long start = System.currentTimeMillis();
		FutureTask<String> futureTask = new FutureTask<String>(new RealData("hello futureData"));
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
		newFixedThreadPool.submit(futureTask);
		
		// 表示处理别的逻辑或业务
		Thread.sleep(1000);
		
		System.out.println("最后结果："+futureTask.get());
		Long end = System.currentTimeMillis();
		System.out.println("cost:"+(end - start)+"ms");
	}

}
