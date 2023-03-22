package Lesson4;

public class Main {
	public static void main(String[] args) {
		switchCaseTest();
		forTest();
	}
	
	// 주민등록번호 남녀구별 (문자열을 switch/case문을 사용하여 비교)
	public static void switchCaseTest() {
		String kopo09_jumin = "123456-1234567"; // kopo09_jumin은 String형 주민등록번호를 의미한다.
		switch (kopo09_jumin.charAt(7)) { // charAt(7)은 주민등록번호의 7번째 인덱스를 char형태로 만든다.
		case '1': // 주민등록번호 뒷자리의 시작이 1인 경우
			System.out.printf("20세기전 태어난 남자 사람\n"); // 20세기전(1900년~1999년) 남자이므로 해당 내용 출력
			break; // switch문 탈출
		case '2': // 주민등록번호 뒷자리의 시작이 2인 경우
			System.out.printf("20세기전 태어난 여자 사람\n"); // 20세기전 여자이므로 해당 내용 출력
			break; // switch문 탈출
		case '3': // 주민등록번호 뒷자리의 시작이 3인 경우
			System.out.printf("20세기후 태어난 남자 사람\n"); // 20세기후(2000년~2099년) 남자이므로 해당 내용 출력
			break; // switch문 탈출
		case '4': // 주민등록번호 뒷자리의 시작이 4인 경우
			System.out.printf("20세기후 태어난 여자 사람\n"); // 20세기후 여자이므로 해당 내용 출력
			break;
		default: // 그외의 경우(단순 입력 실수인 경우 또는 외국인인 경우)
			System.out.printf("사람\n"); // 구분 가능하게 "사람"만 출력
			break; // switch문 탈출
		}	
	}
	
	// for문을 활용하여 합계 구하기와 구구단 만들기
	public static void forTest() {
		// 합계 구하기
		int kopo09_sum = 0;	//  kopo09_sum은 합계를 표현할 int형이다
		for(int kopo09_i = 0; kopo09_i < 10; kopo09_i++) {	// kopo09_i는 0부터 9까지 1씩 증가한다
			kopo09_sum += kopo09_i;	// 0부터 9까지 더한 값을 kopo09_sum에 저장
		}
		System.out.printf("sum %d\n", kopo09_sum);	// 합계 출력

		// 구구단 만들기
		for(int kopo09_i = 1; kopo09_i < 10; kopo09_i++) {	// kopo09_i는 구구단의 단을 의미한다. 1단부터 9단까지 만든다.
			System.out.printf("**************************\n");	// 위 구분
			System.out.printf("        구구단 %d 단\n", kopo09_i);	// 현재 단수를 출력
			System.out.printf("**************************\n");	// 아래 구분
			for(int kopo09_j=1; kopo09_j<10; kopo09_j++) {		// kopo09_j는 구구단에서 뒤의 값이다
				System.out.printf(" %d * %d = %d \n", kopo09_i,  kopo09_j,  kopo09_i* kopo09_j);	// 구구단 출력
			}
		}
	}
}
