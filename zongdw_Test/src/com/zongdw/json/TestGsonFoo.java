package com.zongdw.json;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class TestGsonFoo {
    
    public static void main(String[] args) {
        
        String jsonInput = "{\"str1\":\"1\",\"str2\":\"a\",\"extendDataMap\":{\"bb\":\"xx\"}}";
        
        Response response = new Gson().fromJson(jsonInput, Response.class);
        System.out.println(response.key);
        System.out.println(response.map);
    }
}

class Response {
    @SerializedName("str1")
    String key;
    
    @SerializedName("extendDataMap")
    HashMap<String, Object> map = new HashMap<String, Object>();
    
//    Response() {
//        map.put("a", "aa");
//        map.put("b", "bb");
//    }
    
}
