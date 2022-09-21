package ch18.lecture.book;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/ch18/lecture/book/FileInputStreamExample.java");
			int data;
			while((data = fis.read())!= -1) {
				System.out.println(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
