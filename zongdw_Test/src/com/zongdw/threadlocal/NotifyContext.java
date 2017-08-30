package com.zongdw.threadlocal;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
  * @Project:app-cap-ate-center-mdp
  * @Description:交易报文通知上下文对象
  * @author:Eddy
  * @CreateTime:2016-7-18
 */
public class NotifyContext implements Serializable{
	
	private static final long serialVersionUID = 217514223711695355L;

	/**
	 * 通知报文
	 */
	public static final String NOTIFY_MESSAGE = "notify.message";

	/**
	 * 定制报文
	 */
	public static final String CUSTOMIZED_MESSAGE = "customized.message";

	/**
	 * 定制报文json转化
	 */
	public static final String CUSTOMIZED_MESSAGE_MAP = "customized.message.map";

	/**
	 * 外部循环继续
	 */
	public static final String OUTER_LOOP_CONTINUE = "outer.loop.continue";
	
	/**
	 * 必须使用ConcurrentHashMap，因为在多线程的情况下，非线性安全的HashMap存入cache之后的反序列化会报错
	 */
	private Map<String, Object> variables = new ConcurrentHashMap<String, Object>();
	
	@SuppressWarnings("unchecked")
	public <T>  T  getVarValue(String key,Class<T> clazz){
		Object obj = variables.get(key);
		if( obj!=null && clazz.isInstance(obj)){
			return (T)obj;
		}
		return null;
	}
	
	/**
	  * @Description:设置上下文变量
	  * @param:
	 */
	public void setVariables(String key, Object object) {
		
		if (key != null && object != null)
		{
			getVariables().put(key, object);
		}
	}
	
	/**
	  * @Description:删除上下文中的变量
	  * @param:
	 */
	public void delVariables(String key) {
		getVariables().remove(key);
	}
	
	public  Map<String, Object> getVariables() {
		return variables;
	}
	
	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

}
