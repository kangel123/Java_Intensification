package Lesson7;

public class Extraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo09_OneRec = { "단체명,회원수,소재지도로명주소,소재지지번주소,전화번호,데이터기준일자"
				, "지체장애인협회,1089,전라북도 정읍시 수성5로 41-11,전라북도 정읍시 수성동 1013-7,063-535-2558,2023-03-20"
				, "시각장애인협회,107,\"전라북도 정읍시 벚꽃로 494, 2층\",\"전라북도 정읍시 상동 282-12, 2층\""
				, "농아인협회,102,\"전라북도 정읍시 벚꽃로 494, 1층\",\"전라북도 정읍시 상동 282-12, 1층\""
				, "정읍시장애인부모회,104,전라북도 정읍시 벚꽃로 542,전라북도 정읍시 상동 271-96 ,063-536-3009,2023-03-20"
				, "한국장애인부모회,105,전라북도 정읍시 수성1로 55-1,전라북도 정읍시 수성동 956-9,063-571-3700,2023-03-20"
				, "꿈드래장애인협회(신체),230,\"전라북도 정읍시 수성4로 41-6, 1층\",전라북도 정읍시 수성동 1024-4,063-537-0049"
				, "신장장애인협회,106,\"전라북도 정읍시 상동중앙로 93, 소망하우스 205\",전라북도 정읍시 상동 118 소망하우스 205,070-4124-9413" };

		String[] kopo09_field_name = kopo09_OneRec[0].split(","); // OneRec의 인덱스를 ","로 나눠서 배열에 저장. 필드 이름

		for (int kopo09_i = 1; kopo09_i < kopo09_OneRec.length; kopo09_i++) { // 모든 내용 필드에 대해

			String[] kopo09_field = kopo09_OneRec[kopo09_i].split(","); // 내용도 위와 같이 배열로 저장
			for (int kopo09_j = 0; kopo09_j < kopo09_field.length; kopo09_j++) { // 모든 내용들 중에서
				try {
					kopo09_field[kopo09_j] = readNumbers(kopo09_field[kopo09_j]); // 숫자이면 한글읽기방식으로 변환
				} catch (NumberFormatException ex) { // 숫자가 아닌 경우는 그대로
				}
			}
			System.out.printf("**************************************\n");
			for (int kopo09_j = 0; kopo09_j < kopo09_field.length; kopo09_j++) { // 필드의 모든 배열에 대해
				System.out.printf("%s : %s\n", kopo09_field_name[kopo09_j], kopo09_field[kopo09_j]); // 필드와 내용 출력
			}
			System.out.printf("**************************************\n");
		}
	}

	// 최대 10자리 숫자 읽기
	public static String readNumbers(String kopo09_sNumVal) {
		String kopo09_result = ""; // 읽을 숫자를 저장하기 위한 용도

		String[] kopo09_numbers = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 숫자 호칭을 한글로 저장
		String[] kopo09_units = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 단위를 한글로 저장

		int kopo09_sNumVal_Index, kopo09_units_Index; // kopo09_sNumVal_Index는 kopo09_sNumVal를 구분하기 위해 사용
														// kopo09_units_Index는 kopo09_units의 인덱스 번호(kopo09_iNumVal의 인덱스
														// 번호로도 사용)

		kopo09_sNumVal_Index = 0; // 앞에서부터 시작
		kopo09_units_Index = kopo09_sNumVal.length() - 1; // 단위는 뒤부터 시작. 인덱스번호이므로 kopo09_sNumVal.length()-1

		while (true) { // 반복문
			if (kopo09_sNumVal_Index >= kopo09_sNumVal.length())
				break; // 다 읽었으면 반복문 탈출

			// kopo09_numbers만 사용 시
			// kopo09_iNumVal의 앞에서 부터 사용된 숫자와 숫자 호칭 출력
			// kopo09_numbers와 kopo09_units를 사용한 숫자 읽기
			if (Integer.parseInt(kopo09_sNumVal) == 0) { // 만약에 값이 0이면
				return kopo09_numbers[0]; // "영"을 리턴
			}
			if (kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index + 1).equals("0")) { // 앞에서부터 kopo09_sNumVal_Index번째의값이 0인 경우

				if (kopo09_sNumVal.length() > kopo09_units_Index + 4 && // 억의 존재확인(존재시 true)
						kopo09_units[kopo09_units_Index].equals("만") && // 만단위의 숫자 확인(맞을 시 true)
						Integer.parseInt(kopo09_sNumVal.substring(
								kopo09_sNumVal_Index - (kopo09_sNumVal.length() - kopo09_units_Index - 2),
								kopo09_sNumVal_Index + 1)) == 0) { // 만의 해당하는 값이 0 이면 true. 모든 조건을 만족하면 출력x
				} else if (kopo09_units[kopo09_units_Index].equals("만")
						|| kopo09_units[kopo09_units_Index].equals("억")) { // 읽고 있는 숫자 단위가 만이랑 억이면
					kopo09_result = kopo09_result + "" + kopo09_units[kopo09_units_Index]; // 만 또는 억을 결과에 String으로 저장
				} // 읽고 있는 숫자 단위가 만이랑 억이 아닌 경우 출력할 필요x
			} else { // 앞에서부터 kopo09_sNumVal_Index번째의 값이 0이 아닌 경우
				kopo09_result = kopo09_result
						+ kopo09_numbers[Integer
								.parseInt(kopo09_sNumVal.substring(kopo09_sNumVal_Index, kopo09_sNumVal_Index + 1))]
						+ kopo09_units[kopo09_units_Index]; // kopo09_numbers에서 해당하는 값 가져오기
			}
			kopo09_sNumVal_Index++; // 다음 숫자를 읽기 위해 +1
			kopo09_units_Index--; // 다음 단위로 넘기기 위해 -1
		}
		return kopo09_result; // 결과 출력
	}
}
