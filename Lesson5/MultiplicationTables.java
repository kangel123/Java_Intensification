package Lesson5;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		multiplicationTables1();
//		multiplicationTables2();
		calendar();
	}

	// 가로로 구구단 출력
	public static void multiplicationTables1() {
		for (int kopo09_i = 1; kopo09_i < 10; kopo09_i += 3) {	// kopo09_i는 단을 의미한다. 가로에 3개의 단씩 출력하므로 kopo09_i는 3씩 증가
			System.out.printf("************** ************** ************** \n");	// 위 구분
			System.out.printf(" 구구단 %d 단    구구단 %d 단    구구단 %d 단    \n", kopo09_i, kopo09_i + 1, kopo09_i + 2);	// 가로로 3개의 단이 증가되 나오도록 설정
			System.out.printf("************** ************** ************** \n");	// 아래 구분
			for (int kopo09_j = 1; kopo09_j < 10; kopo09_j++) {	// kopo09_j는 구구단에서 뒤의 숫자를 의미한다
				System.out.printf("  %d * %d = %d\t", kopo09_i, kopo09_j, kopo09_i * kopo09_j);	// 첫번째 단
				System.out.printf(" %d * %d = %d\t", kopo09_i + 1, kopo09_j, (kopo09_i + 1) * kopo09_j);	// 두번째 단
				System.out.printf(" %d * %d = %d\n", kopo09_i + 2, kopo09_j, (kopo09_i + 2) * kopo09_j);	// 세번째 단
			}
		}
	}

	// 세로로 구구단 출력
	public static void multiplicationTables2() {
		for (int kopo09_i = 1; kopo09_i < 4; kopo09_i++) {	// kopo09_i는 단을 의미한다. 단은 세로로 3개씩 증가하며 출력하므로 3번 반복하도록 설정
			System.out.printf("************** ************** ************** \n");	// 위 구분
			System.out.printf(" 구구단 %d 단    구구단 %d 단    구구단 %d 단    \n", kopo09_i, kopo09_i + 3, kopo09_i + 6);	// 세로로 구구단이므로 가로로 증가하는 단은 3이다.
			System.out.printf("************** ************** ************** \n");	// 아래 구분
			for (int kopo09_j = 1; kopo09_j < 10; kopo09_j++) {	// kopo09_j는 구구단에서 뒤의 숫자를 의미한다
				System.out.printf("  %d * %d = %d\t", kopo09_i, kopo09_j, kopo09_i * kopo09_j);	// 첫번째 단
				System.out.printf(" %d * %d = %d\t", kopo09_i + 3, kopo09_j, (kopo09_i + 3) * kopo09_j);	// 두번째 단
				System.out.printf(" %d * %d = %d\n", kopo09_i + 6, kopo09_j, (kopo09_i + 6) * kopo09_j);	// 세번째 단
			}
		}
	}

	// 캘린더
	public static void calendar() {
		String[] kopo09_days = {"일", "월", "화", "수", "목", "금", "토"};	// 요일 배열
		
		int kopo09_iWeekday = 5; // 시작요일 (일:0, 월:1, 화:2, 수:3, 목:4, 금:5, 토:6)
		int kopo09_dateOfFeb;	// 2월의 최대 일수
		
		Scanner scan = new Scanner(System.in);	// 입력을 위한 객체 생성
		while (true) {	// 윤달 여부의 올바른 입력이 있을 때까지 반복
			System.out.printf("윤달인가요?(윤달이면 1, 아니면 0) ");
			int kopo09_yd_flag = scan.nextInt();	// 윤달 구분용
			if (kopo09_yd_flag == 0) {	// 윤달이 아니면
				kopo09_dateOfFeb = 28;	// 2월의 최대 일수는 28로 저장 후
				break;	// 입력 종료
			} else if (kopo09_yd_flag == 1) {	// 윤달이면
				kopo09_dateOfFeb = 29;	// 2월의 최대 일수는 29로 저장 후
				break;	// 입력 종료
			}
		}
		
		int[] kopo09_iLMD = {31, kopo09_dateOfFeb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 각 달의 최대 일수를 배열로 저장
		
		for (int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지 출력하기 위한 반복문
			System.out.printf("\n\n");	// 월 구분 줄바꿈
			System.out.printf("\t  %d월\n", kopo09_month);	// 타이틀
			System.out.printf("======================\n");	// 구분
			for(int kopo09_i = 0; kopo09_i < kopo09_days.length; kopo09_i++) {	// 요일을 출력하는 반복문
				System.out.printf("%2s", kopo09_days[kopo09_i]);	// 요일
			}
			System.out.printf("\n");
			
			for (int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// 날짜를 출력하기 위한 반복문
				kopo09_iWeekday++; // 다음 요일

				if (kopo09_date == 1) {	// 날짜 시작 시
					for (int kopo09_count = 1; kopo09_count < kopo09_iWeekday; kopo09_count++) // kopo09_count은 요일 수만큼 비우기 위한 변수
						System.out.printf("   "); // 3칸 띄어쓰기
				}
				System.out.printf("%3d", kopo09_date); // 3칸을 기준으로 날짜 입력
				// 요일 바꾸기
				if (kopo09_iWeekday % kopo09_days.length == 0) {	// 토요일이면
					kopo09_iWeekday = 0;	// 일요일부터 다시 시작
					System.out.println();
				}

				if(kopo09_iLMD[kopo09_month-1]==kopo09_date) break;	// 인덱스 번호와 월의 차이가 1이므로 kopo09_month-1. 비교문을 통해 같으면 반복문 종료

			}
		}
	}
	
}
