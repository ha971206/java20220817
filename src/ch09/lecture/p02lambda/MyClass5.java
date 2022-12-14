package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = s -> {
			System.out.println(s*s);
		};
		
		
		o1.accept(3); // 제곱한 수
		o1.accept(4);
		o1.accept(10);
		
		DoubleConsumer o2 = a -> {
			System.out.println(a/2);
		};
		
		o2.accept(5);
		o2.accept(10);
		o2.accept(7);
		
	}
}

