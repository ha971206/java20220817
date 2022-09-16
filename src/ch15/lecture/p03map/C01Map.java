package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, value) 쌍(entry)으로 저장
		// key는 중복될수 없음
		// key는 하나의 value에 매핑됨
		
		Map<String, String> map = new HashMap<>();
		
		// map에 entry 추가
		map.put("jimin", "bts");
		map.put("hangman", "topgun");
		map.put("batman", "dc");
		map.put("jimin", "hot"); // 이미 있는 key,value를 덮어씀
		
		// entry수 얻기
		int size = map.size();
		
		System.out.println(size);
		System.out.println(map);
		System.out.println();
		
		
		// entry지우기
		map.remove("batman");
		map.remove("coyote");
		
		System.out.println(size);
		System.out.println(map);
		System.out.println();
		
		// 이미 있는 키인가
		boolean a = map.containsKey("jimin");
		
		System.out.println(a);
		System.out.println(map.containsKey("jimin"));
		System.out.println();
		
		// value 얻기
		String val1 = map.get("jimin");
		
		System.out.println(val1);
		System.out.println(map.get("hangman"));
		System.out.println(map.get("asd"));
		System.out.println();
		
		
	}
}
