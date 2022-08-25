package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		int[] c = new int[] {3,4,5};
		int[] d = new int[] {3,4,5};
		int[] e = c;
		
		System.out.println(c == d); // false
		System.out.println(e == c); // true
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.equals(c, d));
	}
}
