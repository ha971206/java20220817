package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06Throws {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Throwable e) {
//		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	private static void method1() throws FileNotFoundException {
//	private static void method1() throws IOException {
//	private static void method1() throws Exception {
	private static void method1() throws Throwable {
		
		FileReader a = new FileReader("a");
	}
}
