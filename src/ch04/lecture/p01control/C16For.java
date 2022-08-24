package ch04.lecture.p01control;

import java.util.Scanner;

public class C16For {
	public static void main(String[] args) {
		
		Scanner scanners = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		
		int first = scanners.nextInt();
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("마지막 정수 입력 ("+first+"보다 큰수)");
		
		
		int last = scanners.nextInt();
		
		int sum = 0;
		
		for(int i=first;i<=last;i++) {
			sum +=i;
		}
		
		System.out.println(first+"부터 "+last + "수까지의 합 : " + sum);
	}
}
