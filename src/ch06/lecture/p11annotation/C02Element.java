package ch06.lecture.p11annotation;

public class C02Element {
	@MyAnnotation2(value = "coyote")
	private int i;
	
	@MyAnnotation2(value = "iceman")
	private int j;
	
	@MyAnnotation2("maverick")
	private int l;
	
	@MyAnnotation2
	private int m;
}
