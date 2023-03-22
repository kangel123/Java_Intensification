package Lesson4;

public class ReadNumbers {
	public static void main(String[] args) {
//		readNumbers1();
		readNumbers2();
	}

	// 최대 2자리 숫자 읽기
	public static void readNumbers1() {
		String[] kopo09_numbers = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 숫자 호칭을 한글로 저장
		int kopo09_i10, kopo09_i0;	// kopo09_i10은 int형으로 2번째 자리, kopo09_i0은 int형으로 1번째 자리를 의미
		
		for (int kopo09_i = 0; kopo09_i < 101; kopo09_i++) { // 0부터 100까지
			if (kopo09_i >= 0 && kopo09_i < 10) { // 일의 자리이면
				System.out.printf("일의자리 : %s\n", kopo09_numbers[kopo09_i]);	// 배열의 i번째 문자를 출력
			} else if (kopo09_i >= 10 && kopo09_i < 100) {	// 십의 자리이면
				kopo09_i10 = kopo09_i / 10;	// 10을 나눠 몫은 십의 자리로
				kopo09_i0 = kopo09_i % 10;	// 나머지는 일의 자리로
				if (kopo09_i0 == 0) {	// 일의 자리를 0이라 부를 필요가 없으므로 일의 자리가 0이면
					System.out.printf("십의자리: %s십\n", kopo09_numbers[kopo09_i10]);	// 십의 자리 값과 "십"을 출력
				} else {	// 일의 자리가 0이 아니면
					System.out.printf("십의자리: %s십%s\n", kopo09_numbers[kopo09_i10], kopo09_numbers[kopo09_i0]); // 십의 자리 값과 "십", 일의 자리를 순서대로 출력
				}
			} else {	// 3자리 이상이면
				System.out.printf("==> %d\n", kopo09_i); // 숫자를 그대로 출력
			}
		}
	}

	// 최대 10자리 숫자 읽기
	public static void readNumbers2() {
		int kopo09_iNumVal = 2000000000;	// kopo09_iNumVal는 int형 10자리 숫자까지 가능
		String kopo09_sNumVal = String.valueOf(kopo09_iNumVal);	// int형에서 string으로 형변환
		String kopo09_result="";	// 읽을 숫자를 저장하기 위한 용도
		
		System.out.printf("==> %s [%d자리]\n", kopo09_sNumVal, kopo09_sNumVal.length());	// 입력받은 숫자와 최대 자리수
		
		String[] kopo09_numbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};	// 숫자 호칭을 한글로 저장
		String[] kopo09_units = {"","십", "백", "천", "만", "십", "백" ,"천" , "억", "십"};	// 단위를 한글로 저장

		int kopo09_sNumVal_Index, kopo09_units_Index;	// kopo09_sNumVal_Index는 kopo09_sNumVal를 구분하기 위해 사용
														// kopo09_units_Index는 kopo09_units의 인덱스 번호(kopo09_iNumVal의 인덱스 번호로도 사용)
		
		kopo09_sNumVal_Index=0;	// 앞에서부터 시작
		kopo09_units_Index=kopo09_sNumVal.length()-1;	// 단위는 뒤부터 시작. 인덱스번호이므로 kopo09_sNumVal.length()-1
		
		while(true) {	// 반복문
			if(kopo09_sNumVal_Index>= kopo09_sNumVal.length()) break;	// 다 읽었으면 반복문 탈출

			// kopo09_numbers만 사용 시
			// kopo09_iNumVal의 앞에서 부터 사용된 숫자와 숫자 호칭 출력
			System.out.printf("%s[%s]", kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index+1), kopo09_numbers[Integer.parseInt(kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index+1))]);	
			
			// kopo09_numbers와 kopo09_units를 사용한 숫자 읽기
			if(kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index+1).equals("0")) {	// 앞에서부터 kopo09_sNumVal_Index번째의 값이 0인 경우. substring : 글자 자르는 함수
				
				if(kopo09_sNumVal.length() > kopo09_units_Index+4 && // 억의 존재확인(존재시 true)
						kopo09_units[kopo09_units_Index].equals("만") && 	//	만단위의 숫자 확인(맞을 시 true)
						Integer.parseInt(kopo09_sNumVal.substring(kopo09_sNumVal_Index-(kopo09_sNumVal.length()-kopo09_units_Index-2), kopo09_sNumVal_Index+1))==0) {	// 만의 해당하는 값이 0 이면 true. 모든 조건을 만족하면 출력x
				} else if(kopo09_units[kopo09_units_Index].equals("만") || kopo09_units[kopo09_units_Index].equals("억") ) {		// 읽고 있는 숫자 단위가 만이랑 억이면
						kopo09_result = kopo09_result + "" + kopo09_units[kopo09_units_Index];	// 만 또는 억을 결과에 String으로 저장								
				} 	// 읽고 있는 숫자 단위가 만이랑 억이 아닌 경우 출력할 필요x
			} else {	// 앞에서부터 kopo09_sNumVal_Index번째의 값이 0이 아닌 경우
				kopo09_result = kopo09_result + kopo09_numbers[Integer.parseInt(kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index+1))]+ kopo09_units[kopo09_units_Index];	// kopo09_numbers에서 해당하는 값 가져오기
			}
			kopo09_sNumVal_Index++;	// 다음 숫자를 읽기 위해 +1
			kopo09_units_Index--;	// 다음 단위로 넘기기 위해 -1
		}
		System.out.printf("\n %s[%s]\n", kopo09_sNumVal, kopo09_result);	// 결과 출력
	}

}
