package com.zongdw.beananalyzer;

import com.google.gson.Gson;

public class TestBeanAnalyzer {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Gson gson = new Gson();
        TBean tBean = new TBean("1001", "bill", "杨高南路", "男");
        String str1 = "{\"qryPeriod\":\"3000\",\"qryTimes\":\"30\",\"connectTimeout\":\"60000\",\"readTimeout\":\"60000\",\"msgType\":\"GTOKEN\",\"respTime\":\"20160520171818\",\"respCode\":\"00\",\"respMsg\":\"登录成功\",\"sign\":\"MzukcaPgCyMlg1BVps/nRf54qxg+eGmbF5KPGJ9qaikhDEPNSZx/iaH9XEeYHEjfo2XO6S3qxPEwVvXmbyLgIQ5YJ3zF8EDATx7jOqsgS4pWym5BmZNxtdFWADLPB1F/ue8J8ofdAOoAhy2GS4uo9GYF5WWRDmGXZmC5qRE7SHI\u003d\",\"merchantName\":\"ceshi\",\"merchantId\":\"812222222220015\",\"terminalId\":\"03050115\",\"token\":\"pwfEgoI+W1akCMnSEQBKqLJEbT4QWSjQyPyuHzdv0RI\u003d\",\"tokenExpiry\":\"20160521040000\",\"serverPublicKey\":\"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQChx5QdAhhTGde//yTsIsxwXwzEFafNhHcOxAp4z4ETQ3Y6yAPvzTpCNjIun1AlEYmuBaQoOrrPnXg1ZpddNrLv5VCeKW+Xi66n5/Xc1WB/tlhdDC+HLnNvrveA/0MWrC1mWgW3zmGe3whIwEFXJPcF9DZYrBwLrd9W/BVS6ppBawIDAQAB\",\"extendDataMap\":\"backFlag%D%F100,F101\"}";
        String str2 = gson.toJson(tBean);
        str2 = str1;
//        System.out.println(BeanAnalyzer.getBeanString(str1, false).toCharArray());
//        System.out.println(str1);
//        System.out.println(BeanAnalyzer.getBeanString(tBean, true));
        
//        System.out.println(str2);
//        System.out.println(BeanAnalyzer.getBeanString(str2, true));
//        System.out.println(BeanAnalyzer.getBeanString(str2));
        
//        BeanAnalyzer.getJsonObject(str2);
          System.out.println(str2);
          System.out.println(BeanAnalyzer.sensitiveInfoFilter(str2));
    }
    
}
