package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C03InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C03InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] b = new byte[100];
		
		
		int len1 = is.read(b);
		int len2 = is.read(b);
		int len3 = is.read(b);
		int len4 = is.read(b);
		int len5 = is.read(b);
		int len6 = is.read(b);
		int len7 = is.read(b);
		int len8 = is.read(b);
		int len9 = is.read(b);
		int len10 = is.read(b);
		int len11 = is.read(b);
		int len12 = is.read(b);
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(len4);
		System.out.println(len5);
		System.out.println(len6);
		System.out.println(len7);
		System.out.println(len8);
		System.out.println(len9);
		System.out.println(len10);
		System.out.println(len11);
		System.out.println(len12);
		
		is.close();
	}
}
