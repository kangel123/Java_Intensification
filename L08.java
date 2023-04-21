package Lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L08 {
	public static void main(String[] args)throws IOException{
		File  kopo09_f = new File ("C:\\Users\\kjw\\Desktop\\day_data\\THTSKS010H00.dat"); // 읽을 파일
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
															// 버퍼로 내용을 읽는 BufferedReader의 객체 호출
		
		File  kopo09_f1 = new File ("C:\\Users\\kjw\\Desktop\\day_data\\StockDailyPrice.csv"); // 쓰기 할 파일
		BufferedWriter kopo09_bw1 = new BufferedWriter(new FileWriter(kopo09_f1)); // 해당 파일을 쓰기 용도의 파일 객체를
															// 버퍼로 내용을 쓸 BufferedWriter의 객체 호출
			
		String kopo09_readtxt;	// 한 줄씩 내용을 저장하기 위한 용도
		int kopo09_cnt = 0;	// THTSKS010H00.dat의 줄 번호
		int kopo09_wcnt = 0; // StockDailyPrice.csv의 줄 번호
		
		while((kopo09_readtxt = kopo09_br.readLine())!=null) {	// 다음 줄 내용이 비어있을 때까지 반복
			StringBuffer kopo09_s = new StringBuffer();	// 버퍼 객체 생성
			String[] kopo09_field = kopo09_readtxt.split("%_%");	// %_%를 구분자로 나누어 배열에 저장
			
			/* 해당 파일의 내용의 형식은 줄별로 2가지가 존재하는데 그중 하나는 "_"만 존재하므로 길이가 1이고
			다른 하나는 kopo09_field[2]에 해당하는 위치에 빈 공간과 "^"가 존재하므로 이를 제거한다. 
			*/
			if(kopo09_field.length > 2 && kopo09_field[2].replace("^","").trim().substring(0, 1).equals("A")) { // 위에 설명한 경우 중에 "A"로 시작하는 경우
				kopo09_s.append(kopo09_field[0].replace("^", "").trim());	// 앞의 문자를 버퍼에 "^"와 빈공간을 제거 후 저장
				for(int kopo09_j=1;kopo09_j<kopo09_field.length;kopo09_j++) {	// 남은 문자열에 대하여
					kopo09_s.append(","+kopo09_field[kopo09_j].replace("^", "").trim());	// csv에 구분하기 위해 ","를 추가하였고 "^"와 빈공간을 제거 후 버퍼에 저장
				}
				kopo09_bw1.write(kopo09_s.toString());kopo09_bw1.newLine();	// 해당 내용을 csv파일에 쓰기
				
				kopo09_cnt++;	// StockDailyPrice.csv의 다음 줄 이동
			}
			
			kopo09_cnt++;	// THTSKS010H00.dat의 다음 줄 이동
		}

		kopo09_br.close();	// 읽기 용도 버퍼 파일 닫기
		kopo09_bw1.close();	// 쓰기 용도 버퍼 파일 닫기
		System.out.printf("Program End[%d][%d]records\n",kopo09_cnt,kopo09_wcnt);	// 종료메시지
	}
}
