package Lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L10 {
	public static void main(String[] args) throws IOException { // csv 파일 읽기
		File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\day_data\\StockDailyPrice.csv"); // csv 파일
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
		// 버퍼로 내용을 읽는 BufferedReader의 객체 호출

		File kopo09_f1 = new File("C:\\Users\\kjw\\Desktop\\day_data\\20150112.csv"); // 쓰기 할 파일
		BufferedWriter kopo09_bw1 = new BufferedWriter(new FileWriter(kopo09_f1)); // 해당 파일을 쓰기 용도의 파일 객체를
		// 버퍼로 내용을 쓸 BufferedWriter의 객체 호출

		String kopo09_readtxt; // 한 줄씩 내용을 저장하기 위한 용도

		int kopo09_cnt = 0; // StockDailyPrice.csv의 줄 번호
		int kopo09_wcnt = 0; // 20150112.csv의 줄 번호

		while ((kopo09_readtxt = kopo09_br.readLine()) != null) { // readLine()을 사용해 한줄 단위로 kopo09_readtxt에 저장
			StringBuffer kopo09_s = new StringBuffer(); // 버퍼 객체 생성
			String[] kopo09_field = kopo09_readtxt.split(","); // %_%를 구분자로 나누어 배열에 저장 // 내용이 비었으면 종료

			String date = kopo09_field[1];	// 날짜
			
			if (date.equals("20150112")) {	// 날짜가 20150112인 경우
				kopo09_s.append(kopo09_field[0]);	// 첫 문자열 버퍼에 저장
				for (int kopo09_j = 1; kopo09_j < kopo09_field.length; kopo09_j++) { // 남은 문자열에 대하여
					kopo09_s.append("," + kopo09_field[kopo09_j]); // csv에 구분하기 위해 ","를 추가
				}
				kopo09_bw1.write(kopo09_s.toString());	// A005930.csv에 내용 쓰기
				kopo09_bw1.newLine(); // 다음줄
				kopo09_wcnt++;	// 20150112.csv의 줄 번호 증가
			}
			kopo09_cnt++;	// StockDailyPrice.csv의 줄 번호 증가

		}

		kopo09_br.close();	// 읽기 용도 버퍼 파일 닫기
		kopo09_bw1.close();	// 쓰기 용도 버퍼 파일 닫기
		System.out.printf("Program End[%d][%d]records\n",kopo09_cnt,kopo09_wcnt);	// 종료메시지
	}
}
