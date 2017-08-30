package com.zongdw.thread;

public class TestThread01 {
	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			new Thread(new Writer(i)).start();
		}
		while (true) {
			if (ParamThreadLocal.get() == 3) {
				System.out.println("break");
				break;
			}
		}
	}
	
}
class ParamThreadLocal{
	public static final ThreadLocal<Integer> local = new ThreadLocal<Integer>();
	public static Integer get() {
		return local.get();
	}
	public static void set(Integer value) {
		Integer i = local.get();
		System.out.println("ParamThreadLocal:"+(value>i ? value : i));
		local.set(value>i ? value : i);
	}
}
class Writer implements Runnable{

	private int num;
	public Writer(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("thread:"+Thread.currentThread().getName()+" start--------"+num);
			Thread.sleep(5000);
			System.out.println("thread:"+Thread.currentThread().getName()+" end----------"+num);
			ParamThreadLocal.set(num++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
