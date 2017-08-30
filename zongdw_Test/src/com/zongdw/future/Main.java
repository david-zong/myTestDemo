package com.zongdw.future;

public class Main {

	public static void main(String[] args) {
		FutureClient futureClient = new FutureClient();
		Data data = futureClient.request("111abc");
		System.out.println("请求发送成功");
		String result = data.getRequest();
		System.out.println(result);
	}

}
