package com.zongdw.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100,
                                                                       200,
                                                                       65,
                                                                       TimeUnit.SECONDS,
                                                                       new ArrayBlockingQueue<Runnable>(65),
                                                                       new SimpleThreadFactory());
        for (int i = 0; i < 20; i++) {
//            System.out.println(i);
            threadPoolExecutor.execute(new Executor(i));
        }
    }
}

class Executor implements Runnable{
    private int ss;
    public Executor(int i) {
        System.out.println("init Executor:"+i);
        this.ss = i;
    }
    public void run(){
        System.out.println("run Executor:"+ss);
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        executorService.submit(new MyRunnable(ss));
    }
}

class SimpleThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}

class MyRunnable implements Runnable {
    private int num;
    public MyRunnable(int i) {
        System.out.println("init MyRunnable:"+i);
        this.num = i;
    }
    
    public void run() {
        System.out.println("thread:" + num + "  " + (new SimpleDateFormat("yyyyMMddhhmiss")).format(new Date()));
    }
}