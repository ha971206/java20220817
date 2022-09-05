package ch10.lecture.p05throw;

public class C02Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생");
		}
		
		System.out.println("실행 이어감");
	}

	private static void method1() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("code1");
		
		throw new Exception();
	}
}
