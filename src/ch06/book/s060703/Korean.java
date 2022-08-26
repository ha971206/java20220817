package ch06.book.s060703;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
	public Korean(String n, String s) {
		name = n;
		ssn = s;
		
		
	}
	public Korean() {
		System.out.println(nation);
		System.out.println(name);
		System.out.println(ssn);
	}
	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}
