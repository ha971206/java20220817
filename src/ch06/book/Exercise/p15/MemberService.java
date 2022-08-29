package ch06.book.Exercise.p15;

public class MemberService {
	boolean log;
	
	boolean login(String a, String b) {
//		if(a=="hong" && b=="12345") {
//			log = true;
//			return log;
//		} else {
//			log = false;
//			return log;
//		}
		return a.equals("hong") && b.equals("12345"); 
	}
	
	void logout(String a) {
		System.out.println("로그아웃 되었습니다.");
	}
}
