package com.zongdw.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        // 测试y 和 yy 的区别
//        Date date = Calendar.getInstance().getTime();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("y:MM:dd");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yy:MM:dd");
//        System.out.println(date.toString());
//        System.out.println("y:MM:dd  "+sdf1.format(date));
//        System.out.println("yy:MM:dd "+sdf2.format(date));
        
        //日期格式化
//        Date calendar = Calendar.getInstance().getTime();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
//        String string = formatter.format(calendar);
//        System.out.println(string);
    	
//    	System.out.println(Calendar.getInstance().getTime());
//    	System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
    	
    	
    	Date date = new Date();
//    	System.out.println(date.getTime());
//    	System.out.println(date.getTime());
//    	System.out.println(date.getTime());
//    	System.out.println("---------");
//    	System.out.println((new Date()).getTime());
//    	System.out.println((new Date()).getTime());
//    	System.out.println((new Date()).getTime());
    	
    	System.out.println((new SimpleDateFormat("yyyy-MM-dd HH-mm-ss")).format(date));
    	
    	
    }
    
}
