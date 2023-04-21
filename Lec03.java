package Lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec03 {

	public static void main(String[] args) throws IOException {	// csv 파일 읽기
		File  kopo09_f = new File ("C:\\Users\\kjw\\Desktop\\무료와이파이정보.csv");	// csv 파일
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
														// 버퍼로 내용을 읽는 BufferedReader의 객체 호출

		String kopo09_readtxt; // 한 줄씩 내용을 저장하기 위한 용도

		if ((kopo09_readtxt = kopo09_br.readLine()) == null) { // 필드명이 없는 경우
			System.out.printf("빈 파일입니다\n"); // 빈 파일이므로
			return; // 종료
		}

		String[] kopo09_field_name = kopo09_readtxt.split(","); // 필드명을 배열로 저장

		int kopo09_LineCnt = 0; // 줄 개수
		while ((kopo09_readtxt = kopo09_br.readLine()) != null) { // readLine()을 사용해 한줄 단위로 kopo09_readtxt에 저장
																	// 내용이 비었으면 종료

			String[] kopo09_field = kopo09_readtxt.split(","); // 내용을 배열로 저장
			System.out.printf("**[%d번째 항목]*******************\n", kopo09_LineCnt); // 윗 구분, 줄 번호 출력
			for (int kopo09_j = 0; kopo09_j < kopo09_field_name.length; kopo09_j++) {	// 모든 필드명에 대하여
				System.out.printf("%s : %s\n", kopo09_field_name[kopo09_j], kopo09_field[kopo09_j]); // 필드명과 내용 출력
			}
			System.out.printf("***********************************\n"); // 아랫 구분
			if(kopo09_LineCnt==100)break;	// 101(0부터 100까지)개의 줄까지, 그 이상은 종료
			kopo09_LineCnt++;	//다음 줄 번호
		}

	}

}
