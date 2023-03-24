package Lesson6;

import java.text.SimpleDateFormat; // 날짜 형식
import java.util.Calendar; // 날짜

public class InputData2 extends InputData { // InputData를 상속받음
	InputData2() { // 기본 생성자
		this(30); // 30명으로 설정
	}

	InputData2(int kopo09_num) { // 인원수를 받은 생성자
		super(kopo09_num); // InputData의 내용을 받아옴
		for (int kopo09_i = 0; kopo09_i < kopo09_num; kopo09_i++) { // 인원 수 만큼
			String kopo09_name = String.format("홍길%02d", kopo09_i); // 이름
			int kopo09_kor = (int) (Math.random() * 100); // 국어
			int kopo09_eng = (int) (Math.random() * 100); // 영어
			int kopo09_mat = (int) (Math.random() * 100); // 수학
			SetData(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat); // 번호, 이름, 국어, 영어, 수학 정보를 저장. 총점, 평균도 구해서 저장
		}
	}

	void title() { // 타이틀 생성
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 출력시간
		System.out.printf("%20s\n\n", "성적 집계표"); // 머리말
		System.out.printf("%40s\n", "출력일자 : " + kopo09_sdf.format(kopo09_current.getTime())); // 출력일자
		System.out.printf("====================================================\n");
		System.out.printf("번호   이름     국어   영어   수학     총점     평균\n"); // 속성
		System.out.printf("====================================================\n");
	}

	void grade(int kopo09_i) { // 해당 번호의 성적 출력
		System.out.printf("%03d %7s %6d %6d %6d %8d %8d\n", kopo09_i + 1, kopo09_name[kopo09_i], kopo09_kor[kopo09_i],	// 번호, 이름, 국어
				kopo09_eng[kopo09_i], kopo09_mat[kopo09_i], kopo09_sum[kopo09_i], (int) kopo09_ave[kopo09_i]);	// 영어, 수학, 총점, 평균 출력
	}

	void statistic(int kopo09_first, int kopo09_end) { // first부터 end까지의 합계, 평균 출력
		int kopo09_korSum = 0;	// 국어 합계
		int kopo09_engSum = 0;	// 영어 합계
		int kopo09_matSum = 0;	// 수학 합계
		int kopo09_korAve = 0;	// 국어 평균
		int kopo09_engAve = 0;	// 영어 평균
		int kopo09_matAve = 0;	// 수학 평균
		int kopo09_allsum = 0;	// 모든 과목 합계
		int kopo09_allave = 0;	// 모든 과목 평균
		for (int kopo09_i = kopo09_first; kopo09_i < kopo09_end; kopo09_i++) { // first부터 end까지
			kopo09_korSum += this.kopo09_kor[kopo09_i];	// 국어 합계 구하기
			kopo09_engSum += this.kopo09_eng[kopo09_i];	// 영어 합계 구하기
			kopo09_matSum += this.kopo09_mat[kopo09_i];	// 수학 합계 구하기
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

}
