package ch04.lecture.p01control;

public class C10For {
	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("------------------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=10;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		int k=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		for(int i=0;i<6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println("==================================");
		int a=0;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((a++)%10);
			}
			System.out.println();
		}
		
	}
}
