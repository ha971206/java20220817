package ch04.lecture.p01control;

public class C01If {
	public static void main(String[] args) {
//		if (조건) { 코드블럭 }
//		조건이 true일때만 코드블럭 실행
		
		System.out.println("실행1");
		
		if (true) {
		System.out.println("실행2");
		System.out.println("실행3");
		}
		System.out.println("실행4");
		
		int score = 93;
		
		if (score > 90) {
			System.out.println("점수가 90이상 입니다");
			System.out.println("등급은 a 입니다");
		} else {
			System.out.println("탈락입니다");
		}
	}
}
