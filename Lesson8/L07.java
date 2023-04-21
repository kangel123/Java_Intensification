package Lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class L07 {
	public static void main(String[] args) throws IOException{
		File  kopo09_f = new File ("C:\\Users\\kjw\\Desktop\\day_data\\THTSKS010H00.dat");	// 주식 데이터
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
															// 버퍼로 내용을 읽는 BufferedReader의 객체 호출
		String kopo09_readtxt;	// 한 줄씩 내용을 저장하기 위한 용도
		int kopo09_LineCnt = 0;	// 줄 번호
		int kopo09_n = -1; // 파일 내 각 줄에 대한 내용의 길이, 빈 파일을 대비하여 -1로 초기화
		
		StringBuffer kopo09_s = new StringBuffer();	// 버퍼 객체 생성
		
		while(true) {
			char[] kopo09_ch = new char[1000];	// 파일 내 각 줄의 내용
			
			kopo09_n = kopo09_br.read(kopo09_ch);	// 해당 내용의 길이를 읽기 (비었으면 -1)

			if (kopo09_n == -1)	break;	// 해당 줄에 내용이 없는 경우 종료

			for(char kopo09_c : kopo09_ch) {	// 저장한 모든 내용을 문자 단위로
				if(kopo09_c=='\n') {	// 다음줄이면
					System.out.printf("[%s]***\n", kopo09_s.toString());	//그동안 읽은 버퍼의 내용을 해당 방식으로 출력
					kopo09_s.delete(0, kopo09_s.length());	// 버퍼에 저장한 내용 제거
				} else {	// 다음줄이 아니면
					kopo09_s.append(kopo09_c);	// 버퍼에 해당 문자 추가
				}
			}
			
			kopo09_LineCnt++;	// 다음 줄번호
		}
		System.out.printf("[%s]***\n", kopo09_s.toString());	// 마지막 줄의 내용 출력
		kopo09_br.close();	// 읽기 용도 버퍼 파일 닫기
	}
}
