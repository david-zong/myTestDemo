package com.zongdw.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aa", null);
        Map<String, Object> mm = new HashMap<String, Object>();
        mm.put("bb", null);
        mm.putAll(map);
        System.out.println(map.toString());
        System.out.println(mm.toString());
    }
    
}
