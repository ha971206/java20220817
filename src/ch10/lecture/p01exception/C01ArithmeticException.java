package ch10.lecture.p01exception;

public class C01ArithmeticException {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		int c = a / b;
		// 0으로 나눠지지않기 때문에 Exception이 뜸
		
		System.out.println(c);
		
		System.out.println("프로그램 종료");
	}
}
