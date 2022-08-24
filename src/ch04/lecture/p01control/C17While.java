package ch04.lecture.p01control;

import java.util.Scanner;

public class C17While {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주사위 맞추기");
		
		while (true) {
		System.out.print("번호를 입력하세요(1~6) : ");
		
		int dice = scanner.nextInt();
		
		int d = (int)(Math.random() * dice) + 1;
		
		System.out.println("주사위 결과 : " + d);
		
		if (dice == d) {
			System.out.println("맞췃습니다");
		} else {
			System.out.println("틀렷습니다");
		}
		
//		while (d == dice) {
//			System.out.println("맞췃습니다.");
//			break;
//		} if ( d != dice) {
//			System.out.println("틀렷습니다");
//			System.out.println("다시 입력해주세요");
			
			dice = scanner.nextInt();
		}
	}
}
			
		

