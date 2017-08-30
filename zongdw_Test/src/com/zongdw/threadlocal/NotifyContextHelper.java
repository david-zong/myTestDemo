package com.zongdw.threadlocal;

public class NotifyContextHelper {
	
	private static ThreadLocal<NotifyContext> notifyContextThreadLocal = new ThreadLocal<NotifyContext>();

	/**
	 * 保存上下文对象
	 */
	public void addContext(NotifyContext notifyContext) {
		notifyContextThreadLocal.set(notifyContext);
	}

	/**
	 * 获取上下文对象
	 */
	public NotifyContext getContext() {
		NotifyContext txnContext = notifyContextThreadLocal.get();
		if (txnContext == null) {
			txnContext = new NotifyContext();
			notifyContextThreadLocal.set(txnContext);
			System.out.println("new NotifyContext");
		}else {
			System.out.println("get NotifyContext");
		}
		return txnContext;
	}
	
	/**
	  * @Description:删除变量
	 */
	public void removeThreadLoacal() {
		notifyContextThreadLocal.remove();
	}
	
}
