package ch13;

import java.io.*;

public class _03_IOException {
	public static void main(String[] args) throws IOException {
		FileInputStream file = null;
		try {
			file = new FileInputStream("ex.jpg");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(file != null) {
				file.close();
			}
			System.out.println("항상 수행되는 문장");
		}
		System.out.println("정상종료");
	}
}
