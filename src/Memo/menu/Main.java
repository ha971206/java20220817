package Memo.menu;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. 메뉴등록 || 2. 메뉴보기 : ");
		int sel = scanner.nextInt();
		System.out.println();
		
		while(sel != 0) {
			
			switch (sel) {
			case 1:
				
				System.out.print("메뉴를 등록할 날짜 월일(ex 0930)을 입력해주세요. : ");
				int date = scanner.nextInt();
				System.out.println();
				
				
				System.out.print(date + "메뉴를 입력해주세요. : ");
				String menu = scanner.next();
				System.out.println();
				
				map.put(date, menu);
				
				break;
	
			case 2:
				
				break;
			
			default:
				
				break;
			}
		
		}
		
		
		
	
	}
}
