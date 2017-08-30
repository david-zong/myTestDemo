/**   
 * Project Name: zongdw_Test <br>
 * File Name: TestReflect03.java <br>
 * Package Name: com.zongdw.reflect <br>  
 * Description: 文件的功能说明  <br>
 * Date 2017年3月21日 上午11:50:37 <br>
 * @author: david.zong <br>
 * @version：版本号 
 * Copyright (c) 2010-2015 99Bill Corporation. All rights reserved.   
 */
package com.zongdw.reflect;

import java.io.Serializable;

/** 
 * Type Name: TestReflect03 <br> 
 * Description: 获取一个对象的父类与实现的接口 <br>
 * Date: 2017年3月21日 上午11:50:37 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflect03 implements Serializable {

	// TODO Auto-generated method stub
	private static final long serialVersionUID = -2862585049955236662L;

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.zongdw.reflect.TestReflect03");
		// 取得父类
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println("clazz的父类为：" + parentClass.getName());
		// clazz的父类为： java.lang.Object
		// 获取所有的接口
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazz实现的接口有：");
		for (int i = 0; i < intes.length; i++) {
			System.out.println((i + 1) + "：" + intes[i].getName());
		}
		// clazz实现的接口有：
		// 1：java.io.Serializable
	}
}
