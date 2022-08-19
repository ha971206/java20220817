package ch02.book;

public class FromIntToDouble {
	public static void main(String[] args) {
		int a = 123456780;
		int b = 123456780;
		
		double c = b;
		b = (int) c;
		
		int d = a - b;
		System.out.println(d);
	}
}
