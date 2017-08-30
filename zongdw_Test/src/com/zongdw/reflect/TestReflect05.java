package com.zongdw.reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/** 
 * Type Name: TestReflect05 <br> 
 * Description: 获取某个类的全部属性 <br>
 * Date: 2017年3月21日 下午12:00:50 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflect05 implements Serializable {
	private static final long serialVersionUID = -2862585049955236662L;

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.zongdw.reflect.TestReflect05");
		System.out.println("===============本类属性===============");
		// 取得本类的全部属性
		Field[] field = clazz.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			// 权限修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性类型
			Class<?> type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
		}

		System.out.println("==========实现的接口或者父类的属性==========");
		// 取得实现的接口或者父类的属性
		Field[] filed1 = clazz.getFields();
		for (int j = 0; j < filed1.length; j++) {
			// 权限修饰符
			int mo = filed1[j].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性类型
			Class<?> type = filed1[j].getType();
			System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
		}

	}

}
