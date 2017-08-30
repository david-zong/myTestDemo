package com.zongdw.thread;

class MyTestThread implements java.lang.Runnable {
    private int threadId;
    
    public MyTestThread(int id) {
        this.threadId = id;
    }
    
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println("Thread ID: " + this.threadId + " : " + i);
        }
    }
}

public class TestThread {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            new Thread(new MyThread(i)).start();
            Thread.sleep(1);
        }
    }
}
