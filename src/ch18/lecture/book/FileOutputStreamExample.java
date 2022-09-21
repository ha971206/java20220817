package ch18.lecture.book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String origin = "C:\\Users\\user\\Desktop\\output\\index.jpg";
		String copy = "C:\\Users\\user\\Desktop\\output\\index2.jpg";
		
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(copy);
		
		
		int cntz;
		byte[] cnt = new byte[100];
		while((cntz = fis.read(cnt)) != -1) {
			fos.write(cnt,0,cntz);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사 완료");
	}
}
