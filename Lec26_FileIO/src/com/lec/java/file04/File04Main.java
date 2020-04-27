package com.lec.java.file04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 보조스트림 (filter stream)
Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
Program <=== BufferedInputStream <=== FileInputStream <=== File

Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
Program ===> BufferedOutputStream ===> FileOutputStream ===> File

java.io.InputStream
 |__ java.io.FilterInputStream
      |__ java.io.BufferedInputStream

java.io.OutputStream
 |__ java.io.FilterOutputStream
      |__ java.io.BufferedOutputStream

참고 ) 보조스트림 (filter stream)
보조스트림(filter stream) 이란 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림
*/
public class File04Main {

	public static void main(String[] args) {
		System.out.println("BufferedInputStream, BufferedOutputStream");
		InputStream in = null; // InputStream 변수 선언
		OutputStream out = null; // OutputStream 변수 선언
		long startTime = System.currentTimeMillis();
// FileInputStream 인스턴스 생성
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		try {
			in = new FileInputStream("temp/big_text.txt");
			bin = new BufferedInputStream(in);
			out = new FileOutputStream("temp/copy_big_text.txt");
			bout = new BufferedOutputStream(out);
			// 위 파일이 없으면 새로생성, 있으면 삭제후 재생성 (기존 파일 소실)
			int dataRead;
			int bytesCopied = 0;
			while (true) {
				dataRead = bin.read();
				if (dataRead == -1) { // 더이상 읽을 것이 없으면 read() 는 -1 리턴
					break;
				}
				bout.write(dataRead);
				bytesCopied++;
			}
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;
			System.out.println("읽고 쓴 바이트 : " + bytesCopied);
			System.out.println("경과시간 : " + elapsedTime + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제
			try {
				if (bout != null) bout.close();
				if (bin != null)  bin.close();
				// bin, bout을 close 하면 저절로 in, out이 close됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n프로그램 종료");

	} // end main()

} // end class
