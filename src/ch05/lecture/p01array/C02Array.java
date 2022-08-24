package ch05.lecture.p01array;

public class C02Array {
	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[3];
		
		arr1[0] = 9;
		arr1[1] = 8;
		arr1[2] = 7;
		
		int[] arr2;
		arr2 = new int[] {9,8,7};
		
		int[] arr3 = new int[] {9,8,7};
		
		for (int i=0;i<3;i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(arr2[i]);
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(arr3[i]);
		}
	}
}
