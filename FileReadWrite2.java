package Lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite2 {	
	public static void FileWrite() throws IOException {	// 파일 버퍼로 쓰기
		File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\test2.txt"); // 파일 객체를 생성
		BufferedWriter kopo09_bw = new BufferedWriter(new FileWriter(kopo09_f)); // 해당 파일을 쓰기 용도의 파일 객체를 
																	// 버퍼로 내용을 쓰는 BufferedWriter의 객체 호출

		kopo09_bw.write("안녕 파일");	// 파일 내용 쓰기
		kopo09_bw.newLine();	// 다음 줄
		kopo09_bw.write("hello 헬로");	// 파일 내용 쓰기
		kopo09_bw.newLine();	// 다음 줄

		kopo09_bw.close();	// 쓰기 용도 버퍼 파일 닫기
	}

	public static void FileRead() throws IOException {	// 파일 버퍼로 읽기
		File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\test2.txt"); // 파일 객체를 생성
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를 
																	// 버퍼로 내용을 읽는 BufferedWriter의 객체 호출

		String kopo09_readtxt;	// 한 줄씩 내용을 저장하기 위한 용도

		while ((kopo09_readtxt = kopo09_br.readLine()) != null) {	// readLine()을 사용해 한줄 단위로 kopo09_readtxt에 저장
															// 내용이 비었으면 종료
			System.out.printf("%s\n", kopo09_readtxt);	// 내용을 문자열 단위로 출력
		}

		kopo09_br.close();	// 읽기 용도 버퍼 파일 닫기
	}
	
	public static void main(String[] args) throws IOException {	// 버퍼 O
																	// IOException는 파일 읽고 쓰기 과정 중 에러 발생한 경우
		FileWrite();	// 파일 버퍼로 쓰기
		FileRead();	// 파일 버퍼로 읽기
	}

}
