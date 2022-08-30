package ch07.lecture.p01inheritance.package2;

import ch07.lecture.p01inheritance.package1.SuperClass6;

public class SubClass6 extends SuperClass6 {
	public void someMethod() {
//		super.privateMethopd();
//		super.packagePrivateMethod();
		super.protectedMethod();
		super.publicMethod();
	}
}
