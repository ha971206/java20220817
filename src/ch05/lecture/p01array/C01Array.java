package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]
		
		int[] arr1;  //arr1배열이 저장하는 값의 타입은 int
		double[] arr2; //arr2배열이 저장하는 값의 타입은 double
		String[] arr3; //arr3배열이 저장하는 값의 타입은 String
		
//		해도 되긴함
//		int arr4[];
//		double arr5[];
//		String arr6[];
		
		int a;
		a = 3;
		
		int[] arr4;
		arr4 = new int[5]; // int 값 5개 저장할 공간 생성
		
		arr4[0] = 10;
		arr4[1] = 11;
		arr4[2] = 12;
		arr4[3] = 13;
		arr4[4] = 14;
//		arr4[5] = 15; // 없다면 프로그램이 종료되어버림
		
		for(int i=0;i<5;i++) {
			System.out.println("arr4 ["+i+"] = "+arr4[i]);
		}
	}
}
