package ch05.lecture.p03string;

import java.util.Scanner;

public class C05Instance {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("spring");
		String s3 = new String("java");
		String s4 = new String("java");
		String s5 = new String("jsp");
		
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner("hello");
	}
}
