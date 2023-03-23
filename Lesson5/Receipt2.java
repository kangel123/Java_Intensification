package Lesson5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		receipt2();
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

		double rate = 0.1; // 세액 10%
		int kopo09_iPrice = kopo09_price1 * kopo09_amount1 + kopo09_price2 * kopo09_amount2 + kopo09_price3 * kopo09_amount3; // 합계
		int kopo09_amount = (int) (kopo09_iPrice / (1 + rate)); // 금액
		int kopo09_vat = kopo09_iPrice - kopo09_amount; // 부가세

		// 영수증 출력 시작
		System.out.printf("%24s\n", "\"국민가게, 다이소\""); // 다이소 가게 정보(이름, 전화번호, 주소 등)
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("=========================================\n"); // 인증 정보
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
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname1, kopo09_df.format(kopo09_price1), kopo09_amount1, kopo09_df.format(kopo09_price1 * kopo09_amount1)); // 첫번째 항목(상품명, 가격, 구매 개수, 총 가격)
		System.out.printf("[%s]\n", kopo09_itemcode1); // 상품번호
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname2, kopo09_df.format(kopo09_price2), kopo09_amount2, kopo09_df.format(kopo09_price2 * kopo09_amount2)); // 두번째 항목(상품명, 가격, 구매 개수, 총 가격)
		System.out.printf("[%s]\n", kopo09_itemcode2); // 상품번호
		System.out.printf("%.8s %10s %2d %10s\n", kopo09_itemname3, kopo09_df.format(kopo09_price3), kopo09_amount3, kopo09_df.format(kopo09_price3 * kopo09_amount3)); // 세번째 항목(상품명, 가격, 구매 개수, 총 가격)
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
}
