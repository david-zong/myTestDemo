package com.zongdw.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class TestBean implements Serializable{
    
    /** serialVersionUID: TODO */ 
    private static final long serialVersionUID = 1L;
    private String str1;
    private String str2;
    private  Map<String, Object> extendDataMap = new HashMap<String, Object>();
    private  List<TBean> list = new ArrayList<TBean>();
    
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
    public String getStr2() {
        return str2;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
    public Map<String, Object> getExtendDataMap() {
        return extendDataMap;
    }
    public void setExtendDataMap(Map<String, Object> extendDataMap) {
        this.extendDataMap = extendDataMap;
    }
    public List<TBean> getList() {
        return list;
    }
    public void setList(List<TBean> list) {
        this.list = list;
    }
    
    
}
