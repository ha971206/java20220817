package ch10.lecture.p01exception;

public class C03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
	System.out.println(args.length);
	System.out.println(args.toString());
	System.out.println(args);
	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);
//	System.out.println(args[3]);
	System.out.println(args.toString());
	
	System.out.println("프로그램 종료");
	}

	@Override
	public String toString() {
		return "C03ArrayIndexOutOfBoundsException [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
