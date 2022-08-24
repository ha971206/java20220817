package ch05.lecture.p01array;

public class C05Length {
	public static void main(String[] args) {
		int[] arr1 = {100,200,300}; // 3
		
		int[] arr2 = {9,8}; // 2
		
		int[] arr3 = {2}; // 1
		
		int[] arr4 = {}; // 0
		
		int sum1 = printLength(arr1);
		int sum2 = printLength(arr2);
		int sum3 = printLength(arr3);
		int sum4 = printLength(arr4);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		}
	
	public static int printLength(int[] asd) {
		int sum = asd.length;
		return sum;
	}
}
