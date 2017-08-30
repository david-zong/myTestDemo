package com.zongdw.threadlocal;

public class TestThreadConstruct {

	public static void main(String[] args) {
		System.out.println("main方法" + Thread.currentThread().getId() + "正在运行");

		new Thread(new ABC()).start();
	}

}

class ABC implements Runnable {
	public ABC() {
		System.out.println("ABC构造方法" + Thread.currentThread().getId() + "正在运行");
	}

	@Override
	public void run() {
		System.out.println("ABC run方法" + Thread.currentThread().getId() + "正在运行");
	}
}
