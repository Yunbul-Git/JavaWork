package com.lec.java.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* Buffered Stream + Buffer 예제
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
*/

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream + Buffer");

		// file03 패키지 참조
		// try with resource 구문으로 작성
		// in.read(buff) --> bin.read(buff);
		// out.write( , , ) --> bout.write( , , ); 사용
		// finally 필요 없슴
		try (InputStream in = new FileInputStream("temp/big_text.txt");
				BufferedInputStream bin = new BufferedInputStream(in); // 장착
				OutputStream out = new FileOutputStream("temp/copy_big_text.txt");
				BufferedOutputStream bout = new BufferedOutputStream(out);) {
			byte[] buff = new byte[1024]; // 버퍼준비
			int lengthRead = in.read(buff); // 버퍼에 읽어들인 바이트수
			int byteCopied = 0;
			// 파일복사
			long startTime = System.currentTimeMillis();
			while (true) {
				// 매개변수로 주어진 byte[] 배열의 길이 만큼 read한다.
				// 실제 읽어 들인 데이터는 매개변수 byte[] 에 담김.
				// 읽어들인 바이트 리턴, 읽어들인게 없으면 -1 리턴.
				lengthRead = bin.read(buff);
				if (lengthRead == -1)
					break;
				// 데이터쓰기
				bout.write(buff, 0, lengthRead); // 직전에 읽어들인 데이터만큼 write
				byteCopied += lengthRead;
			}
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;
			System.out.println(elapsedTime);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO

		System.out.println("\n프로그램 종료");

	} // end main()

} // end class File05Main
