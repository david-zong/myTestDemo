package com.zongdw.json;

import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestJsonAndObjectMapper {

	public static Map<String, Object> gsonToMap(String string) {
		Gson gson = new Gson();
		return gson.fromJson(string,
				new TypeToken<Map<String, Object>>() {
				}.getType());
	}
	@SuppressWarnings("unchecked")
	public static Map<String, Object> objectMapperToMap(String string) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(string, Map.class);
	}
	
	public static void main(String[] args) {
		try {
			String jsonString = "{\"pointAmount\":\"0.00\",\"tradeNo\":\"2017051921001004850200225422\",\"orderId\":\"1003480976\",\"notifyTime\":\"2017-05-19 17:31:57\",\"subject\":\"1003480976\",\"invoiceAmount\":\"0.01\",\"buyerId\":\"2088102172192852\",\"gmtCreate\":\"2017-05-19 17:31:50\",\"buyerLogonId\":\"pgi***@sandbox.com\",\"sellerEmail\":\"cxbogh2351@sandbox.com\",\"totalAmount\":\"0.01\",\"receiptAmount\":\"0.01\",\"notifyType\":\"trade_status_sync\",\"sellerId\":\"2088102169751682\",\"gmtPayment\":\"2017-05-19 17:31:57\",\"appId\":\"2016080300156816\",\"outTradeNo\":\"17051917314200001334\",\"tradeStatus\":\"01\",\"buyerPayAmount\":\"0.01\",\"notifyId\":\"6edd9a2bfa725286f8dff0b86120c26mk6\",\"fundBillList\":\"[{\\\"amount\\\":\\\"0.01\\\",\\\"fundChannel\\\":\\\"ALIPAYACCOUNT\\\"}]\"}";
			Map<String, Object> m1 = gsonToMap(jsonString);
			Map<String, Object> m2 = objectMapperToMap(jsonString);
			System.out.println(m1.get("tradeStatus").toString());
			System.out.println(m2.get("tradeStatus").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
