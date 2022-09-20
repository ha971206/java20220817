package Memo.inflearn.list;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMap {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("java");
		arr.add("css");
		arr.add("spring");
		
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		arr.remove(0);
		System.out.println(arr);
		
		arr.set(0, "jsp");
		System.out.println(arr);
		
		arr.clear();
		System.out.println(arr);
		
		boolean a = arr.isEmpty();
		System.out.println(a);
		
		System.out.println("===============================================");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.size() : " + map.size());
		
		map.put(0, "java");
		map.put(3, "css");
		map.put(8, "html");
		System.out.println("map.size() : " + map.size());
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		map.put(3, "jsp");
		System.out.println(map);
		
		System.out.println(map.get(3));
		map.remove(3);
		System.out.println(map.get(3));
		System.out.println(map.containsKey(0));
		System.out.println(map.containsValue("css"));
		
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.toString());
		System.out.println(map);
		
		
		
	}
}
