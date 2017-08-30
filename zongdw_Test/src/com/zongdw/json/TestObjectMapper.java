package com.zongdw.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class TestObjectMapper {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
//			String jsonString = "{\"str1\":\"1\",\"str2\":\"a\",\"extendDataMap\":{\"bb\":\"xx\"}}";
//			Map<String, Object> result = objectMapper.readValue(jsonString, HashMap.class);
//			System.out.println(result.toString());
//			System.out.println(result.get("str1"));
//			System.out.println(((Map<String, Object>)result.get("extendDataMap")).get("bb"));
			
			
			String jsonString = "{\"responseCode\":\"00\",\"responseMessage\":\"调用成功\",\"cardList\":[]}";
			Map<String, Object> result = objectMapper.readValue(jsonString, HashMap.class);
			System.out.println(result.get("responseCode"));
			System.out.println(result.get("responseMessage"));
			System.out.println(((List<Map<String, Object>>) result.get("cardList")).size());
			System.out.println(((List<Map<String, Object>>) result.get("cardList")).isEmpty());
			System.out.println(((List<Map<String, Object>>) result.get("cardList")).get(0));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
