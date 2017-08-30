package com.zongdw.future;

public class RealData implements Data {
	private String result;
	@Override
	public String getRequest() {
		return result;
	}
	public RealData(String request){
		System.out.println("根据"+request+"进行查询。。。。。");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("查询操作完毕");
		result = "查询结果："+request+"result";
	}
}
