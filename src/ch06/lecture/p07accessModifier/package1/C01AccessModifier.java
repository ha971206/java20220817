package ch06.lecture.p07accessModifier.package1;

public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.name = "coyote";
		o1.printName();
		
		o1.age = 99;
		o1.printAge();
		
		// private 멤버는 같은 패키지여도 사용불가능
//		o1.secret = "my secret";
		o1.setSecret("my secret");
		o1.printSecret();
	}
}
