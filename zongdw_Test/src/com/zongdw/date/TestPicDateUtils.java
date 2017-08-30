package com.zongdw.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPicDateUtils {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @throws ParseException 
     * @since JDK 1.6
     */
    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub  yyyyMMddHHmmss
        System.out.println(isValidDataTimeFormat("1036182911","MMddHHmmss"));
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(getDate("1036182911","MMddHHmmss")));
    }
    /**
     * 检查给定的字符串是否为合法的日期格式
     * 
     * @param dateStr
     *            待检查的日期字符串
     * @param dateFormat
     *            　日期字符串遵循的日期格式
     * @return
     */
    public static boolean isValidDataTimeFormat(String dateStr, String dateTimeFormat) {
        try {
            if (isBlank(dateTimeFormat)) {
                dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
            }
            if (isBlank(dateStr)) {
                return false;
            }
            SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormat);
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public static boolean isBlank(String str)
    {
      return (str == null) || (str.trim().length() == 0);
    }
    static Date getDate(String dateStr, String dateTimeFormat) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormat);
        return sdf.parse(dateStr);
    }
}
