package ch06.book.s060703;

public class KoreanExample {
	public static void main(String[] args) {
		Korean a = new Korean("박자바", "011225-1234567");
		System.out.println("a.name: " + a.name);
		System.out.println("a.ssn: " + a.ssn);
		
		Korean b = new Korean("김자바", "970525-0654321");
		System.out.println("b.name: " + b.name);
		System.out.println("b.ssn: " + b.ssn);
		System.out.println();
		System.out.println(b);
	}
}
