package ch02.lecture;

public class C10Expression {
	public static void main(String[] args) {
//		작은타입과 큰타입을 피연산자로 두고 연산하면 결과는 큰타입
		
		int a = 99;
		long b = 100;
		
//		int c = a + b; // x
		long d = a+b; // 가능
		
		float e = 3.14F;
		double f = 3.14;
		
//		float g = e + f; // x
		double h = e + f; // 가능
		
		int i = 9;
		double j = 10;
		
//		int k = i + j; // x
		double l = i + j; // 가능
		
//		정수타입 (byte, short, char, int)끼리 연산은 결과가 int
		byte m = 3;
		byte n = 4;
//		byte o = m + n; // x
		int p = m + n; // 가능
		
		char q = '가';
		char r = '나';
		
//		char s = q + r; // x
		int t = q + r; // 가능
	}
}
