package ch04.lecture.p01control;

public class C07For {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for (int z=5;z<=10;z++) {
			System.out.println(z);
		}
		
		System.out.println("--------------------------");
		
		for (int x=0;x<=4;x++) {
			System.out.println(5-x);
		}
		
		System.out.println("--------------------------");
		
		int c = 0;
		for (;c<=5;c++) {
			System.out.println(10-c);
		}
	}
}
