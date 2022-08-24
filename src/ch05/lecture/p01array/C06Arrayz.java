package ch05.lecture.p01array;

public class C06Arrayz {
	public static void main(String[] args) {
		int[] arr1 = {9,8};
		int[] arr2 = {100,50};
		int[] arr3 = {99,100,101};
		
		printFirstItem(arr1);
		printFirstItem(arr2);
		printFirstItem(arr3);
		
		printLastItem(arr1);
		printLastItem(arr2);
		printLastItem(arr3);
		
		printMiddleItem(arr1);
		printMiddleItem(arr2);
		printMiddleItem(arr3);
	}

	private static void printMiddleItem(int[] arr3) {
		// TODO Auto-generated method stub
		System.out.println(arr3[arr3.length / 2]);
	}

	private static void printLastItem(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println(arr1[arr1.length-1]);
	}

	public static void printFirstItem(int[] arr1) {
		System.out.println(arr1[0]);
		
	}
}
