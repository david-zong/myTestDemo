package com.zongdw.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIO {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @throws IOException 
     * @since JDK 1.6
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        String pathName = "E:/test.txt";
        File file=new File(pathName);
        if(file.isFile() && file.exists()){ //判断文件是否存在
            write(pathName);
            read(pathName);
        }else {
            file.createNewFile();
            write(pathName);
            read(pathName);
        }
    }
    public static void read(String pathName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(pathName));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while((line= br.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb.toString()); //sb包含所有文本内容
    }
    public static void write(String pathName) throws IOException{
        
        BufferedWriter br = new BufferedWriter(new FileWriter(pathName));
        br.write("要写入的内容");
        br.flush(); //刷新缓冲区的数据到文件
        br.close();
    }
}
