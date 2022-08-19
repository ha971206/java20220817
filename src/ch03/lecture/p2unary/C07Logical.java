package ch03.lecture.p2unary;

public class C07Logical {
	public static void main(String[] args) {
//		논리연산자
//		and : &&, &
//		or : ||, |
//		xor : ^
//		not : !
//		피연산자 : boolean
//		결과 :  boolean
		
//		and : true && true => true
//			  true && false => false
//			  false && true => false
//			  false && false => false
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
//		or : true || true => true
//			 true || false => true
//			false || true => true
//			false || false => false
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

//		xor : true ^ true => false (같으면 false)
//			  true ^ false => true (다르면 true)
//			 false ^ true => true (다르면 true)
//			 false ^ false => false (같으면 false)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}
