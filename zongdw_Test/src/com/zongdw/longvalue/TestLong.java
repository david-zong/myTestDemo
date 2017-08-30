package com.zongdw.longvalue;

public class TestLong {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string = "12345";
        System.out.println(1);
        System.out.println(Long.getLong(string));
        System.out.println(2);
        System.out.println(Long.valueOf(string));
        System.out.println(4);
        System.out.println(Long.valueOf(""));
        System.out.println(6);
        System.out.println(Long.valueOf(null));
    }
    
}
