package ch03.book;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)?'B':'c');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
