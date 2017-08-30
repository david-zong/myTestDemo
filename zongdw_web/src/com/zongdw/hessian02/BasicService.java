package com.zongdw.hessian02;

import com.caucho.hessian.server.HessianServlet;

public class BasicService extends HessianServlet implements Basic {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public String say(String msg) {
		return "Say:" + msg;
	}

}
