package com.zongdw.threadlocal;

import com.zongdw.threadlocal.TestThreadlocal.My50MB;
import com.zongdw.threadlocal.TestThreadlocal.MyThreadLocal;

public class TestThreadlocal2 {
    
    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {

            @Override
            public void run() {
                ThreadLocal tl = new MyThreadLocal();
                tl.set(new My50MB());
                
                tl=null;
                
                System.out.println("Full GC");
                System.gc(); 
                
            }
            
        }).start();
        
        
        System.gc();
        Thread.sleep(1000);
        System.gc();
        Thread.sleep(1000);
        System.gc();
        Thread.sleep(1000);

    }
    
}
