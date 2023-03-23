package Lesson6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MethodTest3 {
	// 값이 변하지 않는 전역변수로 선언
	public static final String[] kopo09_itemname = { "초코파이", "바나나우유", "건포도", "오렌지주스", "초코에몽", "마스크", "식용유1.8L",
			"컴포트그립가위", "무말랭이 150g", "홈런볼초코", "광어초밥", "철원 오대쌀10kg", "가나 다크밀크", "왕뚜껑 110g", "멸치액젓 500g", "가누다 침대",
			"가누다 베개", "버섯", "부산어묵", "김밥용 단무지", "가지", "[송월우산]CM 카이만 3단 자동 우산", "국내산 한돈돼지 목살 500g(구이용)", "케라시스 앰플 트리트",
			"푸르밀 미숫가루우유", "오뚜기 진비빔면 156g", "(달콤)순살닭강정(g)", "CJ 비비고칩 20g", "1+ 등급란 10개입 특", "물티슈 캡형", "포르쉐 718", "사과" }; // 구매
	public static final int[] kopo09_price = { 1000, 3600, 3300, 25000, 1000, 3000, 8500, 15900, 3880, 5850, 13584,
			31900, 1580, 1110, 2700, 3800000, 228000, 2980, 2780, 2180, 6990, 23800, 7120, 6950, 2980, 2750, 7920, 1990,
			3480, 16511, 96300000, 5000 }; // 구매 가격
	public static final int[] kopo09_num = { 1, 4, 1, 1, 10, 4, 1, 2, 2, 2, 1, 1, 10, 3, 2, 1, 2, 2, 3, 2, 1, 1, 3, 1,
			2, 3, 1, 1, 2, 2, 1, 20 }; // 구매 개수
	public static final boolean[] kopo09_taxfree = { true, true, false, true, true, false, false, false, true, false,
			false, true, false, false, true, false, false, true, false, true, true, false, false, false, false, false,
			false, false, true, false, false, true }; // 면세 유무
	public static final double kopo09_rate = 0.1; // 세액 10%

	// (변할 수 전역변수 선언)
	static int kopo09_xtax = 0; // 세금x 물품 총액
	static int kopo09_otax = 0; // 세금o 물품 총액

	// 메인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCount = 32;	// 출력할 항목 개수
		TitlePrint(); // 영수증 타이틀 인쇄
		TimeStemp(); // 출력시간 인쇄
		HeaderPrint(); // 헤더(상품명,단가,수량,금액)인쇄
		for (int kopo09_i = 0; kopo09_i < itemCount; kopo09_i++) {	// 항목 개수만큼 해당 항목 출력
			ItemPrint(kopo09_i);
		}
		TotalPrint();	// 모든 상품에 대한 합계 세액 인쇄

	}
	
	// 출력할 항목 개수
	public static void TitlePrint() {
		// TODO Auto-generated method stub
		System.out.printf("%33s\n", "이마트 죽전점(031)888-1234"); // 머리말
		System.out.printf("%9s%20s\n", "emart", "206-86-50913 강희석");
		System.out.printf("%28s\n", "용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n"); // 교환/환불 정보
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
	}
	
	// 출력시간 인쇄
	public static void TimeStemp() {
		// TODO Auto-generated method stub
		SimpleDateFormat kopo09_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 현재시간
		System.out.printf("[구 매]%s %17s\n", kopo09_sdf1.format(kopo09_current.getTime()), "POS:0011-9861"); // 구매 시간
	}

	// 헤더(상품명,단가,수량,금액)인쇄
	public static void HeaderPrint() {
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%7s%14s%3s%8s\n", "상 품 명", "단 가", "수량", "금 액"); // 속성

	}

	// 항목번호에 따른 항목 인쇄
	public static void ItemPrint(int kopo09_i) {
		if (kopo09_i < 32) {
			DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
			String kopo09_newText = ""; // 상품명 변경용(상품명의 빈칸을 채우거나 자르기)

			if (kopo09_i % 5 == 0) { // 물품 5개 마다 구분(자르기)
				System.out.printf("-----------------------------------------\n");
			}

			if (kopo09_taxfree[kopo09_i]) { // 세금x 물품에 대해
				kopo09_newText = "* " + kopo09_itemname[kopo09_i]; // 물품에 따로 *표시

			} else { // 세금o 물품에 대해
				kopo09_newText = "  " + kopo09_itemname[kopo09_i]; // 공백2개 추가
			}
			System.out.printf("%s%11s%3.2s%11s\n", makeText(kopo09_newText), kopo09_df.format(kopo09_price[kopo09_i]),
					kopo09_df.format(kopo09_num[kopo09_i]),
					kopo09_df.format(kopo09_price[kopo09_i] * kopo09_num[kopo09_i])); // 상품정보(상품명, 단가, 수량, 금액) 출력
		}
	}
	
	// 모든 상품에 대한 합계 세액 인쇄
	public static void TotalPrint() {
		// TODO Auto-generated method stub
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		int kopo09_count = 0; // 품목 개수 세기

		for (; kopo09_count < kopo09_itemname.length; kopo09_count++) { // 모든 구매 항목에 대해 합계 등을 구하기
			String kopo09_newText = ""; // 상품명 변경용(상품명의 빈칸을 채우거나 자르기)

			if (kopo09_taxfree[kopo09_count]) { // 세금x 물품에 대해
				kopo09_xtax += kopo09_price[kopo09_count] * kopo09_num[kopo09_count]; // 해당 물품의 총액을 세금x 모든 물품의 총액에 추가

			} else { // 세금o 물품에 대해
				kopo09_otax += kopo09_price[kopo09_count] * kopo09_num[kopo09_count]; // 해당 물품의 총액을 세금o 모든 물품의 총액에 추가
			}
		}

		int kopo09_taxex = (int) (kopo09_otax / (1 + kopo09_rate)); // 과세물품중 부가세 제외한 가격
		int kopo09_vat = kopo09_otax - kopo09_taxex; // 부가세

		System.out.printf("\n%22s%14d\n", "총 품목 수량", kopo09_count); // 총 품목 수량
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", kopo09_df.format(kopo09_xtax)); // 면세물품 총합
		System.out.printf("%23s%14s\n", "과 세  물 품", kopo09_df.format(kopo09_taxex)); // 과세물품 총합
		System.out.printf("%24s%14s\n", "부   가   세", kopo09_df.format(kopo09_vat)); // 부가세
		System.out.printf("%25s%14s\n", "합        계", kopo09_df.format(kopo09_xtax+kopo09_otax)); // 총 금액
		System.out.printf("%s%24s\n", "결 제 대 상 금 액", kopo09_df.format(kopo09_xtax+kopo09_otax)); // 총 금액
	}	

	// 글자 크기를 맞추기 위한 공백 생성 또는 자르기, 유니코드 사용
	public static String makeText(String kopo09_word) {
		int kopo09_ichar = 0; // kopo09_ichar은 문자열에서 문자를 하나씩 자를때 int형으로 저장해놓기 위한 변수
		int kopo09_space = 16; // 남은 공간
		String kopo09_newWord = ""; // 새롭게 만들 문자열
		for (int kopo09_i = 0; kopo09_i < kopo09_word.length(); kopo09_i++) { // 문자열의 모든 문자에 대해서
			kopo09_ichar = (int) kopo09_word.charAt(kopo09_i); // 문자를 int로 저장. 유니코드로 비교하기 위함.
			if (kopo09_ichar >= 44032 && kopo09_ichar <= 55215) { // 한글이면 공간 2칸 차지
				kopo09_space -= 2;
			} else if (4352 <= kopo09_ichar && kopo09_ichar <= 4607) { // 자음만 있으면 공간 2칸 차지
				kopo09_space -= 2;
			} else if (12592 <= kopo09_ichar && kopo09_ichar <= 12687) { // 모음만 있으면 공간 2칸 차지
				kopo09_space -= 2;
			} else { // 그 외 1칸 차지
				kopo09_space--;
			}

			if (kopo09_space > 0) { // 공간이 남았으면
				kopo09_newWord += kopo09_word.charAt(kopo09_i); // 해당 문자 추가
			} else if (kopo09_space == -1) { // 한글로 인해 -1이 되면
				kopo09_newWord += " "; // 빈공간 추가 후
				return kopo09_newWord; // 반환
			} else { // 그외의 빈공간이 없으면
				kopo09_newWord += kopo09_word.charAt(kopo09_i); // 마지막 문자 추가 후
				return kopo09_newWord; // 반환
			}
		} // 공간이 부족한 경우는 위에서 이미 종료

		// 공간이 남으면
		for (int kopo09_i = 0; kopo09_i < kopo09_space; kopo09_i++) { // 남은 공간 만큼
			kopo09_newWord += " "; // 공백 추가
		}
		return kopo09_newWord; // 변환된 단어를 값으로 돌려줌
	}
}
