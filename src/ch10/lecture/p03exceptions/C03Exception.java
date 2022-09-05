package ch10.lecture.p03exceptions;

public class C03Exception {
	public static void main(String[] args) {
		
		try {
			Class a = Class.forName("java.lang.String");

			System.out.println(a.toString());
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Class b = Class.forName("java.lang.String");
			System.out.println(b.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
