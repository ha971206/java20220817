package Memo.rockabye;

import java.util.Scanner;

public abstract class Student implements Human{
	public class game(int num, int hp) {
		Scanner scan = new Scanner(System.in);
		System.out.print("질문");
		String sc = scan.next();
		boolean zxc = false;
		
		if(sc == "a" || sc == "c" || sc == "e") {
			zxc = true;
		} else if(sc == "b" || sc == "d") {
			zxc = false;
		} else {
			System.out.println("질문은 a,b,c,d,e로 해주세요.");
		}
		
		if(zxc == true) {
			System.out.println("감사합니다.");
		} else {
			System.out.println("감사합니다.");
			hp = -10;
		}
		
		if(hp <= 0) {
			System.out.println("탈주");
		}
	}
	
	
}
