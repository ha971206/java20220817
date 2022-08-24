package ch04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		while(true) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			int result = dice1 + dice2;
			System.out.println("("+dice1+" , "+dice2+") "+result);
			if(result == 5) {
				System.out.println("종료");
				break;
			}
			
		}
	}
}