package Lesson5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		receipt1();
//		receipt2();
		receipt3();
	}

	// 한양김치찌개 영수증, 글자크기 10
	public static void receipt1() {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_cal = Calendar.getInstance(); // 현재시간

		int kopo09_iPrice = 33000; // 합계
		float kopo09_rate = 0.1f; // 세액 10%
		int kopo09_amount = (int) (kopo09_iPrice / (1 + kopo09_rate)); // 금액
		int kopo09_vat = kopo09_iPrice - kopo09_amount; // 부가세

		// 영수증 출력 시작
		System.out.printf("신용승인\n"); // 머리글
		System.out.printf("단말기 : 2N68665898    전표번호 : 041218\n"); // 가맹점 정보(단말기, 이름, 주소, 대표자 등)
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 753-53-00558       TEL: 7055695\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - \n");
		System.out.printf("금 액 %31s 원\n", kopo09_df.format(kopo09_amount)); // 계산 내역 (금액, 부가세, 합계)
		System.out.printf("부가세 %30s 원\n", kopo09_df.format(kopo09_vat));
		System.out.printf("합 계 %31s 원\n", kopo09_df.format(kopo09_iPrice));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - \n");
		System.out.printf("우리카드\n"); // 소비자 카드 정보(카드정보, 거래일자, 거래번호 등)
		System.out.printf("카드번호 : 5387-20**-****-4613(S) 일시불\n");
		System.out.printf("거래일시 : %s\n", kopo09_sdf.format(kopo09_cal.getTime())); // 현재시간을 형식에 맞춰 출력
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사   가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - \n"); // 바닥글
		System.out.printf("              * 감사합니다 *\n");
		System.out.printf("%38s\n", "표준V2.08_20200212");
		// 영수증 출력 종료
	}

	// 다이소 영수증, 글자크기 10
	public static void receipt2() {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 현재시간
		Calendar kopo09_future = Calendar.getInstance(); // 교환/환불 기간
		kopo09_future.add(Calendar.DAY_OF_MONTH, 14); // 14일 후

		// 첫번째 항목 정보(상품명, 상품번호, 가격, 구매 개수)
		String kopo09_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String kopo09_itemcode1 = "1031615";
		int kopo09_price1 = 3000;
		int kopo09_amount1 = 1;

		// 두번째 항목 정보(상품명, 상품번호, 가격, 구매 개수)
		String kopo09_itemname2 = "슬라이드식명찰(가로형)(100호)";
		String kopo09_itemcode2 = "11008152";
		int kopo09_price2 = 1000;
		int kopo09_amount2 = 1;

		// 세번째 항목 정보(상품명, 상품번호, 가격, 구매 개수)
		String kopo09_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String kopo09_itemcode3 = "1020800";
		int kopo09_price3 = 10000;
		int kopo09_amount3 = 50;

		float rate = 0.1f; // 세액 10%
		int kopo09_iPrice = kopo09_price1 * kopo09_amount1 + kopo09_price2 * kopo09_amount2
				+ kopo09_price3 * kopo09_amount3; // 합계
		int kopo09_amount = (int) (kopo09_iPrice / (1 + rate)); // 금액
		int kopo09_vat = kopo09_iPrice - kopo09_amount; // 부가세

		// 영수증 출력 시작
		System.out.printf("%24s\n", "\"국민가게, 다이소\""); // 다이소 가게 정보(이름, 전화번호, 주소 등)
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("========================================\n"); // 인증 정보
		System.out.printf("%24s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%26s\n", "ISO 9001 품질경영시스템 인증기업");
		System.out.printf("========================================\n"); // 교환/환불 정보
		System.out.printf("%11s 14일(%d월 %d일)이내,\n", "교환/환불", kopo09_future.get(Calendar.MONTH) + 1,
				kopo09_future.get(Calendar.DATE)); // 교환/환불 날짜를 Calendar함수를 사용하여 표현
		System.out.printf("%23s\n", "(전자)영수증, 결제카드 지참 후");
		System.out.printf("%21s\n", "구입매장에서 가능");
		System.out.printf("   포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("     체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("========================================\n");
		System.out.printf("[POS 1058231] %26s\n", kopo09_sdf.format(kopo09_current.getTime())); // 현재 시간
		System.out.printf("========================================\n"); // 구매 물품
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname1, kopo09_df.format(kopo09_price1), kopo09_amount1,
				kopo09_df.format(kopo09_price1 * kopo09_amount1)); // 첫번째 항목(상품명, 가격, 구매 개수, 총 가격)
		System.out.printf("[%s]\n", kopo09_itemcode1); // 상품번호
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname2, kopo09_df.format(kopo09_price2), kopo09_amount2,
				kopo09_df.format(kopo09_price2 * kopo09_amount2)); // 두번째 항목(상품명, 가격, 구매 개수, 총 가격)
		System.out.printf("[%s]\n", kopo09_itemcode2); // 상품번호
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname3, kopo09_df.format(kopo09_price3), kopo09_amount3,
				kopo09_df.format(kopo09_price3 * kopo09_amount3)); // 세번째 항목(상품명, 가격, 구매 개수, 총 가격)
		System.out.printf("[%s]\n", kopo09_itemcode3); // 상품번호
		System.out.printf("%17s %18s\n", "과세합계", kopo09_df.format(kopo09_amount)); // 과세합계
		System.out.printf("%18s %18s\n", "부가세", kopo09_df.format(kopo09_vat)); // 부가세
		System.out.printf("----------------------------------------\n");
		System.out.printf("판매합계 %31s\n", kopo09_df.format(kopo09_iPrice)); // 판매합계
		System.out.printf("========================================\n");
		System.out.printf("신용카드 %31s\n", kopo09_df.format(kopo09_iPrice)); // 계산 완료
		System.out.printf("========================================\n");
		System.out.printf("우리카드 %31s\n", "538720**********"); // 소비자 카드 정보
		System.out.printf("승인번호77982843(0) %16s\n", "승인금액 " + kopo09_df.format(kopo09_iPrice)); // 승인번호, 승인금액
		System.out.printf("========================================\n");
		System.out.printf("%29s 분당서현점\n", kopo09_sdf.format(kopo09_current.getTime())); // 그외의 정보
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("      |||||||||||||| || || ||| |||||\n");
		System.out.printf("      |||||||||||||| || || ||| |||||\n");
		System.out.printf("%29s\n", "2112820610158231");
		System.out.printf("----------------------------------------\n");
		System.out.printf("◈다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요!◈"); // 바닥글
		// 영수증 출력력 종료
	}

	// 이마트 영수증, 글자크기 10
	public static void receipt3() {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 현재시간

		String[] kopo09_itemname = { "초코파이", "바나나우유", "건포도", "오렌지주스", "초코에몽", "마스크", "식용유1.8L", "컴포트그립가위", "무말랭이 150g",
				"홈런볼초코", "광어초밥", "철원 오대쌀10kg", "가나 다크밀크", "왕뚜껑 110g", "멸치액젓 500g", "가누다 가죽 침대", "가누다 베개", "버섯", "부산어묵", "김밥용 단무지", "가지"}; // 구매 상품명
		int[] kopo09_price = { 1000, 3600, 3300, 25000, 1000, 3000, 8500, 15900, 3880, 5850, 13584, 31900, 1580, 1110 ,2700, 3800000, 228000, 2980, 2780, 2180, 6990}; // 구매 가격
		int[] kopo09_num = { 10, 4, 1, 1, 10, 4, 1, 2, 2, 2, 1, 1, 10,3, 2 ,1 ,2, 2, 3, 2, 1}; // 구매 개수
		boolean[] kopo09_taxfree = { true, true, false, true, true, false, false, false, true, false, false, true,
				false, false, true, false, false, true, false, true, true}; // 면세 유무

//		boolean[] kopo09_sale= {};	// 세일 유무
//		String[] kopo09_saleReason = {}; //세일 이유
//		String[] kopo09_saleCount = {}; //세일 금액

		int kopo09_count = 0; // 총 품목 수량
		float kopo09_rate = 0.1f; // 세액 10%
		int kopo09_xtax = 0; // 세금x 물품 총액
		int kopo09_otax = 0; // 세금o 물품 총액
		int kopo09_amount = 0; // 각 물건의 총 금액
		int kopo09_totalAmount = 0; // 모든 구매 물품 총액

		System.out.printf(" emart\n"); // 머리말
		System.out.printf("영수증 미지참시 교환/환불 불가\n"); // 교환/환불 정보
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참\n\n");
		System.out.printf("[구 매]%s %17s\n", kopo09_sdf.format(kopo09_current.getTime()), "POS:0011-9861"); // 구매 시간
		System.out.printf("-----------------------------------------\n"); // 계산서
		System.out.printf("%7s%14s%3s%6s\n", "상 품 명", "단 가", "수량", "금 액"); // 속성
		for (int i = 0; i < kopo09_itemname.length; i++) { // 모든 구매 항목에 대해
			kopo09_amount = kopo09_price[i] * kopo09_num[i]; // 각 물품의 총액을 따로 저장
			kopo09_totalAmount += kopo09_amount; // 총액에 추가
			kopo09_count += kopo09_num[i]; // 총 품목 수량 추가

			if (i % 5 == 0) { // 물품 5개 마다 구분(자르기)
				System.out.printf("-----------------------------------------\n");
			}

			if (kopo09_taxfree[i]) { // 세금x 물품에 대해
				kopo09_itemname[i] = "* " + kopo09_itemname[i]; // 물품에 따로 *표시
				kopo09_xtax += kopo09_amount; // 해당 물품의 총액을 세금x 모든 물품의 총액에 추가

			} else { // 세금o 물품에 대해
				kopo09_itemname[i] = "  " + kopo09_itemname[i]; // 공백2개 추가
				kopo09_otax += kopo09_amount; // 해당 물품의 총액을 세금o 모든 물품의 총액에 추가
			}
			System.out.printf("%s%11s%3d%11s\n", calByte(kopo09_itemname[i]), kopo09_df.format(kopo09_price[i]),
					kopo09_num[i], kopo09_df.format(kopo09_amount)); // calByte함수를 사용.
																		// 상품정보(상품명, 단가, 수량, 금액) 출력
		}

		int kopo09_taxInclude = (int) (kopo09_otax / (1 + kopo09_rate)); // 세금을 포함하는 과세물품의 총 금액
		int kopo09_vat = kopo09_otax - kopo09_taxInclude; // 부가세
		kopo09_otax -= kopo09_vat; // 세금을 제외한 과제물품

		System.out.printf("\n%20s%15d\n", "총 품목 수량", kopo09_count); // 총 품목 수량
		System.out.printf("%21s%15s\n", "(*)면 세  물 품", kopo09_df.format(kopo09_xtax)); // 면세물품 총합
		System.out.printf("%21s%15s\n", "과 세  물 품", kopo09_df.format(kopo09_otax)); // 과세물품 총합
		System.out.printf("%22s%15s\n", "부   가   세", kopo09_df.format(kopo09_vat)); // 부가세
		System.out.printf("%23s%15s\n", "합        계", kopo09_df.format(kopo09_totalAmount)); // 총 금액
		System.out.printf("%s%23s\n", "결 제 대 상 금 액", kopo09_df.format(kopo09_totalAmount)); // 총 금액
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%27s\n", "0012 KEB 하나", "541707**0484/35860658"); // 결제 내역
		System.out.printf("%s%25s\n", "카드결제(IC)", "일시불 / " + kopo09_df.format(kopo09_totalAmount));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21s\n", "[신세계포인트 적립]"); // 소비자 포인트 정보
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("%s%18s%8d\n", "금회발생포인트", "9350**9995", 164);
		System.out.printf("%s%24s\n", "누계(가용)포인트", "5,637(     5473)");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여"); // 소비자 차량 정보
		System.out.printf("%s%28s\n", "차량번호 : ", "34저****");
		System.out.printf("%s%29s\n", "입차시간 : ", "2021-03-03 20:20:04");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%24s\n", "캐셔:084599 양00", "1150"); // 캐셔(마트에서 물건 계산해 주시는 분) 정보
		System.out.printf("     ||||||| | |||| || || || ||| |||||\n"); // 간이 바코드
		System.out.printf("     ||||||| | |||| || || || ||| |||||\n");
		System.out.printf("%35s\n", "20210303/00119861/00164980/31");

	}

	// 글자 크기를 맞추기 위한 공백 생성, 유니코드 사용
	public static String calByte(String kopo09_word) {
		int kopo09_ichar, kopo09_ibyte = 0; // kopo09_ichar은 문자열에서 문자를 하나씩 자를때 int형으로 저장해놓기 위한 변수,
		int kopo09_max = 15; // 최대 공간 개수(Byte라고 생각)
		int kopo09_space = 15; // 남은 공간
		String kopo09_newWord = ""; // 새롭게 만들 문자열
		for (int kopo09_i = 0; kopo09_i < kopo09_word.length(); kopo09_i++) { // 문자열의 모든 문자에 대해서
			kopo09_ichar = (int) kopo09_word.charAt(kopo09_i); // 문자를 int로 저장. 유니코드로 비교하기 위함.
			if (kopo09_ichar >= 44032 && kopo09_ichar <= 55215) { // 한글이면 공간 2칸 차지
				kopo09_ibyte += 2;
				kopo09_space -= 2;
				
			} else if (4352 <= kopo09_ichar && kopo09_ichar <= 4607) { // 자음만 있으면 공간 2칸 차지
				kopo09_ibyte += 2;
				kopo09_space -= 2;
				
			} else if (12592 <= kopo09_ichar && kopo09_ichar <= 12687) { // 모음만 있으면 공간 2칸 차지
				kopo09_ibyte += 2;
				kopo09_space -= 2;
				
			} else { // 그 외 +1
				kopo09_ibyte++;
				kopo09_space--;
			}
			if(kopo09_space>0) {	// 공간이 남았으면 
				kopo09_newWord += kopo09_word.charAt(kopo09_i);	// 해당 문자 추가
			} else if(kopo09_space==-1) {	// 한글로 인해 -1이 되면
				kopo09_newWord+=" ";	// 빈공간 추가 후
				return kopo09_newWord;	//반환
			} else {	// 그외의 빈공간이 없으면
				kopo09_newWord += kopo09_word.charAt(kopo09_i);	// 마지막 문자 추가 후
				return kopo09_newWord;	// 반환
			}
		}
		
		if (kopo09_max - kopo09_ibyte > 0) { // 글자 수가 부족하면
			for (int kopo09_i = 0; kopo09_i < kopo09_max - kopo09_ibyte; kopo09_i++) { // 부족한 글자 수 만큼
				kopo09_newWord += " "; // 공백 추가
			}
		} // 글자 수가 부족하지 않으면 그대로

		return kopo09_newWord; // 변환된 단어를 값으로 돌려줌
	}
}
