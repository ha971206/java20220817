package ch02.lecture;

public class C02Scope {
	public static void main(String[] args) {
		int a = 3;
		
		if (true) {
			int b = 4;
			System.out.println(b);
		}
//		System.out.println(b); // b는 if안에서만 존재
	}
}
