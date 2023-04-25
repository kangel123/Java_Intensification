package Lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L11 {

	public static void main(String[] args) throws IOException { // csv 파일 읽기
		File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\day_data\\StockDailyPrice.csv"); // csv 파일
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
		// 버퍼로 내용을 읽는 BufferedReader의 객체 호출

		String kopo09_readtxt; // 한 줄씩 내용을 저장하기 위한 용도

		int kopo09_maxStock = Integer.MIN_VALUE; // 최대 주가
		int kopo09_minStockt = Integer.MAX_VALUE; // 최소 주가
		
		while ((kopo09_readtxt = kopo09_br.readLine()) != null) { // readLine()을 사용해 한줄 단위로 kopo09_readtxt에 저장
			String[] kopo09_field = kopo09_readtxt.split(","); // %_%를 구분자로 나누어 배열에 저장 // 내용이 비었으면 종료

			String code = kopo09_field[2];	// 코드
			String year = kopo09_field[1].substring(0, 4);	// 년도
			if (code.equals("A005930") && year.equals("2015")) {	// 삼성전자이고 2015년인 경우				
				int kopo09_stock = Integer.parseInt(kopo09_field[3]);	// 종가
				if(kopo09_maxStock < kopo09_stock) {	// 종가 최대값 구하기
					kopo09_maxStock = kopo09_stock;	// 현재 종가 최대값 변경
				}
				
				if(kopo09_minStockt > kopo09_stock) {	// 종가 최소값 구하기
					kopo09_minStockt = kopo09_stock;	// 현재 종가 최소값 변경
				}
			}
		}

		kopo09_br.close();	// 읽기 용도 버퍼 파일 닫기

		System.out.printf("최대값 : %d\n", kopo09_maxStock);	// 최대 주가 출력
		System.out.printf("최소값 : %d\n", kopo09_minStockt);	// 최소 주가 출력
	}
}
