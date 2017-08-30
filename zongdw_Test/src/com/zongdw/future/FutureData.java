package com.zongdw.future;

public class FutureData implements Data {
	private RealData realData = null;
	private boolean isReady = false;
	@Override
	public synchronized String getRequest() {
		while (!isReady) {
			System.out.println("wait-----");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return this.realData.getRequest();
	}
	public synchronized void setRealData(RealData realData) {
		System.out.println("setRealData");
		if (isReady) {
			return;
		}
		this.realData = realData;
		isReady = true;
		notify();
	}
}
