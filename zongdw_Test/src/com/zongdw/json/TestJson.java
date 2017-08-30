package com.zongdw.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONObject;

import com.bill99.sdk.common.bean.response.KQOprResponse;
import com.google.gson.Gson;


public class TestJson {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestBean testBean = new TestBean();
        testBean.setStr1("1");
        testBean.setStr2("a");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bb", "xx");
//        testBean.setExtendDataMap(map);
        List<TBean> list = new ArrayList<TBean>();
        list.add(new TBean("t1","test01"));
        list.add(new TBean("t2","test02"));
        testBean.setList(list);
        Gson gson = new Gson();
        
        
        KQOprResponse res = new KQOprResponse();
        res.setExtendDataMap(map);
        res.setMerchantId("111");
        String jsonStr = gson.toJson(res);
        
//        TestBean tb = (TestBean)getDTO(jsonStr, TestBean.class);
        System.out.println(jsonStr);
//        System.out.println(gson.fromJson(jsonStr, HashMap.class));
//        System.out.println(gson.fromJson(jsonStr, new TypeToken<Map<String,Object>>(){}.getType()));
        System.out.println(gson.fromJson(jsonStr, KQPayHashMap.class));
    }
    public static Object getDTO(String jsonString, Class clazz){     
        JSONObject jsonObject = null;     
        try{     
            jsonObject = JSONObject.fromObject(jsonString);     
        }catch(Exception e){     
            e.printStackTrace();     
        }     
        return JSONObject.toBean(jsonObject, clazz);     
    }     
}
