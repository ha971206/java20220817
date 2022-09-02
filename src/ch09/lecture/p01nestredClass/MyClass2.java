package ch09.lecture.p01nestredClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2{
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("재정의한 메소드");
			}
		}
		
//		LocalClass l = new LocalClass(); // 둘다 가능
		MyInterface2 l = new LocalClass();
		l.method();
	}
	
	
}

interface MyInterface2 {
	void method();
}