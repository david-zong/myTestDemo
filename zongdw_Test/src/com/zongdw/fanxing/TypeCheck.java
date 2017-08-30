package com.zongdw.fanxing;

import java.util.ArrayList;

public class TypeCheck {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //我们先看看参数化类型与原始类型的兼容
        ArrayList<String> list1 = new ArrayList(); //第一种 情况  
        ArrayList list2 = new ArrayList<String>(); //第二种 情况  
        
        /*
         * 这样是没有错误的，不过会有个编译时警告。
         * 不过在第一种情况，可以实现与 完全使用泛型参数一样的效果，第二种则完全没效果。
         * 因为，本来类型检查就是编译时完成的。new ArrayList()只是在内存中开辟一个存储空间，可以存储任何的类型对象。而真正涉及类型检查的是它的引用，因为我们是使用它引用arrayList1
         * 来调用它的方法，比如说调用add()方法。所以arrayList1引用能完成泛型类型的检查。
         * 而引用arrayList2没有使用泛型，所以不行。
         */
        
        // 例子
        ArrayList<String> arrayList1=new ArrayList();   
        arrayList1.add("1");//编译通过  
        arrayList1.add(1);//编译错误    
        String str1=arrayList1.get(0);//返回类型就是String    
            
        ArrayList arrayList2=new ArrayList<String>();   
        arrayList2.add("1");//编译通过  
        arrayList2.add(1);//编译通过    
        Object object=arrayList2.get(0);//返回类型就是Object  
            
        new ArrayList<String>().add("11");//编译通过    
        new ArrayList<String>().add(22);//编译错误  
        String string=new ArrayList<String>().get(0);//返回类型就是String 

    }
    
}
