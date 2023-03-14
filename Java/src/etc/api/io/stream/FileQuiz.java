package etc.api.io.stream;

import java.awt.image.RescaleOp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.

        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.

        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명: ");
		String fileName = sc.next();

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {
			oldFile = new FileInputStream("C:\\work\\file" + fileName + ".txt" );
			newFile = new FileOutputStream("C:\\work\\upload\\copy.txt");

			byte[] arr = new byte[100];
			int result;
			while((result = oldFile.read(arr))!= -1) {
				newFile.write(arr,0,result);
			}
			
//			while (true) {
//				int result = oldFile.read(arr);
//				if(result == -1 ) break;
//				newFile.write(arr,0,result);
//			}



		} catch (FileNotFoundException e) {
			System.out.println("파일명을  찾을수 없다");
		} catch(IOException e) {
			System.out.println("파일 처리중에 에러 발생했다.");
		}finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				System.out.println("close 과정에서 에러가 발생");
			}
		}







	}

}
