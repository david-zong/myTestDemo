package com.zongdw.getresource;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class TestGetResource {
    
    public static void main(String[] args) throws URISyntaxException {
        URL url01 = TestGetResource.class.getResource("99bill-rsa.cer");
        URL url02 = TestGetResource.class.getResource("");
        URL url03 = TestGetResource.class.getResource("/");
        
        System.out.println(url01);
        System.out.println(url02);
        System.out.println(url03);
//        运行结果
//        file:/E:/workspace/zongdw_Test/bin/com/zongdw/getresource/99bill-rsa.cer
//        file:/E:/workspace/zongdw_Test/bin/com/zongdw/getresource/
//        file:/E:/workspace/zongdw_Test/bin/
        
        // 取到的URL可以直接使用，不必特意去掉路径前面的file:
        File file = new File(url01.toURI());
    }
    
}
