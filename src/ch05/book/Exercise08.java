package ch05.book;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int leng = 0;
		
		//
		for(int i=0;i<array.length;i++) {
			for(int a : array[i]) {
				sum += a; 
				
//				return leng;
			};
			leng += array[i].length;
		};
		avg = sum / (double)leng;
//		System.out.println(leng);
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
}
