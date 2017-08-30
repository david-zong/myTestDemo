package com.zongdw.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sdk.common.SdkAppExcCodes;

public class TestFormat {
    
    public static ThreadLocal<DateFormat> dateFormatThreadLocal = new ThreadLocal<DateFormat>(){
        protected DateFormat initialValue() {
            return new SimpleDateFormat("MMddHHmmss");
        }
    };
    
    /** 
     * Method Name: isValidDate <br>
     * Description: 检查日期格式是否正确 <br> 
     * @param  value 传入的日期字符串
     * @param  errMsg 传入的错误信息
     * @return 
     * @since JDK 1.6
     */
    public static boolean isValidDate(String value) throws Exception{
        if (value != null && value.trim().length() > 0) {
            try {
                Date date = dateFormatThreadLocal.get().parse(value);
                System.out.println(value);
                System.out.println(dateFormatThreadLocal.get().format(date));
                if (!value.equals(dateFormatThreadLocal.get().format(date))) {
                    return false;
                }
            } catch (ParseException e) {
                throw new Exception(e);
            }
        }
        return true;
    }
    
    /**
     * 是否有效的日期
     *
     * @param dateStr
     * @param pattern
     * @return
     * @throws Exception 
     */
    public static boolean isValidDate(String dateStr, String pattern) {
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(pattern);
        try {
            df.setLenient(false);
            df.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;

        }
    }
    
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
//        System.out.println("19810331 is valid? " + isValidDate("19810331", "yyyyMMdd"));
//        System.out.println("19810332 is valid? " + isValidDate("19810332", "yyyyMMdd"));
        System.out.println("12112200004 is valid? " + isValidDate("12112200004", "MMddHHmmss"));
        System.out.println("1020130003 is valid? " + isValidDate("1020130003", "MMddHHmmss"));
        
        System.out.println("12112200004 is valid? " + isValidDate("12112200004"));
        System.out.println("1020130003 is valid? " + isValidDate("1020130003"));
        
        for(int i = 0; i < 3; i++){
            new TestSimpleDateFormatThreadSafe().start();
        }
    }
    
    public static class TestSimpleDateFormatThreadSafe extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    this.join(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                try {
                    System.out.println(this.getName()+":"+dateFormatThreadLocal.get().parse("1020130003"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }    
    }
    
}
