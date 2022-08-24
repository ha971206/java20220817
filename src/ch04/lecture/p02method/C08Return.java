package ch04.lecture.p02method;

public class C08Return {
	public static void main(String[] args) {
		System.out.println(1);
		int r = method1();  // return이 5로 되었기때문에 5가 나옴
		System.out.println(r);
		System.out.println(2);
		
		
	}
	
	public static int method1() {
		return 5;
	}
}
