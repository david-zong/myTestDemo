package com.zongdw.fanxing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TypeErasure {
    
    /** 
     * Method Name: main <br>
     * Description: 类型擦除 <br> 
     * @param
     * @return 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalAccessException 
     * @throws SecurityException 
     * @throws IllegalArgumentException 
     * @since JDK 1.6
     */
    public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        // TODO Auto-generated method stub
        /*
         * 在这个例子中，我们定义了两个ArrayList数组，不过一个是ArrayList<String>泛型类型，只能存储字符串。一个是ArrayList<Integer>泛型类型，只能存储整形。最后，
         * 我们通过arrayList1对象和arrayList2对象的getClass方法获取它们的类的信息，最后发现结果为true。说明泛型类型String和Integer都被擦除掉了，只剩下了原始类型。
         */
        ArrayList<String> arrayList1=new ArrayList<String>();   
        arrayList1.add("abc");  
        ArrayList<Integer> arrayList2=new ArrayList<Integer>(); 
        arrayList2.add(123);    
        System.out.println(arrayList1.getClass()==arrayList2.getClass());   
        
        ArrayList<Integer> arrayList3=new ArrayList<Integer>(); 
        arrayList3.add(1);//这样调用add方法只能存储整形，因为泛型类型的实例为Integer   
        arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "asd"); 
        for (int i=0;i<arrayList3.size();i++) { 
            System.out.println(arrayList3.get(i));
        }   

        
    }
    
}
