package chap11.sec01.exam10;

import java.io.IOException;

public class ByteToStringExample {

	public static void main(String[] args) throws Exception {
//		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		String str2 = new String(bytes, 6, 4);
//		System.out.println(str2);
		
		byte[] bytes = new byte[100];
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
		
	}

}
