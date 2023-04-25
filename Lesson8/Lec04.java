package Lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec04 {

	public static void main(String[] args) throws IOException { // txt 파일 읽어오기
		File kopo09_f = new File("C:\\Users\\kjw\\Desktop\\무료와이파이정보.txt"); // txt 파일
		BufferedReader kopo09_br = new BufferedReader(new FileReader(kopo09_f)); // 해당 파일을 읽기 용도의 파일 객체를
		// 버퍼로 내용을 읽는 BufferedReader의 객체 호출

		String kopo09_readtxt; // 한 줄씩 내용을 저장하기 위한 용도

		if ((kopo09_readtxt = kopo09_br.readLine()) == null) { // 필드명이 없는 경우
			System.out.printf("빈 파일입니다\n"); // 빈 파일이므로
			return; // 종료
		}

		// 한국폴리텍대학 분당융합기술교육원
		double kopo09_lat = 37.385796; // 위도
		double kopo09_lng = 127.121292; // 경도

		double kopo09_maxDist = Double.MIN_VALUE; // 먼 거리
		double kopo09_minDist = Double.MAX_VALUE; // 가까운 거리

		String kopo09_maxAddress = ""; // 먼 거리의 주소
		String kopo09_minAddress = ""; // 가까운 거리의 주소

		String[] kopo09_field_name = kopo09_readtxt.split("\t"); // 필드명을 배열로 저장

		int kopo09_LineCnt = 1; // 줄 개수
		while ((kopo09_readtxt = kopo09_br.readLine()) != null) { // readLine()을 사용해 한줄 단위로 kopo09_readtxt에 저장
																	// 내용이 비었으면 종료

			String[] kopo09_field = kopo09_readtxt.split("\t"); // 내용을 배열로 저장
			String kopo09_address; // 주소

			try {
				if ((kopo09_address = kopo09_field[10]).equals("")) { // 지번주소을 기본주소로 사용하지만 지번주소가 없으면
					kopo09_address = kopo09_field[9]; // 도로명주소를 주소로 사용
				} // 지번주소, 도로명주소 중 적어도 하나의 주소가 존재

				System.out.printf("**[%d번째 항목]*******************\n", kopo09_LineCnt); // 윗 구분, 줄 번호 출력
				System.out.printf("%s : %s\n", kopo09_field_name[10], kopo09_address); // 지번주소
				System.out.printf("%s : %s\n", kopo09_field_name[13], kopo09_field[13]); // 위도
				System.out.printf("%s : %s\n", kopo09_field_name[14], kopo09_field[14]); // 경도

				if (!kopo09_field[13].equals("") && !kopo09_field[14].equals("")) { // 위도와 경도가 있는 경우에만

					double kopo09_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo09_field[13]) - kopo09_lat, 2)
							+ Math.pow(Double.parseDouble(kopo09_field[14]) - kopo09_lng, 2)); // 거리 구하기

					if (kopo09_maxDist < kopo09_dist) { // 먼 거리 구하기
						kopo09_maxDist = kopo09_dist; // 먼 거리 값 변경
						kopo09_maxAddress = kopo09_address; // 먼 거리의 주소 변경
					}

					if (kopo09_minDist > kopo09_dist) { // 가까운 거리 구하기
						kopo09_minDist = kopo09_dist; // 가까운 거리 값 변경
						kopo09_minAddress = kopo09_address; // 가까운 거리의 주소 변경
					}

					System.out.printf("현재지점과 거리 : %f\n", kopo09_dist); // 거리
					System.out.printf("**********************************\n"); // 아랫 구분
				} else {	// 위도와 경도가 하나 이상 없는 경우
					System.out.printf("위도 또는 경도가 없습니다\n"); // 에러 메시지
					break;
				}

			} catch (Exception e) { // 그 외의 에러가 생겼을 때
				System.out.printf("%d번째 항목에서 에러가 생겼습니다\n", kopo09_LineCnt); // 에러 메시지 출력 후
				break;	// 종료
			} finally {
				kopo09_LineCnt++; // 다음 줄 번호
			}
		}

		System.out.printf("\n가장 먼 곳 : %s\n", kopo09_minAddress); // 먼 거리의 주소 출력
		System.out.printf("가장 먼 곳 : %f\n", kopo09_maxDist); // 먼 거리 출력

		System.out.printf("가장 가까운 곳 : %s\n", kopo09_maxAddress); // 가까운 거리의 주소 출력
		System.out.printf("가장 가까운 곳 : %f\n", kopo09_minDist); // 가까운 거리 출력

	}

}
