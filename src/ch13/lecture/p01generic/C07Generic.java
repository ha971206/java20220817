package ch13.lecture.p01generic;

public class C07Generic {
	
}

// 타입 파라미터는 여러개 작성 가능
class MyClass<T, U, t, u, t1, u1>{
	private T val1;
	private U val2;
	
	public void method1(T v) {
		
	}
	
	public void method2(U v) {
		
	}
	
	public T method3(){
		return val1;
	}
	
	public U method4() {
		return val2;
	}
}