package ch09.lecture.p01nestredClass;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 l = new MyInterface3() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("재정의한 메소드");
			}
		};
		
		l.method();
	}
}


interface MyInterface3 {
	void method();
}