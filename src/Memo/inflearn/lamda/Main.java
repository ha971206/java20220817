package Memo.inflearn.lamda;



public class Main {
	public static void main (String[] args) {
		Interface1 li1 = (String a, String b, String c) -> {System.out.println(a + " " + b + " " + c);};
		li1.method("java","css","html");
		System.out.println();
		
		Interface2 li2 = (int a,int b,int c) -> {System.out.println(a+" "+b+" "+c);};
		li2.method2(8, 10, 99);
		System.out.println();
		
		Interface3 li3 = a -> System.out.println(a);
		li3.method3("jjaavvaa");
		System.out.println();
		
		Interface4 li4 = () -> System.out.println("hhttmmll");
		li4.method4();
		System.out.println();
		
		Interface5 li5 = (a,b) ->{
			int result = a+b;
			return result;
		};
		System.out.println(li5.method5(99, 1));
		System.out.println();
		
		li5 = (a,b) ->{
			int result = a-b;
			return result;
		};
		System.out.println(li5.method5(99, 1));
		System.out.println();
		System.gc();
		
		li5 = (a,b) ->{
			int result = a*b;
			return result;
		};
		System.out.println(li5.method5(99, 2));
		System.out.println();
		
		li5 = (a,b) -> {
			int result = a/b;
			return result;
		};
		System.out.println((double)li5.method5(99, 2));
		
		
		
		
		
		
	}
}

