package Lesson6;

import java.text.SimpleDateFormat; // 날짜 형식
import java.util.Calendar; // 날짜

public class InputData3 extends InputData2 { // InputData2의 상속을 받음
	InputData3() { // 기본 생성자
		this(200); // 200명으로 설정
	}

	InputData3(int kopo09_num) { // 인원수를 받은 생성자
		super(kopo09_num); // InputData의 내용을 받아옴
		for (int kopo09_i = 0; kopo09_i < kopo09_num; kopo09_i++) { // 인원 수 만큼
			String kopo09_name = String.format("홍길%02d", kopo09_i); // 이름
			int kopo09_kor = (int) (Math.random() * 100); // 국어
			int kopo09_eng = (int) (Math.random() * 100); // 영어
			int kopo09_mat = (int) (Math.random() * 100); // 수학
			SetData(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat); // 번호, 이름, 국어, 영어, 수학 정보를 저장. 총점, 평균도 구해서 저장
		}
	}

	void title(int kopo09_num) {	// 타이틀 생성. kopo09_num은 페이지
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜, 시간 형식 객체 생성
		Calendar kopo09_current = Calendar.getInstance(); // 출력시간
		System.out.printf("%20s\n\n", "성적 집계표"); // 머리말
		System.out.printf("%s%40s\n", "PAGE : " + (kopo09_num + 1), "출력일자 : " + kopo09_sdf.format(kopo09_current.getTime())); // 현재페이지, 출력일자
		System.out.printf("====================================================\n");
		System.out.printf("번호   이름     국어   영어   수학     총점     평균\n"); // 속성
		System.out.printf("====================================================\n");
	}

	void statistic(int kopo09_first, int kopo09_end) { // first부터 end까지의 합계, 평균 출력
		System.out.printf("====================================================\n");
		System.out.printf("현재 페이지\n");
		super.statistic(kopo09_first, kopo09_end);	// InputData2의 statistic메소드와 동일하게 실행
	}

	void total(int kopo09_end) {	// 처음부터 end까지의 합계, 평균 출력
		System.out.printf("====================================================\n");

		System.out.printf("누계 페이지\n");
		super.statistic(0, kopo09_end);	// InputData2의 statistic메소드와 동일하게 실행
	}
}
