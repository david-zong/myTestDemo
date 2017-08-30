package com.zongdw.propertydescriptor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PropertyUtil {
    public static PropertyDescriptor getPropertyDescriptor(Class clazz, String propertyName) {
        // 构建一个可变字符串用来构建方法名称
        StringBuffer sb = new StringBuffer();
        Method setMethod = null;
        Method getMethod = null;
        PropertyDescriptor pd = null;
        try {
            Field field = clazz.getDeclaredField(propertyName);// 根据字段名来获取字段
            if (field != null) {
                // 构建方法的后缀
                String methodEnd = propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                sb.append("set" + methodEnd);// 构建set方法
                setMethod = clazz.getDeclaredMethod(sb.toString(), new Class[] {field.getType()});
                sb.delete(0, sb.length());// 清空整个可变字符串
                sb.append("get" + methodEnd);// 构建get方法
                // 构建get 方法
                getMethod = clazz.getDeclaredMethod(sb.toString(), new Class[] {});
                // 构建一个属性描述器 把对应属性 propertyName 的 get 和 set 方法保存到属性描述器中
                pd = new PropertyDescriptor(propertyName,
                                            getMethod,
                                            setMethod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pd;
    }
    
    public static void setProperty(Object obj, String propertyName, Object value) {
        Class clazz = obj.getClass();// 获取对象的类型
        PropertyDescriptor pd = getPropertyDescriptor(clazz, propertyName);// 获取 clazz 类型中的 propertyName 的属性描述器
        Method setMethod = pd.getWriteMethod();// 从属性描述器中获取 set 方法
        try {
            setMethod.invoke(obj, new Object[] {value});// 调用 set 方法将传入的value值保存属性中去
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Object getProperty(Object obj, String propertyName) {
        Class clazz = obj.getClass();// 获取对象的类型
        PropertyDescriptor pd = getPropertyDescriptor(clazz, propertyName);// 获取 clazz 类型中的 propertyName 的属性描述器
        Method getMethod = pd.getReadMethod();// 从属性描述器中获取 get 方法
        Object value = null;
        try {
            value = getMethod.invoke(clazz, new Object[] {});// 调用方法获取方法的返回值
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;// 返回值
    }
    
    public static void main(String[] args) throws Exception {
        /**获取类*/
        Class clazz = Class.forName("com.zongdw.propertydescriptor.TBeanForReflect");//这里的类名是全名。。有包的话要加上包名
        /**两种方式获取类的实例*/
        /**方法一：有参数的类的实例的获取方式*/
        //参数类型数组
        Class[] paramTypes = {String.class,String.class,int.class,String.class,String.class};
        //根据参数类型获取相应的构造函数
        Constructor constructor = clazz.getConstructor(paramTypes);
        //参数数组
        Object[] parameters = {"1001","bill",15,"杨高南路","男"};
        // 根据获取的构造函数和参数，创建实例
        Object obj = constructor.newInstance(parameters);
        
        /**方法二：无参数的类的实例的获取方式*/
        //Object obj = clazz.newInstance();
        
        /**读写数据*/
        Field[] fields = clazz.getDeclaredFields();
//        //写数据
//        for(Field f : fields) {
//         PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clazz);
//         Method wM = pd.getWriteMethod();//获得写方法
//         wM.invoke(obj, "test"+f.getName());//实际情况中需要判断下他的参数类型
//        }
        //读数据
//        for(Field f : fields) {
//         PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clazz);
//         Method rM = pd.getReadMethod();//获得读方法
//         String num = (String) rM.invoke(obj);
//         System.out.println(num);
//        }
       }
}
