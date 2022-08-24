package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9,8};
		int[] arr2 = {100,50};
		int[] arr3 = {99,100,101};
		
//		printFirstItem(arr1) 9
		int a = printFirstItem(arr1);
		int b = printFirstItem(arr2);
		int c = printFirstItem(arr3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(new int[] {10000});
		
		int d = printLastItem(arr1);
		int e = printLastItem(arr2);
		int f = printLastItem(arr3);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(new int[] {-1});
		
		int g = printMiddleItem(arr1);
		int h = printMiddleItem(arr2);
		int i = printMiddleItem(arr3);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(new int[] {5,6,7,8,9});
		
	}
	
	public static int printFirstItem(int[] asd) {
		int sum = asd[0];
		return sum;
	}
	
	public static int printLastItem(int[] zxc) {
		int sum = zxc[zxc.length - 1];
		return sum;
	}
	
	public static int printMiddleItem(int[] qwe) {
		int sum = qwe[qwe.length / 2];
		return sum;
	}
}
