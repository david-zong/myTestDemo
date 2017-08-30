package com.zongdw.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
    
    /**
     * Method Name: main <br>
     * Description: TODO <br>
     * 
     * @param
     * @return
     * @throws IOException
     * @since JDK 1.6
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入姓名：");
        System.out.println(buf.readLine()+ " 你好！");
    }
    
}
