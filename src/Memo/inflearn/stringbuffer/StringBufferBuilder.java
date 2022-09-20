package Memo.inflearn.stringbuffer;

public class StringBufferBuilder {
	public static void main(String[] args) {
		
		String st1 = "java";
		String st2 = new String("java");
		StringBuffer st3 = new StringBuffer("java");
		StringBuilder st4 = new StringBuilder("java");
		
		System.out.println("st1 : " + st1);
		System.out.println("st2 : " + st2);
		System.out.println("st3 : " + st3);
		System.out.println("st4 : " + st4);
		
		System.out.println();
		System.out.println();
		
		st1 = st1 + "_8";
		st2 = st2 + "_8";
		st3.append("_8");
		st4.append("_8");
		
		System.out.println("st1 : " + st1);
		System.out.println("st2 : " + st2);
		System.out.println("st3 : " + st3);
		System.out.println("st4 : " + st4);
		
		System.out.println();
		System.out.println();
		
		System.out.println(st3.length());
		System.out.println(st4.length());
		
		System.out.println();
		System.out.println();
		
		st3.insert(st3.length()-3, "|||||");
		st4.insert(st4.length()-6, "|||||");
		
		System.out.println("st3 : " + st3);
		System.out.println("st4 : " + st4);
		
		System.out.println();
		System.out.println();
		
		st3.delete(0, 1123);
		st4.delete(1, 2);
		
		
		System.out.println("st3 : " + st3);
		System.out.println("st4 : " + st4);
		
		System.out.println();
		
		st4.deleteCharAt(7);
		System.out.println("st4 : " + st4);
	}
}
