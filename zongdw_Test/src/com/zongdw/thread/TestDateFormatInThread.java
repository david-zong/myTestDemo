package com.zongdw.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class MyThread implements java.lang.Runnable {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    /**此处sdf添加static修饰，则在运行时可能出现错误，因为SimpleDateFormat不是线程安全的。
     * 修改办法：换成final ，或者在run上面加上synchronized关键字修饰.
     * 
     */
    @Override
    public void run() {
        try {
            System.out.println(sdf.parse("20160429123456"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

public class TestDateFormatInThread {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 500; ++i) {
            new Thread(new MyThread()).start();
//            Thread.sleep(1);
        }
    }
}
