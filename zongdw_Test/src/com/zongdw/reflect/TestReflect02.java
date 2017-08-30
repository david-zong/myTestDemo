package com.zongdw.reflect;

/** 
 * Type Name: TestReflect02 <br> 
 * Description: 实例化Class类对象 <br>
 * Date: 2017年3月21日 上午11:48:40 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TestReflect02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		// 一般采用这种形式
		class1 = Class.forName("com.zongdw.reflect.TestReflect02");
		class2 = new TestReflect02().getClass();
		class3 = TestReflect02.class;
		System.out.println("类名称   " + class1.getName());
		System.out.println("类名称   " + class2.getName());
		System.out.println("类名称   " + class3.getName());
	}

}
