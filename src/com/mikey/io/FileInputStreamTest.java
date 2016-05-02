package com.mikey.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException{
//		路径读取问题，相对路径
		FileInputStream fis = new FileInputStream("src/com/mikey/io/FileTest.java");
//		FileInputStream fis = new FileInputStream("\\src\\com\\mikey\\io\\FileInputStreamTest.java");
		
		FileOutputStream fos = new FileOutputStream("newFile.txt");
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		
		while((hasRead = fis.read(bbuf)) > 0){
			fos.write(bbuf, 0, hasRead);
			System.out.println(new String(bbuf, 0 , hasRead));
		}
		fis.close();
	}

}
