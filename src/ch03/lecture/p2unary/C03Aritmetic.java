package ch03.lecture.p2unary;

public class C03Aritmetic {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		double c = a+b;
		System.out.println(c);
		
//		정수를 0으로 나눌때 주의
		int d = 3;
		int e = 0;
		System.out.println(e/d); // 가능
		
		
		if(e !=0) {
		System.out.println(d/e); // 0으로 나누기 안댐
	}	else {
		System.out.println("cant");
	}
		double f = 3.0;
		double g = 0.0;
		double h = -3.0;
		double i = -0.0;
		System.out.println(g/f); // 0
		System.out.println(f/g); // infinity
		System.out.println(h/g); // -infinity
		System.out.println(f/i); // -infinity
		
//		0으로 나눈 나머지
		System.out.println(f%g); // NaN (Not a Number)
		
		
	}
}