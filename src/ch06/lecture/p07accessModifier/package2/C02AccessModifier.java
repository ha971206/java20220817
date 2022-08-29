package ch06.lecture.p07accessModifier.package2;

import ch06.lecture.p07accessModifier.package1.MyClass1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
//		o1.name = "iceman"; // 접근지정자 없어서 다른패키지에서 사용x
//		o1.printName(); // 접근지정자 없어서 다른패키지에서 사용x
		
		o1.age = 99; // public 멤버는 다른 패키지에서 사용가능
		o1.printAge(); // public 멤버는 다른 패키지에서 사용가능
	}
}
