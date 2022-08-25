package ch05.book;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		double result = 0; 
		int high = 0;
		Scanner scanner = new Scanner(System .in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum += scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0;i<3;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
//					System.out.println("scores[0]> ");
//					scores[0] = scanner.nextInt();
//					System.out.println("scores[1]> ");
//					scores[1] += scanner.nextInt();
//					System.out.println("scores[2]> ");
//					scores[2] += scanner.nextInt();
//					if(i>=3) {
//						break;
//					}
				}
			} else if(selectNo == 3) {
				for(int i=0;i<3;i++) {
					System.out.println("scores["+i+"]: "+ scores[i]);
				}
			} else if(selectNo == 4) {
				for(int i=0;i<3;i++) {
					if (high<scores[i]) {
						high = scores[i];
					}
				}
				System.out.println("최고 점수: "+high);
				
				for(int i=0;i<3;i++) {
					result += scores[i]; 
				}
				double avg = 0;
				avg = result / (double)studentNum;
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
