package com.zongdw.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestJson {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		List<OperatorInfo> records = new ArrayList<OperatorInfo>();
//		records.add(new OperatorInfo("a11", 111L, 221L, "331", "441", "551"));
//		records.add(new OperatorInfo("a22", 112L, 222L, "332", "442", "552"));
//		records.add(new OperatorInfo("a33", 113L, 223L, "333", "443", "553"));
//		records.add(null);
//		records.add(new OperatorInfo());
//		
//		MamResponse mm = new MamResponse("00", "成功", 1, records);
//		
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(mm);
//		System.out.println(json);
//		
//		MamResponse m1 = gson.fromJson(json, MamResponse.class);
//		
//		System.out.println(m1.getResCode());
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<VoucherItem> voucherItems = new ArrayList<VoucherItem>();
		VoucherItem item = new VoucherItem("111", "1",3);
		voucherItems.add(item);
		item = new VoucherItem("222", "2",4);
		voucherItems.add(item);
		map.put("mm", voucherItems);
		map.put("aa", "1");
		map.put("bb", 2);
		map.put("cc", item);
		Gson gson = new Gson();
		
		String vStr = gson.toJson(map);
		System.out.println(vStr);
//		List<VoucherItem> list = JSON.parseArray(vStr, VoucherItem.class);
//		VoucherItem v1 = list.get(0);
//		System.out.println(v1.getVoucherNo());
//		Map<String, Object> resMap = gson.fromJson(vStr, new TypeToken<Map<String, Object>>() {
//        }.getType());
		
//		vStr = "";//此处json字符串为null时，会报空指针异常;为""时，会发生异常
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> resMap = objectMapper.readValue(vStr, HashMap.class);
		
//		System.out.println(((List<Map>)resMap.get("mm")).get(1).get("voucherNo"));
		List<Map<String, Object>> list = (List<Map<String, Object>>) resMap.get("mm");
		System.out.println(4==(Integer)list.get(1).get("num"));
		
//		Map<String, Object> map2 = (Map<String, Object>) resMap.get("cc");
//		System.out.println(map2.get("voucherNo"));
		
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		Map<String, Object> m1 = new HashMap<String, Object>();
//		m1.put("c", "d");
//		map.put("a", "a");
//		map.put("b", m1);
//		String str = JSONObject.toJSONString(map);
//		System.out.println(str);
//		Map<String, Object> res = (Map<String, Object>) JSON.parse(str);
//		Map<String, String> map2 = (Map<String, String>) res.get("b");
//		System.out.println(map2.get("c"));
		
	}
}
	class VoucherItem {
		/** 券号 */
		private String voucherNo;
		/** 券类型 INNER 内部券   OUTER 外部券 */
		private String voucherType;
		private Integer num;

		public VoucherItem(String voucherNo,String voucherType,Integer num) {
			this.voucherNo = voucherNo;
			this.voucherType = voucherType;
			this.num = num;
		}
		
		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		// 这里必须要默认的构造器
		public VoucherItem() {
		}
		
		public String getVoucherNo() {
			return voucherNo;
		}

		public void setVoucherNo(String voucherNo) {
			this.voucherNo = voucherNo;
		}

		public String getVoucherType() {
			return voucherType;
		}

		public void setVoucherType(String voucherType) {
			this.voucherType = voucherType;
		}
	}
