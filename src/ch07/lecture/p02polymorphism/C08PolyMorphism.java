package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		
		System.out.println(a.length());
		
		Object b = "coyote";
		
//		System.out.println(b.length());
		
		String c = (String) b;
		System.out.println(c.length());
		
		
	}
}
