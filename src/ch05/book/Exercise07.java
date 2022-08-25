package ch05.book;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int min = 10;
		int[] array = new int[] {1,5,3,8,2};
		
		//
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
//				int a = max;
				max = array[i];
//				max += array[i];
//				max = max - a;
			}
		}
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
