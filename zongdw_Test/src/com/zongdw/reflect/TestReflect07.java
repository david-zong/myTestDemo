package com.zongdw.reflect;

import java.lang.reflect.Method;

/** 
 * Type Name: TestReflect07 <br> 
 * Description: 通过反射机制调用某个类的方法 <br>
 * Date: 2017年3月21日 下午12:12:14 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflect07 {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.zongdw.reflect.TestReflect07");
		// 调用TestReflect类中的reflect1方法
		Method method = clazz.getMethod("reflect1");
		method.invoke(clazz.newInstance());
		// Java 反射机制 - 调用某个类的方法1.
		// 调用TestReflect的reflect2方法
		method = clazz.getMethod("reflect2", int.class, String.class);
		method.invoke(clazz.newInstance(), 20, "张三");
		// Java 反射机制 - 调用某个类的方法2.
		// age -> 20. name -> 张三
	}

	public void reflect1() {
		System.out.println("Java 反射机制 - 调用某个类的方法1.");
	}

	public void reflect2(int age, String name) {
		System.out.println("Java 反射机制 - 调用某个类的方法2.");
		System.out.println("age -> " + age + ". name -> " + name);
	}

	public void reflect2(String age, String name) {
		System.out.println("Java 反射机制 - 调用某个类的方法3.");
		System.out.println("age -> " + age + ". name -> " + name);
	}

	public void reflect3(int age, String name) {
		System.out.println("Java 反射机制 - 调用某个类的方法4.");
		System.out.println("age -> " + age + ". name -> " + name);
	}

}
