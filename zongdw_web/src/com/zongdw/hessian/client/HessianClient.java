package com.zongdw.hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClient {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
		String url = "http://127.0.0.1:8090/zongdw_web/hello01";
		HessianProxyFactory factory = new HessianProxyFactory();
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class,url);
		System.out.println(basic.hello());
		System.out.println(basic.getUser().getUserName());
		System.out.println(basic.getUser().getPassword());
		basic.setGreeting("123aaa");
		System.out.println(basic.hello());
		

	}

}
