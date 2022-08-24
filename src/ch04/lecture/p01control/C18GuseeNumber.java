package ch04.lecture.p01control;

import java.util.Scanner;

public class C18GuseeNumber {
	public static void main(String[] args) {
//		컴퓨터 1~100 random
//		맞추면 종료
//		틀리면 큰값/작은값을 부르라고
		
		Scanner scanner = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		
		while(true) {
		System.out.println("1~100 숫자를 입력하세요");
		int user = scanner.nextInt();
		
		if (user == random) {
			System.out.println("정답입니다.");
			break;
		} else if (user < random) {
			System.out.println("더 큽니다.");
		} else {
			System.out.println("더 작습니다.");
		}
			
		}
		
	}
}
