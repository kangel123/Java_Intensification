package Lesson7;

import java.text.DecimalFormat;

public class check {	// 계산 결과 확인

	// 영수증
	static String[] kopo09_OneRex = { 
			"01 초코파이            1,000  1      1,000", "02 바나나우유          3,600  4     14,400",
			"03 건포도              3,300  1      3,300", "04 오렌지주스         25,000  1     25,000",
			"05 초코에몽            1,000 10     10,000", "06 마스크              3,000  4     12,000",
			"07 식용유1.8L          8,500  1      8,500", "08 컴포트그립가위     15,900  2     31,800",
			"09 무말랭이 150g       3,880  2      7,760", "10 홈런볼초코          5,850  2     11,700",
			"11 광어초밥           13,584  1     13,584", "12 철원 오대쌀10k     31,900  1     31,900",
			"13 가나 다크밀크       1,580 10     15,800", "14 왕뚜껑 110g         1,110  3      3,330",
			"15 멸치액젓 500g       2,700  2      5,400", "16 가누다 침대     3,800,000  1  3,800,000",
			"17 가누다 베개       228,000  2    406,000", "18 버섯                2,980  2      5,960",
			"19 부산어묵            2,780  3      8,340", "20 김밥용 단무지       2,180  2      4,360",
			"21 가지                6,990  1      6,990", "22 [송월우산]CM       23,800  1     23,800",
			"23 국내산 한돈돼       7,120  3     21,360", "24 케라시스 앰플       6,950  1      6,950",
			"25 푸르밀 미숫가       2,980  2      5,960", "26 오뚜기 진비빔       2,750  3      8,250",
			"27 (달콤)순살닭강      7,920  1      7,920", "28 CJ 비비고칩 20      1,990  1      1,990",
			"29 1, 등급란 10개      3,480  2      6,960", "30 물티슈 캡형        16,511  2     33,002",
			"31 포르쉐 718     96,300,000  1 96,300,000", "32 사과                5,000 20    100,000" };

	public static void main(String[] args) {
		for (int kopo09_i = 0; kopo09_i < kopo09_OneRex.length; kopo09_i++) { // 모든 물건에 대해
			checkSum(kopo09_i); // 계산 오류인 부분 확인 가능
		}
	}

	// 문자열 내 숫자 재정리 + 계산 확인
	public static void checkSum(int num) {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		int kopo09_price = 0, kopo09_count = 0, kopo09_sum = 0; // 물건 가격, 개수, 합계는 모두 0으로 초기화

		// 물건 가격 재정리, 천만단위까지만 생각
		int kopo09_unit = 0; // 물건 가격을 위해 0으로 초기화. unit은 단위로 물건 가격, 개수, 합계에 모두 사용할 예정.
		for (int kopo09_i = 27; kopo09_i > 17; kopo09_i--) { // 물건 가격의 뒤에서 앞부분까지
			if (kopo09_i == 20 || kopo09_i == 24) { // ","에 해당되는 byte는 제외
			} else { // ","가 아닐 때
				String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); // 해당 byte를 string으로 전환
				if (!kopo09_sNum.equals(" ")) { // 공백이 아니면
					kopo09_price += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit)); // 숫자로 변환 후 단위에 맞게 추가
					kopo09_unit++; // 단위 증가
				}
			}
		}

		// 개수 재정리, 2자리까지만 생각
		kopo09_unit = 0; // 개수의 단위를 위해 초기화
		for (int kopo09_i = 30; kopo09_i > 28; kopo09_i--) { // 개수의 뒤에서 앞부분까지

			String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); //
			if (!kopo09_sNum.equals(" ")) {
				kopo09_count += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit));
				kopo09_unit++;
			}

		}

		// 합계 재정리, 천만단위까지만 생각
		kopo09_unit = 0; // 합계의 단위를 위해 초기화
		for (int kopo09_i = 41; kopo09_i > 30; kopo09_i--) {// 합계의 뒤에서 앞부분까지
			if (kopo09_i == 34 || kopo09_i == 38) { // ","에 해당되는 byte는 제외
			} else { // ","가 아닐 때
				String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); // 해당 byte를 string으로 전환
				if (!kopo09_sNum.equals(" ")) { // 공백이 아니면
					kopo09_sum += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit)); // 숫자로 변환 후 단위에 맞게 추가
					kopo09_unit++; // 단위 증가
				}
			}
		}

		// 계산 확인
		if (kopo09_price * kopo09_count == kopo09_sum) { // 계산이 맞다면
			System.out.printf("*********************\n"); // 해당 출력
		} else { // 계산이 틀리면
			System.out.printf("오류[%s  %s]\n", new String(kopo09_OneRex[num].getBytes(), 0, 2),
					new String(kopo09_OneRex[num].getBytes(), 2, 40));	// 오류 메시지 출력
			System.out.printf("수정[%s  %s%11s]\n", new String(kopo09_OneRex[num].getBytes(), 0, 2),
					new String(kopo09_OneRex[num].getBytes(), 2, 29), kopo09_df.format(kopo09_price * kopo09_count));	// 수정 시 변경 값으로 출력
		}
	}
}