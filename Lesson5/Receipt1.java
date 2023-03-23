package Lesson5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		receipt1();
	}

	// 한양김치찌개 영수증, 글자크기 10
	public static void receipt1() {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // 숫자형식 객체 생성
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_cal = Calendar.getInstance(); // 현재시간

		int kopo09_iPrice = 33000; // 합계
		double kopo09_rate = 0.1; // 세액 10%
		int kopo09_amount = (int) (kopo09_iPrice / (1 + kopo09_rate)); // 금액
		int kopo09_vat = kopo09_iPrice - kopo09_amount; // 부가세

		// 영수증 출력 시작
		System.out.printf("신용승인\n"); // 머리글
		System.out.printf("단말기 : 2N68665898    전표번호 : 041218\n"); // 가맹점 정보(단말기, 이름, 주소, 대표자 등)
		System.out.printf("가맹점 : 한양김치찌개\n");	// 가맹점
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 1층\n");	// 주소
		System.out.printf("대표자 : 유창신\n");	// 대표자
		System.out.printf("사업자 : 753-53-00558      TEL : 7055695\n");	// 사업자
		System.out.printf("- - - - - - - - - - - - - - - - - - - - \n");	// 구분
		System.out.printf("금 액 %31s 원\n", kopo09_df.format(kopo09_amount)); // 계산 내역 (금액, 부가세, 합계)
		System.out.printf("부가세 %30s 원\n", kopo09_df.format(kopo09_vat));
		System.out.printf("합 계 %31s 원\n", kopo09_df.format(kopo09_iPrice));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - \n");	// 구분
		System.out.printf("우리카드\n"); // 소비자 카드 정보(카드정보, 거래일자, 승인번호, 거래번호 등)
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
}
