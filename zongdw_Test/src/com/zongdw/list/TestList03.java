package com.zongdw.list;

import java.util.ArrayList;

public class TestList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 1000; i++) {
			list.add("sh"+i);
		}
		for (int i = 0; list.iterator().hasNext(); i++) {
			list.remove(i);
			System.out.println("秘密"+list.get(i));
			
		}
	}

}
