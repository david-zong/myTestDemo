package com.zongdw.unicode;

public class TestUnicode {

	public static void main(String[] args) {
//        String s = "超过免密本日累积金额";
        String s = "风控服务调用异常";
        System.out.println(string2Unicode(s));
    }
    public static String string2Unicode(String string) {
          
        StringBuffer unicode = new StringBuffer();
      
        for (int i = 0; i < string.length(); i++) {
      
            // 取出每一个字符
            char c = string.charAt(i);
      
            // 转换为unicode
            unicode.append("\\u" + Integer.toHexString(c));
        }
      
        return unicode.toString();
    }

}
