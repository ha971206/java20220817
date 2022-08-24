package ch04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		System.out.println("sysout");
		System.out.print("엔터없이");
		System.out.println("print");
		System.out.println("다음줄");
		
		for (int i=1;i<=5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		for (int i = 1; i<=5;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
