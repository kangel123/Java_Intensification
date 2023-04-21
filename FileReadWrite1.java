package Lesson8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite1 {

	public static void main(String[] args) {	// 버퍼 X
		try { // 에러가 생기지 않으면 계속 실행
			File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\test1.txt"); // 파일 객체를 생성
			FileWriter kopo09_fw = new FileWriter(kopo09_f); // 해당 파일을 쓰기 용도의 파일 객체 생성

			kopo09_fw.write("안녕 파일\n"); // 파일에 내용을 넣기
			kopo09_fw.write("hello 헬로\n"); // 파일에 내용을 넣기

			kopo09_fw.close(); // 쓰기 용도로 생성한 파일을 닫기

			FileReader kopo09_fr = new FileReader(kopo09_f); // 해당 파일을 읽기 용도의 파일 객체 생성

			int kopo09_n = -1; // 파일 내 각 줄에 대한 내용의 길이, 빈 파일을 대비하여 -1로 초기화
			char[] kopo09_ch;	// 파일 내 내용

			while (true) {	// 반복문
				kopo09_ch = new char[100];	// 해당 줄에 100글자 내의 내용까지 저장
											// 버퍼X이므로 배열로 읽을 글자 수를 정해줘야 한다.
				kopo09_n = kopo09_fr.read(kopo09_ch);	// 해당 내용의 길이를 읽기 (비었으면 -1)

				if (kopo09_n == -1)	break;	// 해당 줄에 내용이 없는 경우 종료

				for (int kopo09_i = 0; kopo09_i < kopo09_n; kopo09_i++) {	// 추출한 모든 내용에 대하여
					System.out.printf("%c", kopo09_ch[kopo09_i]);	// 문자로 한 글자씩 출력, \n도 읽기 때문에 알아서 줄 바꿈
				}
			}
			
			kopo09_fr.close(); // 읽기 용도로 생성한 파일을 닫기
		
			System.out.printf("\n FILE READ END ");	// 파일 읽기 완료 메시지
			
		} catch (Exception e) { // 에러 발생 시 예외 처리
			System.out.printf("나 에러[%s]\n", e);
		}

	}

}
