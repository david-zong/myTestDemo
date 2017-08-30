package com.zongdw.reflect;

import java.lang.reflect.Field;

/** 
 * Type Name: TestReflect08 <br> 
 * Description: 通过反射机制操作某个类的属性 <br>
 * Date: 2017年3月21日 下午12:16:36 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflect08 {
	private String proprety = null;

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.zongdw.reflect.TestReflect08");
		Object obj = clazz.newInstance();
		// 可以直接对 private 的属性赋值
		Field field = clazz.getDeclaredField("proprety");
		field.setAccessible(true);
		field.set(obj, "Java反射机制");
		System.out.println(field.get(obj));

	}

}
