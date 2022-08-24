package ch05.book;

public class ArrayCreatByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		for (int i=0;i<3;i++) {
			System.out.println("scores["+i+"] : " + scores[i]);
		}
			
			int sum = 0;
			for(int i=0;i<3;i++) {
				sum += scores[i];
			}
			System.out.println("총합 : " +sum);
			System.out.println("평?균 : " + (sum / 3));
			double avg = (double) sum / 3;
			System.out.println("평균 : "+avg);
	}
}
