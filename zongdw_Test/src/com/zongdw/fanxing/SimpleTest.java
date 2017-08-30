package com.zongdw.fanxing;

import java.util.ArrayList;

public class SimpleTest {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**不指定泛型的时候*/   
        int i=SimpleTest.add(1, 2); //这两个参数都是Integer，所以T为Integer类型   
        Number f=SimpleTest.add(1, 1.2);//这两个参数一个是Integer，一个是Float，所以取同一父类的最小级，为Number  
        Object o=SimpleTest.add(1, "asd");//这两个参数一个是Integer，一个是Float，所以取同一父类的最小级，为Object    
            
            
        int a=SimpleTest.<Integer>add(1, 2);//指定了Integer，所以只能为Integer类型或者其子类 
        int b=SimpleTest.<Integer>add(1, 2.2);//编译错误，指定了Integer，不能为Float 
        Number c=SimpleTest.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float  
        
    }
    
  //这是一个简单的泛型方法       
    public static <T> T add(T x,T y){       
        return y;   
    }       

}
