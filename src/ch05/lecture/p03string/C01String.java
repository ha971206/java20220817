package ch05.lecture.p03string;

public class C01String {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a==b); // true
		
		String s1="java";
		String s2="java";
		String s3="ja";
		String s4="va";
		String s5= s3 + s4; // java
		
		System.out.println(s1); // java
		System.out.println(s5); // java
		
		System.out.println(s1 == s2); // java
		System.out.println(s1 == s5); // false
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(s5));
		
		System.out.println(s1.equals(s5));
		System.out.println(s1.contentEquals(s5));
	}
}
