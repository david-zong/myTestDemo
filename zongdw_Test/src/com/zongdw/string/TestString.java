package com.zongdw.string;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.util.ObjectUtils;

public class TestString {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @throws UnsupportedEncodingException 
     * @since JDK 1.6
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO Auto-generated method stub
        String A_DATA =
                                        "\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800"+
                                        "\u100F\u4800\u100F\u4800\u100F\u5800\u400F\u5000\u400F\u5800\u400F\u6000\u400F"+
                                        "\u5000\u400F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800"+
                                        "\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F"+
                                        "\u4800\u100F\u4800\u100F\u5000\u400F\u5000\u400F\u5000\u400F\u5800\u400F\u6000"+
                                        "\u400C\u6800\030\u6800\030\u2800\030\u2800\u601A\u2800\030\u6800\030\u6800"+
                                        "\030\uE800\025\uE800\026\u6800\030\u2800\031\u3800\030\u2800\024\u3800\030"+
                                        "\u2000\030\u1800\u3609\u1800\u3609\u1800\u3609\u1800\u3609\u1800\u3609\u1800"+
                                        "\u3609\u1800\u3609\u1800\u3609\u1800\u3609\u1800\u3609\u3800\030\u6800\030"+
                                        "\uE800\031\u6800\031\uE800\031\u6800\030\u6800\030\202\u7FE1\202\u7FE1\202"+
                                        "\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1"+
                                        "\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202"+
                                        "\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1\202\u7FE1"+
                                        "\202\u7FE1\uE800\025\u6800\030\uE800\026\u6800\033\u6800\u5017\u6800\033\201"+
                                        "\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2"+
                                        "\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201"+
                                        "\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2\201\u7FE2"+
                                        "\201\u7FE2\201\u7FE2\201\u7FE2\uE800\025\u6800\031\uE800\026\u6800\031\u4800"+
                                        "\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u5000\u100F"+
                                        "\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800"+
                                        "\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F"+
                                        "\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800"+
                                        "\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F\u4800\u100F"+
                                        "\u3800\014\u6800\030\u2800\u601A\u2800\u601A\u2800\u601A\u2800\u601A\u6800"+
                                        "\034\u6800\034\u6800\033\u6800\034\000\u7002\uE800\035\u6800\031\u6800\u1010"+
                                        "\u6800\034\u6800\033\u2800\034\u2800\031\u1800\u060B\u1800\u060B\u6800\033"+
                                        "\u07FD\u7002\u6800\034\u6800\030\u6800\033\u1800\u050B\000\u7002\uE800\036"+
                                        "\u6800\u080B\u6800\u080B\u6800\u080B\u6800\030\202\u7001\202\u7001\202\u7001"+
                                        "\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202"+
                                        "\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001"+
                                        "\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\u6800\031\202\u7001\202"+
                                        "\u7001\202\u7001\202\u7001\202\u7001\202\u7001\202\u7001\u07FD\u7002\201\u7002"+
                                        "\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201"+
                                        "\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002"+
                                        "\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\u6800"+
                                        "\031\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002\201\u7002"+
                                        "\u061D\u7002";
//        System.out.println(A_DATA);
        String string = "abc";
//        System.out.println(string.getBytes("utf-8"));
        String str = "\u7cfb\u7edf\u5f02\u5e38\u3001\u5931\u6548=3037|\u7cfb\u7edf\u5f02\u5e38,\u8bf7\u7a0d\u540e\u91cd\u8bd5";
//        System.out.println(str);
        
        String ss = "%E9%9D%92%E6%B5%B7%E6%96%B0%E5%8D%8E%E7%99%BE%E8%B4%A7%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8%EF%BC%88%E8%A5%BF%E5%AE%81%E5%BA%97%29%E6%94%B6%E9%93%B6%E5%8F%B0";
//        System.out.println(ss);
//        System.out.println(URLDecoder.decode(ss));
        
        String DESCRIPTION = "%s飞凡通扫码支付已收款%s元。";
//        System.out.println(String.format(DESCRIPTION, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()) ,new BigDecimal("123.33").divide(new BigDecimal(100))));
        
        String str1 = "\u98ce\u63a7\u9884\u5224\u6821\u9a8c\u9519\u8bef";
//        System.out.println(str1);
        
        String str2 = "\u8d85\u8fc7\u514d\u5bc6\u672c\u65e5\u7d2f\u79ef\u91d1\u989d";
//        System.out.println(str2);
        
        String str3 = String.valueOf(2);
//        System.out.println(str3);
        
        String a1 = null + "";
        System.out.println(a1);
//        Long.valueOf("");
//        Long.valueOf(a1);
        
        
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("aa", "00");
//        map.put("bb", 00);
//        
//        System.out.println("aa:"+"00".equals(map.get("aa")));
//        System.out.println("bb:"+"00".equals(ObjectUtils.nullSafeToString(map.get("bb"))));
        
//        String[] paramString = new String[]{"1111112233"};
//        System.out.println(paramString.toString());
        
//        String aa = "aaa";
//        Integer bb = 11;
//        System.err.println(String.valueOf(aa));
//        System.err.println(String.valueOf(bb));
        
        String aa = new String("\u94F6\u884C\u5361\u652F\u4ED8\u5f02\u5e38");
        System.out.println(aa);
    }
    
}
