package ch06.lecture.p04static;

public class MyClass3 {
	// instance field
	String name;
	
	// static field
	static String company = "topgun";
	
	public MyClass3(String name) {
		this.name = name;
	}
	
	// static method
	static void printCompany() {
//		System.out.println(this.company);
		// static에서 class에 대한 정보는 불러올수 없음
		// static member는 instance member에 접근할수 없음
		// 반대로는 가능
		System.out.println(company);
	}
	
	// instance method
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		// instance member에서 static member는 접근할수 있음
		System.out.println(company);
	}
	
	void someInstanceMethod() {
		// this는 instance 멤버 접근시 사용 가능
		System.out.println(this.name);
		this.printName();
		printName();
	}
}
