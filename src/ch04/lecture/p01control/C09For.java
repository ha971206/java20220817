package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		System.out.println("==================================");
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print((5-j));
			}
			System.out.println();
		}
		
		System.out.println("======================");
		for(int i=0;i<5;i++) {
			for(int j=6;j<=10;j++) {
				System.out.print(10-j);
			}
			System.out.println();
		}
		
//		System.out.println("===================");
//		for(int i=0;i<5;i++) {
//			for(int j=0)
		}
		
	}

