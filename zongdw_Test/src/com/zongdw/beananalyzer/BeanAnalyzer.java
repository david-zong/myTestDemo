/**
 * Project Name:pix-mbp
 * File Name:BeanPrinter.java
 * Package Name:pix.mbp.util
 * Date:2015年7月14日上午9:58:59
 * Copyright (c) 2015, li.zhang@99bill.com All Rights Reserved.
 *
 */

package com.zongdw.beananalyzer;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.sf.json.JSONObject;

/**
 * ClassName:BeanPrinter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年7月14日 上午9:58:59 <br/>
 * 
 * @author li.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
public class BeanAnalyzer {

    /** 敏感字段 */
    private static final List<String> sensitive = new LinkedList<String>();


    static {
        sensitive.add("cvv2");
        sensitive.add("PIN");// 交易密码
        sensitive.add("PAN");// 主账号
        // 2016-5-12 15:20:24 delete by david.zong 该字段不许脱敏
        //sensitive.add("shortPAN");// 主账号（短）
        sensitive.add("secret");// 密码
        sensitive.add("password");// 登录密码
        sensitive.add("tokenPassword");// TOKEN密码
        // 2016-5-12 15:20:24 add by david.zong 新增日志脱敏字段 start
        sensitive.add("expiredDate");// 有效期
        sensitive.add("track2");// 磁道2信息
        sensitive.add("track3");// 磁道3信息
        sensitive.add("email");// 磁道3信息
        // 2016-5-12 15:20:24 add by david.zong 新增日志脱敏字段 end
//        sensitive.add("class");
        sensitive.add("sex");
        sensitive.add("qryPeriod");
    }

    public static <T extends Object> String getBeanString(T bean, boolean ignoreNull) {
        StringBuffer sb = new StringBuffer();
        try {
            BeanInfo BeanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = BeanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                Method method = propertyDescriptor.getReadMethod();
                String name = propertyDescriptor.getName();
                Object value = method.invoke(bean);
                if ((ignoreNull && value == null) || sensitive.contains(name)) {
                    continue;
                }
                sb.append("[" + name + "=" + value + "]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static String getBeanString(String value){
//        Map<String, Object> map = new HashMap<String, Object>();
//        if (value != null && value.length() > 0) {
//            value = value.substring(1, value.length()-2);
//            String[] strs = value.split(",");
//            for (String string : strs) {
//                if (string != null && string.length() > 0) {
//                    
//                }
//            }
//        }
        Gson gson = new Gson();
        System.out.println((new Date()).getTime());
        Map mm = gson.fromJson(value, HashMap.class);
        Map rMap = new HashMap();
        for (Object string : mm.keySet()) {
            if (!sensitive.contains(string)) {
                rMap.put(string, mm.get(string));
            }else {
                System.out.println(string);
            }
        }
        System.out.println((new Date()).getTime());
        return gson.toJson(rMap);
    }
    
    public static void getJsonObject(String jsonString){
        JSONObject jsonObject = JSONObject.fromObject(jsonString);
        Iterator<String> iterator = jsonObject.keys();
        String key = null;
        String value = null;
        while (iterator.hasNext()) {
            key = iterator.next();
            value = jsonObject.getString(key);
            if (sensitive.contains(key)) {
                System.out.println(key);
                System.out.println(value);
                jsonObject.remove(key);
            }
        }
    }
    
    /**
     * 将java对象转化为JSON格式的字符串
     * 
     * @param object
     * @param exclusiveField 排除的字段
     * @return
     */
    public static String toJson(Object object, String... exclusiveField) {
        if (object == null) {
            return null;
        }
        JSONObject jsonObj = JSONObject.fromObject(object);
        for (String field : exclusiveField) {
            jsonObj.remove(field);
        }
        return jsonObj.toString();
    }
    public static String sensitiveInfoFilter(String json){
        String[] strings = new String[sensitive.size()];
        sensitive.toArray(strings);
        return toJson(json, strings);
    }
}