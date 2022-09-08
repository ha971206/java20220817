package ch11.lecture.p05class;

public class C01Class {
	public static void main(String[] args) throws Exception {
		Class c;
		
		String s1 = "java";
		
		Class<String> c1 = (Class<String>) s1.getClass();
		System.out.println(c1.getName());
		
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2);
		
		Class c3 = String.class;
		System.out.println(c3);
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c2 == c3);
		
	}
}
