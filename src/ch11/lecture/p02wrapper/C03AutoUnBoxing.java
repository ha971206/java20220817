package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		// 참조타입을 기본타입으로 변경(unboxing)
		int b = a.intValue();
		
		// 참조타입을 기본타입으로 자동변경(auto boxing)
		int c = a; // 가눙
		
		Object d = 99;
//		Integer e = d;
//		int f = d;
		
		int g = (Integer) d;
		
		Object[] arr = {"java", 3, 3.14};
		
		
	}
}
