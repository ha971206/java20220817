package ch02.book;

public class FromIntFloat {
	public static void main(String[] args) {
		int a = 123456780;
		int b = 123456780;
		
		float c = b;
		b = (int) c;
		
		int result = a - b;
		System.out.println(result);
	}
}
