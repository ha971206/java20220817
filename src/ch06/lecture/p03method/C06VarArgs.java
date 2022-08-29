package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		method1();
		method1(3);
		method1(3,2,1);
		method1(3,2,3,2,5,21,12,32,123);
	}

	static void method1() {
		System.out.println("no int");
	}
	
	static void method1(int a) {
		System.out.println("int 1");
	}
	
//	static void method1(int a, int b) {
//		
//	}
	
	
	static void method1(int a, int b, int c) {
		System.out.println("int 3");
	}
	
	// 가변인자 (varargs)
	// 같은 타입을 여러개(몇개인지 모름) 받을 경우,
	static void method1(int... i) {
		System.out.println("int ...");
		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[1]);
	}
	
	// 가변인자는 파라미터 목록 끝에만 작성 가능
	static void method2(String s, int...i) {
		
	}
	
//	static void method3(int...i,String s) {
//		
//	}
}
