package Lesson4;

public class PrintDate {
	public static void main(String[] args) {

//		printAllDate1();
//		printAllDate2();
//		printAllDate3();
//		printAllDate4();
		printAllDate5();
	}
	
	// 날짜 출력1
	public static void printAllDate1() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지
			System.out.printf("%d월 =>", kopo09_month);	// 월 출력
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// 일(date)은 1일부터 최대 일수인 31까지 수행
				System.out.printf("%d", kopo09_date);	// 일 출력
				
				if(kopo09_month==1 && kopo09_date==31) break;	// 1월 31일이면 반복문 종료
				if(kopo09_month==2 && kopo09_date==28) break;	// 2월 28일이면 반복문 종료
				if(kopo09_month==3 && kopo09_date==31) break;	// 3월 31일이면 반복문 종료
				if(kopo09_month==4 && kopo09_date==30) break;	// 4월 30일이면 반복문 종료
				if(kopo09_month==5 && kopo09_date==31) break;	// 5월 31일이면 반복문 종료
				if(kopo09_month==6 && kopo09_date==30) break;	// 6월 30일이면 반복문 종료
				if(kopo09_month==7 && kopo09_date==31) break;	// 7월 31일이면 반복문 종료
				if(kopo09_month==8 && kopo09_date==31) break;	// 8월 31일이면 반복문 종료
				if(kopo09_month==9 && kopo09_date==30) break;	// 9월 30일이면 반복문 종료
				if(kopo09_month==10 && kopo09_date==31) break;	// 10월 31일이면 반복문 종료
				if(kopo09_month==11 && kopo09_date==30) break;	// 11월 30일이면 반복문 종료
				if(kopo09_month==12 && kopo09_date==31) break;	// 12월 31일이면 반복문 종료
		
				System.out.printf(", ");	// 일(date)을 구분하기 위한 ,
			}
			System.out.printf("\n");	// 그 다음 월을 위해 한줄 내림
		}
	}

	// 날짜 출력2
	public static void printAllDate2() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지
			System.out.printf("%d월 =>", kopo09_month);	// 월 출력
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// 일(date)은 1일부터 최대 일수인 31까지 수행
				System.out.printf("%d", kopo09_date);	// 일 출력
				
				if(kopo09_month==4 || kopo09_month==6 || kopo09_month==9 || kopo09_month==11) {	// 4월, 6월, 7월, 11월인 경우
					if(kopo09_date==30) break;	//일수가 30일까지이므로 date가 30이면 반복문 종료
				}
				if(kopo09_month==2) {	// 2월의 경우
					if(kopo09_date==28) break;	//일수가 28일까지이므로 date가 28이면 반복문 종료
				}
				
				if(kopo09_date!=31) System.out.printf(", ");	// 일(date)을 구분하기 위한 ,
			}
			System.out.printf("\n");	// 그 다음 월을 위해 한줄 내림
		}
	}
	

	// 날짜 출력3
	public static void printAllDate3() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지
			System.out.printf("%d월 =>", kopo09_month);	// 월 출력
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// 일(date)은 1일부터 최대 일수인 31까지 수행
				System.out.printf("%d", kopo09_date);	// 일 출력
				
				if((kopo09_month==4 || kopo09_month==6 || kopo09_month==9 || kopo09_month==11) && (kopo09_date==30)) break;	// 4월, 6월, 7월, 11월은 30일까지이므로 date가 30이면 반복문 종료
				if(kopo09_month==2 && kopo09_date==28) break;	// 2월은 28일까지이므로 date가 28이면 반복문 종료
				
				if(kopo09_date!=31) System.out.printf(", ");	// 일(date)을 구분하기 위한 ,
			}
			System.out.printf("\n");	// 그 다음 월을 위해 한줄 내림
		}
	}
	

	// 날짜 출력
	public static void printAllDate4() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지
			System.out.printf("%d월 =>", kopo09_month);	// 월 출력
			LOOP: for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// Loop문의 시작위치. 일(date)은 1일부터 최대 일수인 31까지 수행
				System.out.printf("%d", kopo09_date);	// 일 출력
				
				switch(kopo09_month) {	// Compare months using switch
				case 4: case 6: case 9: case 11:	// 4월, 6월, 7월, 11월인 경우
					if(kopo09_date==30) break LOOP;	// 일수가 30일까지이므로 date가 30이면 LOOP문 종료
					break;	// 4월, 6월, 7월, 11월의 다른 일수는 swich문만 탈출
				case 2:	// 2월의 경우
					if(kopo09_date==28) break LOOP;	// 2월은 28일까지이므로 date가 28이면 LOOP문 종료
					break;	// 2월의 다른 일수는 swich문만 탈출
				}
				if(kopo09_date!=31) System.out.printf(", ");	// 일(date)을 구분하기 위한 ,
			}
			System.out.printf("\n");	// 그 다음 월을 위해 한줄 내림
		}
	}

	// 배열을 사용한 날짜 출력
	public static void printAllDate5() {
		int[] kopo09_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 각 달의 최대 일수를 배열로 저장
		
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// 1월부터 12월까지
			System.out.printf("%d월 =>", kopo09_month);	// 월 출력
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// 일(date)은 1일부터 최대 일수인 31까지 수행
				System.out.printf("%d", kopo09_date);	// 일 출력
			
				if(kopo09_iLMD[kopo09_month-1]==kopo09_date) break;	// 인덱스 번호와 월의 차이가 1이므로 kopo09_month-1. 비교문을 통해 같으면 반복문 종료
				
				System.out.printf(", ");	// 일(date)을 구분하기 위한 ,
			}
			System.out.printf("\n");	// 그 다음 월을 위해 한줄 내림
		}
	}
}
