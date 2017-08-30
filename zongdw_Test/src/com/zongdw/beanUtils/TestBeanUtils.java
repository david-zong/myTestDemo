package com.zongdw.beanUtils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.google.gson.Gson;

public class TestBeanUtils {

	public static void main(String[] args) {
		Gson gson = new Gson();
		TBean bean = new TBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "aa");
		map.put("b", 23);
		map.put("c", 34);
		map.put("d", 56);
		map.put("e", "we");
		
		Map m = new HashMap();
		m.put("ff", 123);
		m.put("gg", "abc");
		map.put("m", m);
		
		String jString = gson.toJson(map);
		System.out.println(jString);
		bean = gson.fromJson(jString, bean.getClass());
		//copyProperties只支持两个对象间的拷贝，不支持map和对象间的拷贝
//		BeanUtils.copyProperties(map, bean);
		System.out.println(bean.toString());
		System.out.println(bean.getM().get("gg"));
	}

}
class TBean{
	private String a;
	private Integer b=0;
	private Double c;
	private Long d;
	private Map m = null;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(a).append(" ").
		append(b).append(" ").
		append(c).append(" ").
		append(d).append(" ").
		append(m);
		return sb.toString();
	}
	
	public Map getM() {
		return m;
	}

	public void setM(Map m) {
		this.m = m;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Double getC() {
		return c;
	}
	public void setC(Double c) {
		this.c = c;
	}
	public Long getD() {
		return d;
	}
	public void setD(Long d) {
		this.d = d;
	}
	
}
