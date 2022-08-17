package ch02.lecture;

public class C01Variable {
	public static void main(String[] args) {
//		변수 : 값을 저장하는 공간의 이름
//		타입명 변수명;
		int a; // a라는 int타입 변수 선언
		a = 3; // a변수에 3 대입(할당)
		
		int b = 3; // b라는 int타입 변수 선언 및 값 대입(할당)
		
//		변수명 작성 규칙
//		사용할수있는 문자 : 영문대소문자, 숫자, $, _~
//		숫자로 시작하면 안댐
//		키워드 사용하면 안댐
//		같은 이름의변수명 재선언 안댐
		
		
		int c; // ok
		int $; // ok
//		int _; // not ok
		int _a; // ok
		int A; // ok
		int B; // ok
//		int 3; // not ok
		int _3; // ok
		
//		변수명 작성 관습 : lowerCamelCase
		int studentNumber;
		int yourCar;
		int MyCar; // 쓰지말것
		int our_home; // 쓰지말것
	}
}
