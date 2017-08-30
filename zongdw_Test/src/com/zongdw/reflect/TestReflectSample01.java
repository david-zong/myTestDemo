package com.zongdw.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/** 
 * Type Name: TestReflectSample01 <br> 
 * Description: 在泛型为Integer的ArrayList中存放一个String类型的对象。 <br>
 * Date: 2017年3月21日 下午12:28:39 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflectSample01 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		Method method = list.getClass().getMethod("add", Object.class);
		method.invoke(list, "Java反射机制实例。");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.toString());
	}

}
