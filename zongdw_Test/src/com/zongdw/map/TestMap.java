package com.zongdw.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Map map = new HashMap();
//        map.put("001", "99");
//        map.put("002", "988");
//        System.out.println(map);
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("long", new Long("123"));
    	map.put("string", "bac");
    	map.put("integer", new Integer(456));
    	
//    	Long ll = (Long) map.get("long");
//    	System.out.println(ll);
    	
    	Long ll = new Long(map.get("integer").toString());
    	System.out.println(ll);
    }
    
}
