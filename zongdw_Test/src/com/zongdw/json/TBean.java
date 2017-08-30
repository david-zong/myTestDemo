package com.zongdw.json;

public class TBean {
    private String key;
    private String value;
    
    TBean(String key,String value){
        this.key = key;
        this.value = value;
    }
    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
}
