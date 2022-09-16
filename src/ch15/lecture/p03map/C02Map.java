package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Map {
	public static void main(String[] args) {
		// 전체 entry 탐색
		
		Map<String, String> map = new HashMap<>();
		map.put("korea", "seoul");
		map.put("japan", "tokyo");
		map.put("us", "몰?루");
		
		// keySet 이용
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":" + val);
		}
		
		// EntrySet 이용
		System.out.println("EntrySet 이용");
		Set<Map.Entry<String, String>> ent = map.entrySet();
		for(Map.Entry<String, String> en : ent) {
			System.out.println(en.getKey() + ":" + en.getValue());
		}
		
		// forEach 메소드 사용
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
	}
}
