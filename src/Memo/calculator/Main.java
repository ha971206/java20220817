package Memo.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계산할 값을 입력하세요 || ");
		float a = scanner.nextInt();
		
//		System.out.print("연산기호를 입력하세요 || ");
		String z = scanner.next();
		
//		System.out.print("계산할 값을 입력하세요 || ");
		float b = scanner.nextInt();
		
		float c = 0;
		
		System.out.println();
		
		switch (z) {
		case "+":
			c = a + b;
			System.out.println("result : " + c);
			break;
		
		case "-":
			c = a - b;
			System.out.println("result : " + c);
			break;
			
		case "*":
			c = a * b;
			System.out.println("result : " + c);
			break;
			
		case "/":
			c = a / b;
			System.out.println("result : " + c);
			break;
		}
	}
}
