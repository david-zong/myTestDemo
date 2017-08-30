package com.zongdw.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");
        for(int i = 0;i<l1.size();i++){
            l2.add(l1.get(i));
        }
        for(String str2 : l2){
            System.out.println(str2);
        }
        
        
    }
    
}
