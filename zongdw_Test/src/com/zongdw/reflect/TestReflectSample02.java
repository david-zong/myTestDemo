package com.zongdw.reflect;

import java.lang.reflect.Array;

/** 
 * Type Name: TestReflectSample02 <br> 
 * Description: 通过反射取得并修改数组的信息 <br>
 * Date: 2017年3月21日 下午12:30:40 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflectSample02 {

	public static void main(String[] args) {
		int[] temp = { 1, 2, 3, 4, 5 };
		Class<?> demo = temp.getClass().getComponentType();
		System.out.println("数组类型： " + demo.getName());
		System.out.println("数组长度  " + Array.getLength(temp));
		System.out.println("数组的第一个元素: " + Array.get(temp, 0));
		Array.set(temp, 0, 100);
		System.out.println("修改之后数组第一个元素为： " + Array.get(temp, 0));
	}

}
