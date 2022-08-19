package ch03.lecture.p2unary;

public class C06ComparisonString {
	public static void main(String[] args) {
//		String 끼리 크기 비교 연산 안됨 (<, <=, >, >=)
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a < b); // x
		
//		String 끼리 같은지 비교연산 (==, !=) 안쓰길 기도할것
//		대신 equals 메소드 꼮꼮 쓰기
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // "java"
		
		System.out.println(c == d); // true
		System.out.println(c == g); // false
		
		System.out.println(c.equals(d)); // true
		System.out.println(c.equals(g)); // true
		
	}
}
