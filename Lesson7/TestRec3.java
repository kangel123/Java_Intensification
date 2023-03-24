package Lesson7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class TestRec3 {

	static ArrayList<OneRec2> kopo09_AOR = new ArrayList<OneRec2>();

	static int kopo09_sumkor = 0; // 국어 총점
	static int kopo09_sumeng = 0; // 영어 총점
	static int kopo09_summat = 0; // 수학 총점
	static int kopo09_sumsum = 0; // 과목 총점
	static int kopo09_sumave = 0; // 과목 평균
	static final int kopo09_iPerson = 200; // 사람 수는 200으로 고정
	static final int kopo09_division = 30;	// 한 페이지에 30명씩
	
	public static void dataSet() { // 데이터 만들어 어레이리스트에 넣기
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // 모든 사람들에 대해
			String kopo09_name = String.format("홍길%02d", kopo09_i); // 이름 만들기
			int kopo09_kor = (int) (Math.random() * 100); // 국어 점수 만들기
			int kopo09_eng = (int) (Math.random() * 100); // 영어 점수 만들기
			int kopo09_mat = (int) (Math.random() * 100); // 수학 점수 만들기
			kopo09_AOR.add(new OneRec2(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat));
		}
	}

	public static void HeaderPrint(int kopo09_num) { // 헤더 인쇄
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 출력시간
		System.out.printf("%20s\n\n", "성적 집계표"); // 머리말
		System.out.printf("%s%40s\n", "PAGE : " + (kopo09_num + 1), "출력일자 : " + kopo09_sdf.format(kopo09_current.getTime())); // 현재페이지, 출력일자
		
		System.out.printf("=====================================================\n");
		System.out.printf("%2s %4s  %5s %5s %5s %5s   %s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("=====================================================\n");
	}

	public static void itemPrint(int kopo09_i) { // 해당 번호의 사람의 정보 인쇄
		OneRec2 kopo09_rec; // 객체 생성
		kopo09_rec = kopo09_AOR.get(kopo09_i); // 객체에 해당 번호의 사람 정보를 가져옴
		System.out.printf(" %3d %5s %6d %7d %7d   %5d  %6.2f\n", kopo09_rec.student_id(), kopo09_rec.name(),
				kopo09_rec.kor(), kopo09_rec.eng(), kopo09_rec.mat(), kopo09_rec.sum(), kopo09_rec.ave());	// 정보 출력
		kopo09_sumkor += kopo09_rec.kor(); // 국어총점
		kopo09_sumeng += kopo09_rec.eng(); // 영어총점
		kopo09_summat += kopo09_rec.mat(); // 수학총점
		kopo09_sumsum += kopo09_rec.sum(); // 과목총점
		kopo09_sumave += kopo09_rec.ave(); // 과목평균
	}

	public static void statistic(int kopo09_first, int kopo09_end) { // first부터 end까지의 합계, 평균 출력
		System.out.printf("====================================================\n");
		System.out.printf("현재 페이지\n");
		int kopo09_korSum = 0;	// 국어 합계
		int kopo09_engSum = 0;	// 영어 합계
		int kopo09_matSum = 0;	// 수학 합계
		int kopo09_korAve = 0;	// 국어 평균
		int kopo09_engAve = 0;	// 영어 평균
		int kopo09_matAve = 0;	// 수학 평균
		int kopo09_allsum = 0;	// 모든 과목 합계
		int kopo09_allave = 0;	// 모든 과목 평균

		OneRec2 kopo09_rec; // 객체 생성
		for (int kopo09_i = kopo09_first; kopo09_i < kopo09_end; kopo09_i++) { // first부터 end까지
			kopo09_rec = kopo09_AOR.get(kopo09_i); // 객체에 해당 번호의 사람 정보를 가져옴
			kopo09_korSum += kopo09_rec.kor();	// 국어 합계 구하기
			kopo09_engSum += kopo09_rec.eng();	// 영어 합계 구하기
			kopo09_matSum += kopo09_rec.mat();	// 수학 합계 구하기
		}
		
		kopo09_korAve = kopo09_korSum / (kopo09_end - kopo09_first);	// 국어 평균 구하기
		kopo09_engAve = kopo09_engSum / (kopo09_end - kopo09_first);	// 영어 평균 구하기
		kopo09_matAve = kopo09_matSum / (kopo09_end - kopo09_first);	// 수학 평균 구하기
		kopo09_allsum = kopo09_korSum + kopo09_engSum + kopo09_matSum;	// 모든 과목 합계
		kopo09_allave = kopo09_allsum / 3;	// 모든 과목 평균
		System.out.printf("합계 %15d %6d %6d% 9d %8d\n", kopo09_korSum, kopo09_engSum, kopo09_matSum, kopo09_allsum, kopo09_allave);	// 합계 정보들 출력
		System.out.printf("평균 %15d %6d %6d% 9d %8d\n", kopo09_korAve, kopo09_engAve, kopo09_matAve, kopo09_allsum / (kopo09_end - kopo09_first),
				kopo09_allave / (kopo09_end - kopo09_first));	// 평균 정보들 출력
	
	}

	public static void TailPrint(int kopo09_num) {	// 처음부터 end까지의 합계, 평균 출력
		System.out.printf("====================================================\n");

		System.out.printf("누계 페이지\n");
		System.out.printf("합계 %15d %6d %6d% 9d %8d\n", kopo09_sumkor, kopo09_sumeng, kopo09_summat, kopo09_sumsum, kopo09_sumave);	// 합계 정보들 출력
		System.out.printf("평균 %15d %6d %6d% 9d %8d\n", kopo09_sumkor/kopo09_num, kopo09_sumeng/kopo09_num, kopo09_summat/kopo09_num, kopo09_sumsum/kopo09_num, kopo09_sumave/kopo09_num);	// 평균 정보들 출력
	
	}

	public static void main(String[] args) {
		dataSet();	// 데이터 생성
		int kopo09_i = 0;
		for (; kopo09_i < kopo09_AOR.size(); kopo09_i++) {	// 모든 사람에 대해
			if(kopo09_i%kopo09_division==0) {
				HeaderPrint(kopo09_i/kopo09_division);	// 헤더인쇄
			}
			itemPrint(kopo09_i);	// 정보 출력
			if((kopo09_i+1)%kopo09_division==0) {
				statistic(kopo09_i-29,kopo09_i+1);
				TailPrint(kopo09_i+1);
			}
		}
		statistic(kopo09_i/kopo09_division*kopo09_division, kopo09_i);	// 남은 학생의 대한 총점과 평균 출력
		TailPrint(kopo09_i);	// 모든 학생 총점과 평균 출력
	}
}
